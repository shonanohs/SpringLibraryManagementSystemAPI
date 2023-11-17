package com.barclays.controller;

import com.barclays.model.Book;
import com.barclays.model.Genre;
import com.barclays.service.BookService;
import io.micrometer.common.util.StringUtils;
import jakarta.websocket.server.PathParam;
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
    public List<Book> getAllBooks(@PathParam("titleFilter") String titleFilter,
                                  @PathParam("authorFilter") String authorFilter,
                                  @PathParam("genreFilter") String genreFilter) {
        List<Book> books = Collections.emptyList();
        if (StringUtils.isNotBlank(titleFilter)) {
            books = bookService.findByTitleContains(titleFilter);
        }
        else if (StringUtils.isNotBlank(authorFilter)) {
            books = bookService.findByAuthorContains(authorFilter);
        }
        else if (StringUtils.isNotBlank(genreFilter)) {
            books = bookService.findByGenreContains(Genre.valueOf(genreFilter));
        }
        else {
            books = bookService.findAll();
        }
        return books;
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable int id) {
        return bookService.findById(id);
    }
}
