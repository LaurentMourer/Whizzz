package com.whizzz.model;

import com.google.common.base.Objects;
import com.whizzz.feature.domain.Feature;

import java.util.Date;

public final class DesignEntity extends Entity {
    private final int id;
    private final String name;
    private final String typeDesign;
    private final boolean toDeliver;

    public DesignEntity(Date creationDate, Date modificationDate, User createBy, User updateBy, String technicalComment, String functionalComment, String jira, boolean report, Feature feature, int id, String name, String typeDesign, boolean toDeliver) {
        super(creationDate, modificationDate, createBy, updateBy, technicalComment, functionalComment, jira, report, feature);
        this.id = id;
        this.name = name;
        this.typeDesign = typeDesign;
        this.toDeliver = toDeliver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DesignEntity that = (DesignEntity) o;
        return id == that.id &&
                toDeliver == that.toDeliver &&
                Objects.equal(name, that.name) &&
                Objects.equal(typeDesign, that.typeDesign);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), id, name, typeDesign, toDeliver);
    }

    @Override
    public String toString() {
        return "DesignEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeDesign='" + typeDesign + '\'' +
                ", toDeliver=" + toDeliver +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTypeDesign() {
        return typeDesign;
    }

    public boolean isToDeliver() {
        return toDeliver;
    }
}
