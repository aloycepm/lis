package io.lis.spring.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Borrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private LocalDate issueDate;

    @NotNull
    private LocalDate dateToReturn;

    @Column(name = "returning_date", nullable = true)
    private LocalDate returningDate;

    @NotNull
    private String status;

    @Column(name = "fine", nullable = true)
    private BigDecimal fine;

    @Version
    private Integer version;

}
