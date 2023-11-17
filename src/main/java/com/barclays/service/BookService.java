package com.barclays.service;

import com.barclays.model.Book;
import com.barclays.model.Genre;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(int id);
    List<Book> findByTitleContains(String filter);
    List<Book> findByGenreContains(Genre filter);
    List<Book> findByAuthorContains(String filter);
}
