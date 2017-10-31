package com.whizzz.model;


import com.google.common.base.Objects;

import java.util.Date;

public final class ManualAction extends Deliverable {
    private final long id;
    private final String actionType;
    private final String entityCodeAc;
    private final String entityParentCode;
    private final String entityParentType;
    private final String processName;
    private final String processRadical;
    private final String forcingIndicator;
    private final String program;
    private final String comment;
    private final DesignEntity designEntity;

    public ManualAction(Date creationDate, Date modificationDate, User createBy, User updateBy, long id, String actionType, String entityCodeAc, String entityParentCode, String entityParentType, String processName, String processRadical, String forcingIndicator, String program, String comment, DesignEntity designEntity) {
        super(creationDate, modificationDate, createBy, updateBy);
        this.id = id;
        this.actionType = actionType;
        this.entityCodeAc = entityCodeAc;
        this.entityParentCode = entityParentCode;
        this.entityParentType = entityParentType;
        this.processName = processName;
        this.processRadical = processRadical;
        this.forcingIndicator = forcingIndicator;
        this.program = program;
        this.comment = comment;
        this.designEntity = designEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ManualAction that = (ManualAction) o;
        return id == that.id &&
                Objects.equal(actionType, that.actionType) &&
                Objects.equal(entityCodeAc, that.entityCodeAc) &&
                Objects.equal(entityParentCode, that.entityParentCode) &&
                Objects.equal(entityParentType, that.entityParentType) &&
                Objects.equal(processName, that.processName) &&
                Objects.equal(processRadical, that.processRadical) &&
                Objects.equal(forcingIndicator, that.forcingIndicator) &&
                Objects.equal(program, that.program) &&
                Objects.equal(comment, that.comment) &&
                Objects.equal(designEntity, that.designEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), id, actionType, entityCodeAc, entityParentCode, entityParentType, processName, processRadical, forcingIndicator, program, comment, designEntity);
    }

    @Override
    public String toString() {
        return "ManualAction{" +
                "id=" + id +
                ", actionType='" + actionType + '\'' +
                ", entityCodeAc='" + entityCodeAc + '\'' +
                ", entityParentCode='" + entityParentCode + '\'' +
                ", entityParentType='" + entityParentType + '\'' +
                ", processName='" + processName + '\'' +
                ", processRadical='" + processRadical + '\'' +
                ", forcingIndicator='" + forcingIndicator + '\'' +
                ", program='" + program + '\'' +
                ", comment='" + comment + '\'' +
                ", designEntity=" + designEntity +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getActionType() {
        return actionType;
    }

    public String getEntityCodeAc() {
        return entityCodeAc;
    }

    public String getEntityParentCode() {
        return entityParentCode;
    }

    public String getEntityParentType() {
        return entityParentType;
    }

    public String getProcessName() {
        return processName;
    }

    public String getProcessRadical() {
        return processRadical;
    }

    public String getForcingIndicator() {
        return forcingIndicator;
    }

    public String getProgram() {
        return program;
    }

    public String getComment() {
        return comment;
    }

    public DesignEntity getDesignEntity() {
        return designEntity;
    }
}
