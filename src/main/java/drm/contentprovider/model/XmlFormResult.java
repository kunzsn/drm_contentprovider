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

import org.hibernate.validator.constraints.NotEmpty;

public class XmlFormResult {

    @NotEmpty
    String filename;

    OdrlBase odrlBase;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public OdrlBase getOdrlBase() {
        return odrlBase;
    }

    public void setOdrlBase(OdrlBase odrlBase) {
        this.odrlBase = odrlBase;
    }
}