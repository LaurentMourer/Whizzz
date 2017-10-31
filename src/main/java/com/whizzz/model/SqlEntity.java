package com.whizzz.model;

import com.google.common.base.Objects;
import com.whizzz.feature.domain.Feature;

import java.util.Date;

public final class SqlEntity extends Entity {
    private final long id;
    private final String typeSql;
    private final String processName;
    private final String sqlOrder;
    private final String sqlOrderDump;

    public SqlEntity(Date creationDate, Date modificationDate, User createBy, User updateBy, String technicalComment, String functionalComment, String jira, boolean report, Feature feature, long id, String typeSql, String processName, String sqlOrder, String sqlOrderDump) {
        super(creationDate, modificationDate, createBy, updateBy, technicalComment, functionalComment, jira, report, feature);
        this.id = id;
        this.typeSql = typeSql;
        this.processName = processName;
        this.sqlOrder = sqlOrder;
        this.sqlOrderDump = sqlOrderDump;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SqlEntity sqlEntity = (SqlEntity) o;
        return id == sqlEntity.id &&
                Objects.equal(typeSql, sqlEntity.typeSql) &&
                Objects.equal(processName, sqlEntity.processName) &&
                Objects.equal(sqlOrder, sqlEntity.sqlOrder) &&
                Objects.equal(sqlOrderDump, sqlEntity.sqlOrderDump);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), id, typeSql, processName, sqlOrder, sqlOrderDump);
    }

    @Override
    public String toString() {
        return "SqlEntity{" +
                "id=" + id +
                ", typeSql='" + typeSql + '\'' +
                ", processName='" + processName + '\'' +
                ", sqlOrder='" + sqlOrder + '\'' +
                ", sqlOrderDump='" + sqlOrderDump + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getTypeSql() {
        return typeSql;
    }

    public String getProcessName() {
        return processName;
    }

    public String getSqlOrder() {
        return sqlOrder;
    }

    public String getSqlOrderDump() {
        return sqlOrderDump;
    }
}
