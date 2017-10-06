/**
 * Copyright (c) 2017 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Sebastian Kunz - initial implementation
 */

package drm.contentprovider.controller;

import drm.contentprovider.model.XmlFormResult;
import drm.contentprovider.service.LicenseService;
import drm.contentprovider.util.XmlConverter;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.xml.bind.JAXBException;

import static org.slf4j.LoggerFactory.getLogger;

@Controller
public class HomeController {

    private static final Logger LOG = getLogger(HomeController.class);

    private XmlConverter xmlConverter;
    private MultipartFile file;
    private LicenseService licenseService;

    public HomeController(LicenseService licenseService, XmlConverter xmlConverter) {
        this.licenseService = licenseService;
        this.xmlConverter = xmlConverter;
    }

    @GetMapping("/appstart")
    public String xmlCreator(Model model) {
        LOG.debug("Received GET Request on /appstart");
        model.addAttribute("xmlFormResult", new XmlFormResult());
        return "appstart";
    }

    @PostMapping("/appstart")
    public String xmlSubmit(HttpServletResponse response, @Valid XmlFormResult xmlFormResult, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        LOG.debug("Received POST Request on /appstart");

        if (file != null) {
            LOG.debug("CSAR recognized, setting CSAR ID as default");
            xmlFormResult.getOdrlBase().getOexAgreement().getOexAsset().getOexContext().setUid(file.getOriginalFilename().substring(0, file.getOriginalFilename().indexOf(".")));
        }

        if (bindingResult.hasErrors()) {
            LOG.debug("Recognized a validation error, resolving...");
            if (file != null) {
                redirectAttributes.addFlashAttribute("csarid", file.getOriginalFilename().substring(0, file.getOriginalFilename().indexOf(".")));
                redirectAttributes.addFlashAttribute("csar", "Für die Lizenz hochgeladene Datei: " + file.getOriginalFilename());
            }
            redirectAttributes.addFlashAttribute("error", "Ein Lizenz Dateiname wird benötigt!");
            return "redirect:/appstart";
        }

        licenseService.setUserDetails(xmlFormResult, true);

        try {
            String filename = xmlFormResult.getFilename();
            if (filename.isEmpty()) {
                filename = "Unnamed";
            }
            xmlConverter.getFile(response, filename + "_Lizenz", xmlFormResult.getOdrlBase());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes, HttpServletResponse response, @Valid XmlFormResult xmlFormResult, BindingResult bindingResult) {

        LOG.debug("Received POST Request on /upload");

        if (file.isEmpty()) {
            LOG.debug("no CSAR file selected, redirecting");
            redirectAttributes.addFlashAttribute("fileError", "Bitte CSAR auswählen");
            return "redirect:/appstart";
        }

        this.file = file;

        LOG.debug(String.format("Recieved file: %s", file.getOriginalFilename()));
        redirectAttributes.addFlashAttribute("csarid", file.getOriginalFilename().substring(0, file.getOriginalFilename().indexOf(".")));
        redirectAttributes.addFlashAttribute("csar", "Für die Lizenz hochgeladene Datei: " + file.getOriginalFilename());
        return "redirect:/appstart";
    }

    @PostMapping("/reset")
    public String reset(XmlFormResult xmlFormResult) {
        LOG.debug("Received POST Request on /reset - reset");
        this.file = null;
        return "redirect:appstart";
    }

}
