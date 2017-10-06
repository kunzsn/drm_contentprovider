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

import drm.contentprovider.model.permissions.PermissionObject;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class OEXPermission {

    // USAGE PERMISSIONS

    @XmlElement(name = "display", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddDisplay;
    @XmlElement(name = "print", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddPrint;
    @XmlElement(name = "play", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddPlay;
    @XmlElement(name = "execute", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddExecute;

    // TRANSFER PERMISSIONS

    @XmlElement(name = "sell", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddSell;
    @XmlElement(name = "lend", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddLend;
    @XmlElement(name = "give", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddgive;
    @XmlElement(name = "lease", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddLease;

    // ASSET MANAGEMENT PERMISSIONS

    @XmlElement(name = "move", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddMove;
    @XmlElement(name = "duplicate", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddDuplicate;
    @XmlElement(name = "delete", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddDelete;
    @XmlElement(name = "verify", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddVerify;
    @XmlElement(name = "backup", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddBackup;
    @XmlElement(name = "restore", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddRestore;
    @XmlElement(name = "save", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddSave;
    @XmlElement(name = "install", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddInstall;
    @XmlElement(name = "uninstall", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddUninstall;

    // REUSE PERMISSIONS

    @XmlElement(name = "modify", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddModify;
    @XmlElement(name = "excerpt", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddExcerpt;
    @XmlElement(name = "annotate", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddAnnotate;
    @XmlElement(name = "aggregate", namespace = "http://odrl.net/1.1/ODRL-DD")
    @NotNull
    private PermissionObject ddAggregate;

    @XmlElement(name = "requirement")
    private OEXRequirement oexRequirement;

    public OEXPermission() {
    }

    public PermissionObject getDdDisplay() {
        return ddDisplay;
    }

    public void setDdDisplay(PermissionObject ddDisplay) {
        this.ddDisplay = ddDisplay;
    }

    public PermissionObject getDdPrint() {
        return ddPrint;
    }

    public void setDdPrint(PermissionObject ddPrint) {
        this.ddPrint = ddPrint;
    }

    public PermissionObject getDdPlay() {
        return ddPlay;
    }

    public void setDdPlay(PermissionObject ddPlay) {
        this.ddPlay = ddPlay;
    }

    public PermissionObject getDdExecute() {
        return ddExecute;
    }

    public void setDdExecute(PermissionObject ddExecute) {
        this.ddExecute = ddExecute;
    }

    public PermissionObject getDdSell() {
        return ddSell;
    }

    public void setDdSell(PermissionObject ddSell) {
        this.ddSell = ddSell;
    }

    public PermissionObject getDdLend() {
        return ddLend;
    }

    public void setDdLend(PermissionObject ddLend) {
        this.ddLend = ddLend;
    }

    public PermissionObject getDdgive() {
        return ddgive;
    }

    public void setDdgive(PermissionObject ddgive) {
        this.ddgive = ddgive;
    }

    public PermissionObject getDdLease() {
        return ddLease;
    }

    public void setDdLease(PermissionObject ddLease) {
        this.ddLease = ddLease;
    }

    public PermissionObject getDdMove() {
        return ddMove;
    }

    public void setDdMove(PermissionObject ddMove) {
        this.ddMove = ddMove;
    }

    public PermissionObject getDdDuplicate() {
        return ddDuplicate;
    }

    public void setDdDuplicate(PermissionObject ddDuplicate) {
        this.ddDuplicate = ddDuplicate;
    }

    public PermissionObject getDdDelete() {
        return ddDelete;
    }

    public void setDdDelete(PermissionObject ddDelete) {
        this.ddDelete = ddDelete;
    }

    public PermissionObject getDdVerify() {
        return ddVerify;
    }

    public void setDdVerify(PermissionObject ddVerify) {
        this.ddVerify = ddVerify;
    }

    public PermissionObject getDdBackup() {
        return ddBackup;
    }

    public void setDdBackup(PermissionObject ddBackup) {
        this.ddBackup = ddBackup;
    }

    public PermissionObject getDdRestore() {
        return ddRestore;
    }

    public void setDdRestore(PermissionObject ddRestore) {
        this.ddRestore = ddRestore;
    }

    public PermissionObject getDdSave() {
        return ddSave;
    }

    public void setDdSave(PermissionObject ddSave) {
        this.ddSave = ddSave;
    }

    public PermissionObject getDdInstall() {
        return ddInstall;
    }

    public void setDdInstall(PermissionObject ddInstall) {
        this.ddInstall = ddInstall;
    }

    public PermissionObject getDdUninstall() {
        return ddUninstall;
    }

    public void setDdUninstall(PermissionObject ddUninstall) {
        this.ddUninstall = ddUninstall;
    }

    public PermissionObject getDdModify() {
        return ddModify;
    }

    public void setDdModify(PermissionObject ddModify) {
        this.ddModify = ddModify;
    }

    public PermissionObject getDdExcerpt() {
        return ddExcerpt;
    }

    public void setDdExcerpt(PermissionObject ddExcerpt) {
        this.ddExcerpt = ddExcerpt;
    }

    public PermissionObject getDdAnnotate() {
        return ddAnnotate;
    }

    public void setDdAnnotate(PermissionObject ddAnnotate) {
        this.ddAnnotate = ddAnnotate;
    }

    public PermissionObject getDdAggregate() {
        return ddAggregate;
    }

    public void setDdAggregate(PermissionObject ddAggregate) {
        this.ddAggregate = ddAggregate;
    }

    public OEXRequirement getOexRequirement() {
        return oexRequirement;
    }

    public void setOexRequirement(OEXRequirement oexRequirement) {
        this.oexRequirement = oexRequirement;
    }
}
