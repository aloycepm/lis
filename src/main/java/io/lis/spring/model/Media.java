package io.lis.spring.model;

import java.time.LocalDateTime;

public interface Media {

    Long getId();
    String getTitle();
    String getCategory();
    Integer getYearCreated();
    Double getPrice();
}
