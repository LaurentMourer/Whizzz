package com.whizzz.feature.domain;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import org.joda.time.DateTime;


public class Feature {

    private final long id;
    private final int status;
    private final String description;
    private final boolean ready;
    private final DateTime created;
    private final DateTime modified;

    public Feature(long id, int status, String description, boolean ready, DateTime created, DateTime modified) {
        this.id = id;
        this.status = status;
        this.description = description;
        this.ready = ready;
        this.created = created;
        this.modified = modified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feature that = (Feature) o;
        return id == that.id &&
                status == that.status &&
                ready == that.ready &&
                com.google.common.base.Objects.equal(description, that.description) &&
                com.google.common.base.Objects.equal(created, that.created) &&
                com.google.common.base.Objects.equal(modified, that.modified);
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

}
