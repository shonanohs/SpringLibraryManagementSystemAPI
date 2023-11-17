package com.barclays.controller;

import com.barclays.model.Book;
import com.barclays.model.Film;
import com.barclays.model.Periodical;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@AllArgsConstructor
public class PeriodicalController {
    @GetMapping("/periodical")
    public List<Book> getAllPeriodical() {
        List<Periodical> periodicals = Collections.emptyList();
        return null;
    }

    @GetMapping("/periodicals/{id}")
    public Periodical getPeriodical(@PathVariable int id) {
        return null;
    }
}
