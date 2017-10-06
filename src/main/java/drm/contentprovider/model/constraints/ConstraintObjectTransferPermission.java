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
import drm.contentprovider.model.permissions.PermissionObject;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://odrl.net/1.1/ODRL-DD")
public class ConstraintObjectTransferPermission {

    @XmlElementWrapper
    @XmlElement
    private ArrayList<PermissionObject> permissionsList;

    @XmlAttribute(name = "downstream", namespace = "http://odrl.net/1.1/ODRL-DD")
    private String downstream;

    @XmlElement(name = "constraint", namespace = "http://odrl.net/1.1/ODRL-EX")
    @NotNull
    private OEXConstraint oexConstraint;

    public ConstraintObjectTransferPermission() {
    }

    public ArrayList<PermissionObject> getPermissionsList() {
        return permissionsList;
    }

    public void setPermissionsList(ArrayList<PermissionObject> permissionsList) {
        this.permissionsList = permissionsList;
    }

    public String getDownstream() {
        return downstream;
    }

    public void setDownstream(String downstream) {
        this.downstream = downstream;
    }

    public OEXConstraint getOexConstraint() {
        return oexConstraint;
    }

    public void setOexConstraint(OEXConstraint oexConstraint) {
        this.oexConstraint = oexConstraint;
    }
}
