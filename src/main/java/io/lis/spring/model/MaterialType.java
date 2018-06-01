package io.lis.spring.model;

import com.vaadin.flow.component.polymertemplate.Id;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


public class MaterialType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer version;
    private String name;
    private String description;


    public MaterialType() {
    }

    public MaterialType(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Integer getVersion() {
        return version;
    }


    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MaterialType{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
