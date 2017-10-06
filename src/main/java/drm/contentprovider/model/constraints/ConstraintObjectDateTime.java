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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.time.LocalDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://odrl.net/1.1/ODRL-DD")
public class ConstraintObjectDateTime {

    @XmlElement(name = "fixed", namespace = "http://odrl.net/1.1/ODRL-DD")
    private LocalDateTime fixed;

    @XmlElement(name = "start", namespace = "http://odrl.net/1.1/ODRL-DD")
    private LocalDateTime start;

    @XmlElement(name = "end", namespace = "http://odrl.net/1.1/ODRL-DD")
    private LocalDateTime end;

    public LocalDateTime getFixed() {
        return fixed;
    }

    public void setFixed(LocalDateTime fixed) {
        this.fixed = fixed;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
}
