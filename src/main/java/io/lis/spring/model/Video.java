package io.lis.spring.model;

public class Video implements Digital {
    private Long id;
    private String title;
    private String category;
    private Integer yearCreated;
    private Double price;
    private String producer;

    private String director;

    public Video() {
    }

    public Video(String title, String category, Integer yearCreated, Double price, String producer, String director) {
        this.title = title;
        this.category = category;
        this.yearCreated = yearCreated;
        this.price = price;
        this.producer = producer;
        this.director = director;
    }

    @Override
    public String getProducer() {
        return producer;
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
}
