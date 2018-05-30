package io.lis.spring.model;

public class Document implements Media {
    private Long id;
    private String title;
    private String category;
    private Integer yearCreated;
    private Double price;
    private String author;

    public Document() {
    }

    public Document(String title, String category, Integer yearCreated, Double price, String author) {
        this.title = title;
        this.category = category;
        this.yearCreated = yearCreated;
        this.price = price;
        this.author = author;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public Integer getYearCreated() {
        return yearCreated;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }
}
