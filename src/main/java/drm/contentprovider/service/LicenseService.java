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

package drm.contentprovider.service;

import drm.contentprovider.model.OEXParty;
import drm.contentprovider.model.XmlFormResult;
import drm.contentprovider.model.OEXContext;
import org.slf4j.Logger;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import static org.slf4j.LoggerFactory.getLogger;

@Service
public class LicenseService {

    private static final Logger LOG = getLogger(LicenseService.class);

    public void setUserDetails(XmlFormResult xmlFormResult, boolean agreement) {
        LOG.debug("Setting User Details");
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        OEXContext oexContext = new OEXContext();
        OEXParty oexParty = new OEXParty();
        oexContext.setUid(userDetails.getUsername());
        oexContext.setName(userDetails.getUsername());
        oexParty.setOexContext(oexContext);

        if (agreement) {
            xmlFormResult.getOdrlBase().getOexAgreement().setOexParty(oexParty);
        } else {
            xmlFormResult.getOdrlBase().getOexOffer().setOexParty(oexParty);
        }
    }

}
