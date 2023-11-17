package com.barclays.service;

import com.barclays.model.Film;

import java.util.List;

public interface FilmService {
    List<Film> findAll();
    Film findById(int id);
    List<Film> findByTitleContains(String titleFilter);

    List<Film> findByDirectorContains(String directorFilter);

    List<Film> findByGenreContains(String genreFilter);
}
