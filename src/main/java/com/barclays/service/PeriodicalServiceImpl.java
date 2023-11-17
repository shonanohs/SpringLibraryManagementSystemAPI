package com.barclays.service;

import com.barclays.model.Periodical;
import com.barclays.repository.PeriodicalRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class PeriodicalServiceImpl implements PeriodicalService {
    PeriodicalRepository periodicalRepository;
    @Override
    public List<Periodical> findAll() {
        List<Periodical> periodicals = new ArrayList<>();
        Iterable<Periodical> messagesIts = periodicalRepository.findAll();
        messagesIts.forEach(periodicals::add);
        return periodicals;
    }

    @Override
    public Periodical findById(int id) {
        Optional<Periodical> periodicals = periodicalRepository.findById(id);
        return periodicals.orElseGet(() -> new Periodical("No periodicals with id " + id));
    }
}