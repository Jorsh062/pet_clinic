package model;

import com.sun.xml.bind.v2.model.core.ID;

import java.io.Serializable;

public class BaseEntity implements Serializable  {
    private Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
