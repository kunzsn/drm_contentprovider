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

import drm.contentprovider.model.requirements.RequirementPayment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class OEXRightsHolder {

    @XmlElement(name = "percentage", namespace = "http://odrl.net/1.1/ODRL-DD")
    private double percentage;

    @XmlElement(name = "fixedamount", namespace = "http://odrl.net/1.1/ODRL-DD")
    private RequirementPayment fixedamount;

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public RequirementPayment getFixedamount() {
        return fixedamount;
    }

    public void setFixedamount(RequirementPayment fixedamount) {
        this.fixedamount = fixedamount;
    }
}
