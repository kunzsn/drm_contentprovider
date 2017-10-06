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
import drm.contentprovider.model.requirements.RequirementRegister;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://odrl.net/1.1/ODRL-DD")
public class OEXRequirement {

    // RequirementPayment Requirements

    @XmlElement(name = "prepay", namespace = "http://odrl.net/1.1/ODRL-DD")
    private RequirementPayment prepay;

    @XmlElement(name = "postpay", namespace = "http://odrl.net/1.1/ODRL-DD")
    private RequirementPayment postpay;

    @XmlElement(name = "peruse", namespace = "http://odrl.net/1.1/ODRL-DD")
    private RequirementPayment peruse;

    // Interactions Requirements

    @XmlElement(name = "accept")
    private boolean accept;

    @XmlElement(name = "register")
    private RequirementRegister register;

    // Usage Requirements

    @XmlElement(name = "attribution")
    private boolean attribution;

    @XmlElement(name = "tracked")
    private boolean tracked;

    public RequirementPayment getPrepay() {
        return prepay;
    }

    public void setPrepay(RequirementPayment prepay) {
        this.prepay = prepay;
    }

    public RequirementPayment getPostpay() {
        return postpay;
    }

    public void setPostpay(RequirementPayment postpay) {
        this.postpay = postpay;
    }

    public RequirementPayment getPeruse() {
        return peruse;
    }

    public void setPeruse(RequirementPayment peruse) {
        this.peruse = peruse;
    }

    public boolean isAccept() {
        return accept;
    }

    public void setAccept(boolean accept) {
        this.accept = accept;
    }

    public RequirementRegister getRegister() {
        return register;
    }

    public void setRegister(RequirementRegister register) {
        this.register = register;
    }

    public boolean isAttribution() {
        return attribution;
    }

    public void setAttribution(boolean attribution) {
        this.attribution = attribution;
    }

    public boolean isTracked() {
        return tracked;
    }

    public void setTracked(boolean tracked) {
        this.tracked = tracked;
    }
}
