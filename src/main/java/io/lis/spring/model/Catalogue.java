package io.lis.spring.model;

public class Catalogue implements Models {
    private String title;
    private String author;
    private String publisher;
    private String description;
    private String classNumber;
    private String location;
    private Integer copy;
    private Double replacementPrice;
    private MaterialType materialType;

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void setId(Long id) {

    }

    @Override
    public Integer getVersion() {
        return null;
    }

    @Override
    public void setVersion(Integer version) {

    }
}
