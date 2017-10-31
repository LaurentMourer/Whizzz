package com.whizzz.model;

import com.google.common.base.Objects;
import com.whizzz.feature.domain.Feature;

import java.util.Date;

public abstract class Entity extends Deliverable {

    private final String technicalComment;
    private final String functionalComment;
    private final String jira;
    private final boolean report;
    private final Feature feature;

    Entity(Date creationDate, Date modificationDate, User createBy, User updateBy, String technicalComment, String functionalComment, String jira, boolean report, Feature feature) {
        super(creationDate, modificationDate, createBy, updateBy);
        this.technicalComment = technicalComment;
        this.functionalComment = functionalComment;
        this.jira = jira;
        this.report = report;
        this.feature = feature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return report == entity.report &&
                Objects.equal(technicalComment, entity.technicalComment) &&
                Objects.equal(functionalComment, entity.functionalComment) &&
                Objects.equal(jira, entity.jira) &&
                Objects.equal(feature, entity.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(technicalComment, functionalComment, jira, report, feature);
    }


    public String getTechnicalComment() {
        return technicalComment;
    }

    public String getFunctionalComment() {
        return functionalComment;
    }

    public String getJira() {
        return jira;
    }

    public boolean isReport() {
        return report;
    }

    public Feature getFeature() {
        return feature;
    }
}
