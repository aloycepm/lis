package io.lis.spring.model;

public class Book implements Media {

    private Long id;
    private Integer ISBN;
    private String title;
    private String category;
    private Integer yearCreated;
    private Double price;
    private String author;
    private String publisher;

    public Book() {
    }

    public Book(Integer ISBN, String title, String category,
                Integer yearCreated, Double price, String author, String publisher) {
        this.ISBN = ISBN;
        this.title = title;
        this.category = category;
        this.yearCreated = yearCreated;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
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

    public Integer getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", yearCreated=" + yearCreated +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
