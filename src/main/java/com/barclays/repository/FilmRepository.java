package com.barclays.repository;

import com.barclays.model.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends CrudRepository<Film,Integer> {
    List<Film> findByTitleContains(String titleFilter);
    List<Film> findByDirectorContains(String directorFilter);
    List<Film> findByGenreContains(String genreFilter);

}
