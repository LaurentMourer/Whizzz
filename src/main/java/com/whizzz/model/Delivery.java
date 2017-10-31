package com.whizzz.model;

import com.google.common.base.Objects;

import java.util.Date;

public final class Delivery extends Deliverable {
    private final String number;
    private final Date date;
    private final int status;

    public Delivery(Date creationDate, Date modificationDate, User createBy, User updateBy, String number, Date date, int status) {
        super(creationDate, modificationDate, createBy, updateBy);
        this.number = number;
        this.date = date;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Delivery delivery = (Delivery) o;
        return status == delivery.status &&
                Objects.equal(number, delivery.number) &&
                Objects.equal(date, delivery.date);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), number, date, status);
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "number='" + number + '\'' +
                ", date=" + date +
                ", status=" + status +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public Date getDate() {
        return date;
    }

    public int getStatus() {
        return status;
    }
}
