package io.lis.spring.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "name", unique = true)
    private String name;

    @Column(nullable = true)
    private String description;

    @NotNull
    private Integer borrowingCapacity;

}
