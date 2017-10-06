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

package drm.contentprovider.model.constraints;

import drm.contentprovider.model.OEXContext;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://odrl.net/1.1/ODRL-DD")
public class ConstraintObjectNetwork {

    @XmlElement(name = "range", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private ConstraintObjectRange range;

    @XmlElement(name = "context", namespace = "http://odrl.net/1.1/ODRL-EX")
    @NotNull
    private OEXContext oexContext;

    public ConstraintObjectNetwork() {
    }

    public ConstraintObjectRange getRange() {
        return range;
    }

    public void setRange(ConstraintObjectRange range) {
        this.range = range;
    }

    public OEXContext getOexContext() {
        return oexContext;
    }

    public void setOexContext(OEXContext oexContext) {
        this.oexContext = oexContext;
    }
}
