package com.barclays.controller;

import com.barclays.model.Film;
import com.barclays.service.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@AllArgsConstructor
public class FilmController {
    private final FilmService filmService;
    @GetMapping("/films")
    public List<Film> getAllFilms() {
        List<Film> films = Collections.emptyList();
        return films = filmService.findAll();
    }

    @GetMapping("/films/{id}")
    public Film getFilm(@PathVariable int id) {
        return filmService.findById(id);
    }
}

