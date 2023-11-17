package com.barclays.repository;

import org.springframework.data.repository.CrudRepository;
import com.barclays.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
