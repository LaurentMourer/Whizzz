package com.whizzz.model;

import com.google.common.base.Objects;

import java.util.Date;

abstract class Deliverable {

    private final Date creationDate;
    private final Date modificationDate;
    private final User createBy;
    private final User updateBy;

    Deliverable(Date creationDate, Date modificationDate, User createBy, User updateBy) {
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
        this.createBy = createBy;
        this.updateBy = updateBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deliverable that = (Deliverable) o;
        return Objects.equal(creationDate, that.creationDate) &&
                Objects.equal(modificationDate, that.modificationDate) &&
                Objects.equal(createBy, that.createBy) &&
                Objects.equal(updateBy, that.updateBy);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(creationDate, modificationDate, createBy, updateBy);
    }

    @Override
    public String toString() {
        return "Deliverable{" +
                "creationDate=" + creationDate +
                ", modificationDate=" + modificationDate +
                ", createBy=" + createBy +
                ", updateBy=" + updateBy +
                '}';
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public User getCreateBy() {
        return createBy;
    }

    public User getUpdateBy() {
        return updateBy;
    }
}
