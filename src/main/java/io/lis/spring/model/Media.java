package io.lis.spring.model;

import java.time.LocalDateTime;

public interface Media {
    long getId();

    void setId(Long id);

    void setTitle(String title);

    String getTitle();

    void setTimeCreated(LocalDateTime timeCreated);

    LocalDateTime getTimeCreated();

    void setTimeUpdated(LocalDateTime timeUpdated);

    LocalDateTime getTimeUpdated();

    Integer getCopies();

    void setCopies(Integer copies);


    Category getCategory();

    void setCategory(Category category);
}
