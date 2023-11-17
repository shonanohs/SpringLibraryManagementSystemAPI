package com.barclays.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Book extends LendableMaterial {
    @Id
    @GeneratedValue
    private Integer id;
    private String author;
    private String publisher;
    @Enumerated(EnumType.STRING)
    private Genre genre;

    public Book(String title) {
        super(title);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        if (this.genre == null) {
            return null;
        }
        return this.genre.name();
    }

    public void setGenre(String genre) {
        this.genre = Genre.valueOf(genre);
    }
}
