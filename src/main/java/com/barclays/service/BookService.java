package com.barclays.service;

import com.barclays.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(int id);
}
