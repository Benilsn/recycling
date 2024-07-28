package br.com.reykon.recycle.domain.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity(name = "recyadrs")
public class Address extends PanacheEntity {

    public String streetName;
    public Integer number;
    public Integer zipCode;
    public String neighborhood;
    public String complement;
}
