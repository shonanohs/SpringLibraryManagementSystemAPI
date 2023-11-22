package com.barclays.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
public class Periodical extends LendableMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "periodical_seq")
    @SequenceGenerator(
            name = "periodical_seq",
            sequenceName = "periodical_seq",
            initialValue = 1,
            allocationSize = 1
    )
    private Integer id;
    private LocalDate publicationDate;

    public Periodical(String title) {
        super(title);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

}
