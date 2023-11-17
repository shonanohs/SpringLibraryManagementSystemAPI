package com.barclays.service;

import com.barclays.model.Book;
import com.barclays.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    BookRepository bookRepository;
    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        Iterable<Book> messagesIts = bookRepository.findAll();
        messagesIts.forEach(books::add);
        return books;
    }

    @Override
    public Book findById(int id) {
        Optional<Book> books = bookRepository.findById(id);
        return books.orElseGet(() -> new Book("No books with id" + id));
    }
}
