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

@XmlAccessorType(XmlAccessType.FIELD)
public class OEXRightsObject {

    @XmlElement(name = "asset")
    @NotNull
    private OEXAsset oexAsset;

    @XmlElement(name = "permission")
    @NotNull
    private OEXPermission oexPermission;

    @XmlElement(name = "context")
    @NotNull
    private OEXContext oexContext;

    @XmlElement(name = "party")
    private OEXParty oexParty;

    public OEXRightsObject() {
    }

    public OEXAsset getOexAsset() {
        return oexAsset;
    }

    public void setOexAsset(OEXAsset oexAsset) {
        this.oexAsset = oexAsset;
    }

    public OEXPermission getOexPermission() {
        return oexPermission;
    }

    public void setOexPermission(OEXPermission oexPermission) {
        this.oexPermission = oexPermission;
    }

    public OEXContext getOexContext() {
        return oexContext;
    }

    public void setOexContext(OEXContext oexContext) {
        this.oexContext = oexContext;
    }

    public OEXParty getOexParty() {
        return oexParty;
    }

    public void setOexParty(OEXParty oexParty) {
        this.oexParty = oexParty;
    }
}
