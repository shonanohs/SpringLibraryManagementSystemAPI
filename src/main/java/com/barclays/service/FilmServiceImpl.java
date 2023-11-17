package com.barclays.service;

import com.barclays.model.Film;
import com.barclays.model.Periodical;

import java.util.ArrayList;
import java.util.List;

public class FilmServiceImpl implements FilmService {
    @Override
    public List<Film> findAll() {
        List<Film> films = new ArrayList<>();
        return films;
    }

    @Override
    public Film findById(int id) {
        return null;
    }
}
