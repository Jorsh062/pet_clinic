package com.josh.pets.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.transform.sax.SAXResult;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "specialties")
public class Specialty extends BaseEntity{

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
