package org.robatipoor.polls.model;

import java.time.Instant;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * DateAudit
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createAt", "updateAt" }, allowGetters = true)
public class DateAudit {
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Instant createAt;
    @LastModifiedDate
    @Column(nullable = false)
    private Instant updateAt;

    public Instant getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public Instant getUpdateAt() {
        return this.updateAt;
    }

    public void setUpdateAt(Instant updateAt) {
        this.updateAt = updateAt;
    }

    public DateAudit createAt(Instant createAt) {
        this.createAt = createAt;
        return this;
    }

    public DateAudit updateAt(Instant updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DateAudit)) {
            return false;
        }
        DateAudit dateAudit = (DateAudit) o;
        return Objects.equals(createAt, dateAudit.createAt) && Objects.equals(updateAt, dateAudit.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createAt, updateAt);
    }

    @Override
    public String toString() {
        return "{" +
            " createAt='" + getCreateAt() + "'" +
            ", updateAt='" + getUpdateAt() + "'" +
            "}";
    }

}