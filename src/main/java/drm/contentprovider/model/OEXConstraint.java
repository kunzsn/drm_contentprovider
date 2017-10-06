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

import drm.contentprovider.model.constraints.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Constraint Class which contains all ODRL constraints
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://odrl.net/1.1/ODRL-DD")
public class OEXConstraint {

    // USER CONTRAINTS

    @XmlElement(name = "individual")
    @NotNull
    private ConstraintObject individual;

    @XmlElement(name = "group")
    @NotNull
    private ConstraintObject group;

    // DEVICE CONSTRAINTS

    @XmlElement(name = "cpu")
    @NotNull
    private ConstraintObject cpu;

    @XmlElement(name = "network")
    @NotNull
    private ConstraintObjectNetwork network;

    @XmlElement(name = "screen")
    @NotNull
    private ConstraintObject screen;

    @XmlElement(name = "storage")
    @NotNull
    private ConstraintObject storage;

    @XmlElement(name = "memory")
    @NotNull
    private ConstraintObject memory;

    @XmlElement(name = "printer")
    @NotNull
    private ConstraintObject printer;

    @XmlElement(name = "software")
    @NotNull
    private ConstraintObject software;

    @XmlElement(name = "hardware")
    @NotNull
    private ConstraintObject hardware;

    //BOUND CONSTRAINTS

    @XmlElement(name = "count")
    @Min(0)
    private int count;

    @XmlElement(name = "range")
    @NotNull
    private ConstraintObjectRange range;

    @XmlElement(name = "spatial")
    @NotNull
    private ConstraintObject spatial;

    //TEMPORAL CONSTRAINTS

    @XmlElement(name = "datetime")
    @NotNull
    private ConstraintObjectDateTime dateTime;

    @XmlElement(name = "accumulated")
    @NotNull
    private String accumulated;

    @XmlElement(name = "interval")
    @NotNull
    private String interval;

    //ASPECTS CONSTRAINTS

    @XmlElement(name = "quality")
    @NotNull
    private ConstraintObjectQuality quality;

    @XmlElement(name = "format")
    @NotNull
    private ConstraintObjectFormat format;

    @XmlElement(name = "unit")
    @NotNull
    private ConstraintObjectUnit unit;

    @XmlElement(name = "watermark")
    @NotNull
    private ConstraintObject waterMark;

    //TARGET CONSTRAINTS

    @XmlElement(name = "purpose")
    @NotNull
    private ConstraintObject purpose;

    @XmlElement(name = "industry")
    @NotNull
    private ConstraintObject industry;

    @XmlElement(name = "recontext")
    @NotNull
    private boolean reContext;

    // RIGHTS CONSTRAINTS

    @XmlElement(name = "transferPerm")
    @NotNull
    private ConstraintObjectTransferPermission transferPermission;

    public OEXConstraint() {
    }

    public ConstraintObject getIndividual() {
        return individual;
    }

    public void setIndividual(ConstraintObject individual) {
        this.individual = individual;
    }

    public ConstraintObject getGroup() {
        return group;
    }

    public void setGroup(ConstraintObject group) {
        this.group = group;
    }

    public ConstraintObject getCpu() {
        return cpu;
    }

    public void setCpu(ConstraintObject cpu) {
        this.cpu = cpu;
    }

    public ConstraintObjectNetwork getNetwork() {
        return network;
    }

    public void setNetwork(ConstraintObjectNetwork network) {
        this.network = network;
    }

    public ConstraintObject getScreen() {
        return screen;
    }

    public void setScreen(ConstraintObject screen) {
        this.screen = screen;
    }

    public ConstraintObject getStorage() {
        return storage;
    }

    public void setStorage(ConstraintObject storage) {
        this.storage = storage;
    }

    public ConstraintObject getMemory() {
        return memory;
    }

    public void setMemory(ConstraintObject memory) {
        this.memory = memory;
    }

    public ConstraintObject getPrinter() {
        return printer;
    }

    public void setPrinter(ConstraintObject printer) {
        this.printer = printer;
    }

    public ConstraintObject getSoftware() {
        return software;
    }

    public void setSoftware(ConstraintObject software) {
        this.software = software;
    }

    public ConstraintObject getHardware() {
        return hardware;
    }

    public void setHardware(ConstraintObject hardware) {
        this.hardware = hardware;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ConstraintObjectRange getRange() {
        return range;
    }

    public void setRange(ConstraintObjectRange range) {
        this.range = range;
    }

    public ConstraintObject getSpatial() {
        return spatial;
    }

    public void setSpatial(ConstraintObject spatial) {
        this.spatial = spatial;
    }

    public ConstraintObjectDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(ConstraintObjectDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getAccumulated() {
        return accumulated;
    }

    public void setAccumulated(String accumulated) {
        this.accumulated = accumulated;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public ConstraintObjectQuality getQuality() {
        return quality;
    }

    public void setQuality(ConstraintObjectQuality quality) {
        this.quality = quality;
    }

    public ConstraintObjectFormat getFormat() {
        return format;
    }

    public void setFormat(ConstraintObjectFormat format) {
        this.format = format;
    }

    public ConstraintObjectUnit getUnit() {
        return unit;
    }

    public void setUnit(ConstraintObjectUnit unit) {
        this.unit = unit;
    }

    public ConstraintObject getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(ConstraintObject waterMark) {
        this.waterMark = waterMark;
    }

    public ConstraintObject getPurpose() {
        return purpose;
    }

    public void setPurpose(ConstraintObject purpose) {
        this.purpose = purpose;
    }

    public ConstraintObject getIndustry() {
        return industry;
    }

    public void setIndustry(ConstraintObject industry) {
        this.industry = industry;
    }

    public boolean isReContext() {
        return reContext;
    }

    public void setReContext(boolean reContext) {
        this.reContext = reContext;
    }

    public ConstraintObjectTransferPermission getTransferPermission() {
        return transferPermission;
    }

    public void setTransferPermission(ConstraintObjectTransferPermission transferPermission) {
        this.transferPermission = transferPermission;
    }
}
