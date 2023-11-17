package com.barclays.service;

import com.barclays.model.Film;
import com.barclays.repository.FilmRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class FilmServiceImpl implements FilmService {
    FilmRepository filmRepository;
    @Override
    public List<Film> findAll() {
        List<Film> films = new ArrayList<>();
        Iterable<Film> messagesIts = filmRepository.findAll();
        messagesIts.forEach(films::add);
        return films;
    }

    @Override
    public Film findById(int id) {
        Optional<Film> films = filmRepository.findById(id);
        return films.orElseGet(() -> new Film("No films with id " + id));
    }
}