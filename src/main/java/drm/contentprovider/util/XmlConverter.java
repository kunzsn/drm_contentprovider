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

package drm.contentprovider.util;

import drm.contentprovider.model.XmlFormResult;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.OutputStream;

import static org.slf4j.LoggerFactory.getLogger;

@Component
public class XmlConverter {

    private static final Logger LOG = getLogger(XmlConverter.class);


    /**
     * Marshals a given POJO into a XML file and outputs the file on the requesting service
     *
     * @param response
     * @param filename
     * @param object
     * @throws JAXBException
     * @throws IOException
     */
    public void getFile(HttpServletResponse response, String filename, Object object) throws JAXBException {

        LOG.debug("Setting Response to download file");
        response.setContentType("application/xml");
        response.setHeader("Content-Disposition", String.format(
                "attachment; filename=\"%s\".xml", filename));

        JAXBContext jaxbContext = JAXBContext.newInstance(XmlFormResult.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        OutputStream os = null;
        try {
            LOG.debug("Marshal POJO into XML");
            os = response.getOutputStream();
            jaxbMarshaller.marshal(object, os);
            response.flushBuffer();
            os.close();
            LOG.debug("XML send to download, output stream closed");
        } catch (IOException e) {
            LOG.error(e.getMessage(), e);
        } finally {
            try {
                LOG.debug("finally closing output stream");
                os.close();
            } catch (IOException e) {
                LOG.error(e.getMessage(), e);
            }
        }

    }
}
