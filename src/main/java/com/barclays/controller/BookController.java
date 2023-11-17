package com.barclays.controller;

import com.barclays.model.Book;
import com.barclays.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@AllArgsConstructor
public class BookController {
    private final BookService bookService;
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        List<Book> books = Collections.emptyList();
        return books = bookService.findAll();
    }

    @GetMapping("/books/{id}")
    public Book getMessage(@PathVariable int id) {
        return bookService.findById(id);
    }
}
