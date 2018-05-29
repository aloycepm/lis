package io.lis.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Document implements Media {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private List<Author> authors = new ArrayList<>();

    @NotNull
    private Category category;

    @NotNull
    private LocalDate datePublished;

    private LocalDateTime timeCreated;
    private LocalDateTime timeUpdated;

    @NotNull
    private Integer copies;

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(LocalDate datePublished) {
        this.datePublished = datePublished;
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
