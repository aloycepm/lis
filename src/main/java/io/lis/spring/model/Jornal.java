package io.lis.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class Jornal {
    private Catalogue catalogue;
    private String ISSN;
    private LocalDate date;
}
