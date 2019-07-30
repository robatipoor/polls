package org.robatipoor.polls.model;

import java.util.Objects;

import javax.persistence.*;

import org.hibernate.annotations.NaturalId;

/**
 * Role
 */
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NaturalId
    @Column
    @Enumerated(EnumType.STRING)
    private RoleName name;

    public Role() {
    }

    public Role(RoleName name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleName getName() {
        return this.name;
    }

    public void setName(RoleName name) {
        this.name = name;
    }

    public Role id(Long id) {
        this.id = id;
        return this;
    }

    public Role name(RoleName name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Role)) {
            return false;
        }
        Role role = (Role) o;
        return Objects.equals(id, role.id) && Objects.equals(name, role.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + "}";
    }

}