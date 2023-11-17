package com.barclays.controller;

import com.barclays.model.Periodical;
import com.barclays.service.PeriodicalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@AllArgsConstructor
public class PeriodicalController {
    private final PeriodicalService periodicalService;
    @GetMapping("/periodical")
    public List<Periodical> getAllPeriodical() {
        List<Periodical> periodicals = Collections.emptyList();
        return periodicals = periodicalService.findAll();
    }

    @GetMapping("/periodicals/{id}")
    public Periodical getPeriodical(@PathVariable int id) {
        return periodicalService.findById(id);
    }
}
