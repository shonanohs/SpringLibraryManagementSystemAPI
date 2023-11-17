package com.barclays.controller;

import com.barclays.model.Film;
import com.barclays.service.FilmService;
import io.micrometer.common.util.StringUtils;
import jakarta.websocket.server.PathParam;
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
    @GetMapping("/film")
    public List<Film> getAllMovies(@PathParam("titleFilter") String titleFilter,
                                   @PathParam("directorFilter") String directorFilter,
                                   @PathParam("genreFilter") String genreFilter) {
        List<Film> films = Collections.emptyList();
        if (StringUtils.isNotBlank(titleFilter)) {
            films = filmService.findByTitleContains(titleFilter);
        }
        else if (StringUtils.isNotBlank(directorFilter)) {
            films = filmService.findByDirectorContains(directorFilter);
        }
        else if (StringUtils.isNotBlank(genreFilter)) {
            films = filmService.findByGenreContains(genreFilter);
        }
        return films;
    }

    @GetMapping("/films/{id}")
    public Film getFilm(@PathVariable int id) {
        return filmService.findById(id);
    }
}

