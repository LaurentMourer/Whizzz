package com.whizzz.model;

import com.google.common.base.Objects;

public final class Domain {
    private final Long id;
    private final String name;
    private final String deliveryCode;
    private final String deliveryLetter;
    private final String description;

    public Domain(Long id, String name, String deliveryCode, String deliveryLetter, String description) {
        this.id = id;
        this.name = name;
        this.deliveryCode = deliveryCode;
        this.deliveryLetter = deliveryLetter;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Domain domain = (Domain) o;
        return Objects.equal(id, domain.id) &&
                Objects.equal(name, domain.name) &&
                Objects.equal(deliveryCode, domain.deliveryCode) &&
                Objects.equal(deliveryLetter, domain.deliveryLetter) &&
                Objects.equal(description, domain.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, name, deliveryCode, deliveryLetter, description);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDeliveryCode() {
        return deliveryCode;
    }

    public String getDeliveryLetter() {
        return deliveryLetter;
    }

    public String getDescription() {
        return description;
    }
}
