package io.lis.spring.model;

import java.time.LocalDate;

public interface Requisition {
    Long getId();

    LocalDate createdDate();

    LocalDate updatedDate();

    String getStatus();

}
