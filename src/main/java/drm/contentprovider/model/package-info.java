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

@XmlSchema(namespace = "http://odrl.net/1.1/ODRL-EX",
        xmlns = {@XmlNs(prefix = "o-ex", namespaceURI = "http://odrl.net/1.1/ODRL-EX"),
                @XmlNs(namespaceURI = "http://odrl.net/1.1/ODRL-DD", prefix = "o-dd"),
                @XmlNs(namespaceURI = "http://www.w3.org/2000/09/xmldsig#/", prefix = "ds")},
        elementFormDefault = XmlNsForm.QUALIFIED)
package drm.contentprovider.model;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
