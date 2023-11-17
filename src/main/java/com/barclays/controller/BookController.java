package com.barclays.controller;

import com.barclays.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@AllArgsConstructor
public class BookController {
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        List<Book> books = Collections.emptyList();
        return null;
    }

    @GetMapping("/books/{id}")
    public Book getMessage(@PathVariable int id) {
        return null;
    }
}
