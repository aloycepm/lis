package io.lis.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
    private Catalogue catalogue;
    private String ISBN;
    private String ISSN;
    private Integer year;
}
