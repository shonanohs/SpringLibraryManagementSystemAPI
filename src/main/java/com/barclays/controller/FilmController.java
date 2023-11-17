package com.barclays.controller;

import com.barclays.model.Book;
import com.barclays.model.Film;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@AllArgsConstructor
public class FilmController {
    @GetMapping("/films")
    public List<Book> getAllFilms() {
        List<Film> films = Collections.emptyList();
        return null;
    }

    @GetMapping("/films/{id}")
    public Film getFilm(@PathVariable int id) {
        return null;
    }
}

