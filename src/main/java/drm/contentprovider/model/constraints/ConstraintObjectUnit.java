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

import drm.contentprovider.model.OEXConstraint;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.net.URI;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://odrl.net/1.1/ODRL-DD")
public class ConstraintObjectUnit {
    @XmlAttribute(name = "type", namespace = "http://odrl.net/1.1/ODRL-EX")
    private URI type;

    @XmlElement(name = "constraint", namespace = "http://odrl.net/1.1/ODRL-EX")
    @NotNull
    private OEXConstraint oexConstraint;

    public ConstraintObjectUnit() {
    }

    public URI getType() {
        return type;
    }

    public void setType(URI type) {
        this.type = type;
    }

    public OEXConstraint getOexConstraint() {
        return oexConstraint;
    }

    public void setOexConstraint(OEXConstraint oexConstraint) {
        this.oexConstraint = oexConstraint;
    }
}
