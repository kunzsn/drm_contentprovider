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
public class OEXAsset {

    @XmlElement(name = "context")
    @NotNull
    private OEXContext oexContext;

    @XmlElement(name = "KeyInfo", namespace = "http://www.w3.org/2000/09/xmldsig#/")
    @NotNull
    private DSKeyInfo dsKeyInfo;

    public OEXAsset() {
    }

    public DSKeyInfo getDsKeyInfo() {
        return dsKeyInfo;
    }

    public void setDsKeyInfo(DSKeyInfo dsKeyInfo) {
        this.dsKeyInfo = dsKeyInfo;
    }


    public OEXContext getOexContext() {
        return oexContext;
    }

    public void setOexContext(OEXContext oexContext) {
        this.oexContext = oexContext;
    }
}
