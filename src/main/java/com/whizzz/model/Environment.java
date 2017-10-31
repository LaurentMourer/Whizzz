package com.whizzz.model;

import com.google.common.base.Objects;

public final class Environment {

    private final String environmentName;
    private final String description;
    private final boolean compilable;

    public Environment(String environmentName, String description, boolean compilable) {
        this.environmentName = environmentName;
        this.description = description;
        this.compilable = compilable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Environment that = (Environment) o;
        return compilable == that.compilable &&
                Objects.equal(environmentName, that.environmentName) &&
                Objects.equal(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(environmentName, description, compilable);
    }

    @Override
    public String toString() {
        return "Environment{" +
                "environmentName='" + environmentName + '\'' +
                ", description='" + description + '\'' +
                ", compilable=" + compilable +
                '}';
    }

    public String getEnvironmentName() {
        return environmentName;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompilable() {
        return compilable;
    }
}
