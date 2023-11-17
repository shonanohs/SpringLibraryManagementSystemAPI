package com.barclays.service;

import com.barclays.model.Book;
import com.barclays.model.Film;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        return books;
    }

    @Override
    public Book findById(int id) {
        return null;
    }
}
