package com.whizzz.feature.domain;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import org.joda.time.DateTime;


public class Feature {

    private final Long id;
    private final int status;
    private final String description;
    private final int ready;
    private final DateTime created;
    private final DateTime modified;

    public Feature(final Long id, final int status, final String description, final int ready, final DateTime created, final DateTime modified) {
        this.id = id;
        this.status = status;
        this.description = description;
        this.ready = ready;
        this.created = created;
        this.modified = modified;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Feature that = (Feature) o;
        return id == that.id &&
                status == that.status &&
                ready == that.ready &&
                Objects.equal(description, that.description) &&
                Objects.equal(created, that.created) &&
                Objects.equal(modified, that.modified);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, status, description, ready, created, modified);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("status", status)
                .add("description", description)
                .add("ready", ready)
                .add("created", created)
                .add("modified", modified)
                .toString();
    }

    public Long getId() {
        return id;
    }

    public int getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public int isReady() {
        return ready;
    }

    public DateTime getCreated() {
        return created;
    }

    public DateTime getModified() {
        return modified;
    }
}
