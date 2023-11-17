package com.barclays.repository;

import org.springframework.data.repository.CrudRepository;
import com.barclays.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
}
