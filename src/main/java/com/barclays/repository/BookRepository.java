package com.barclays.repository;

import com.barclays.model.Genre;
import org.springframework.data.repository.CrudRepository;
import com.barclays.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    List<Book> findByTitleContains(String filter);
    List<Book> findByGenre(Genre filter);
    List<Book> findByAuthorContains(String filter);

}
