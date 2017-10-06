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

package drm.contentprovider.model.requirements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://odrl.net/1.1/ODRL-DD")
public class RequirementPaymentOptions {

    @XmlElement(name = "amount", namespace = "http://odrl.net/1.1/ODRL-DD")
    private AmountElement amount;

    @XmlElement(name = "taxpercent", namespace = "http://odrl.net/1.1/ODRL-DD")
    private TaxPercentElement taxpercent;

    public AmountElement getAmount() {
        return amount;
    }

    public void setAmount(AmountElement amount) {
        this.amount = amount;
    }

    public TaxPercentElement getTaxpercent() {
        return taxpercent;
    }

    public void setTaxpercent(TaxPercentElement taxpercent) {
        this.taxpercent = taxpercent;
    }
}
