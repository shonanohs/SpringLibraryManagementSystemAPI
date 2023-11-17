package com.barclays.repository;

import com.barclays.model.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film,Integer> {
}
