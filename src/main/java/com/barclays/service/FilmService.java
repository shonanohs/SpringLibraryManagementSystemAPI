package com.barclays.service;

import com.barclays.model.Film;

import java.util.List;

public interface FilmService {
    List<Film> findAll();
    Film findById(int id);
}
