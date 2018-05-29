package io.lis.spring.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book implements Media {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private Integer ISBN;

    @NotNull
    private String title;

    @NotNull
    private Integer year;

    @NotNull
    private List<Author> authors = new ArrayList<>();

    @NotNull
    private Publisher publisher;

    @NotNull
    private Category category;

    private LocalDateTime timeCreated;
    private LocalDateTime timeUpdated;

    @NotNull
    private Integer copies;

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    @Override
    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    @Override
    public void setTimeUpdated(LocalDateTime timeUpdated) {
        this.timeUpdated = timeUpdated;
    }

    @Override
    public LocalDateTime getTimeUpdated() {
        return timeUpdated;
    }

    @Override
    public Integer getCopies() {
        return copies;
    }

    @Override
    public void setCopies(Integer copies) {
        this.copies = copies;
    }
}
