package com.whizzz.model;

import com.google.common.base.Objects;
import com.whizzz.feature.domain.Feature;

import java.util.Date;

public final class FileEntity extends Entity {
    private final long id;
    private final String fileName;
    private final String path;
    private final Long versionNumber;

    public FileEntity(Date creationDate, Date modificationDate, User createBy, User updateBy, String technicalComment, String functionalComment, String jira, boolean report, Feature feature, long id, String fileName, String path, Long versionNumber) {
        super(creationDate, modificationDate, createBy, updateBy, technicalComment, functionalComment, jira, report, feature);
        this.id = id;
        this.fileName = fileName;
        this.path = path;
        this.versionNumber = versionNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FileEntity that = (FileEntity) o;
        return id == that.id &&
                Objects.equal(fileName, that.fileName) &&
                Objects.equal(path, that.path) &&
                Objects.equal(versionNumber, that.versionNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), id, fileName, path, versionNumber);
    }

    @Override
    public String toString() {
        return "FileEntity{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", path='" + path + '\'' +
                ", versionNumber=" + versionNumber +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }

    public String getPath() {
        return path;
    }

    public Long getVersionNumber() {
        return versionNumber;
    }
}