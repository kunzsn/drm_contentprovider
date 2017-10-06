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

package drm.contentprovider.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rights")
@XmlAccessorType(XmlAccessType.FIELD)
public class OdrlBase {

    @XmlElement(required = true, name = "context")
    @NotNull
    private OEXContext oexContext;

    @XmlElement(required = true, name = "agreement")
    @NotNull
    private OEXRightsObject oexAgreement;

    @XmlElement(name = "offer")
    @NotNull
    private OEXRightsObject oexOffer;

    public OdrlBase() {
    }

    public OdrlBase(OEXContext oexContext, OEXRightsObject oexAgreement) {
        this.oexContext = oexContext;
        this.oexAgreement = oexAgreement;
    }

    public OEXContext getOexContext() {
        return oexContext;
    }

    public void setOexContext(OEXContext oexContext) {
        this.oexContext = oexContext;
    }

    public OEXRightsObject getOexAgreement() {
        return oexAgreement;
    }

    public void setOexAgreement(OEXRightsObject oexAgreement) {
        this.oexAgreement = oexAgreement;
    }

    public OEXRightsObject getOexOffer() {
        return oexOffer;
    }

    public void setOexOffer(OEXRightsObject oexOffer) {
        this.oexOffer = oexOffer;
    }
}
