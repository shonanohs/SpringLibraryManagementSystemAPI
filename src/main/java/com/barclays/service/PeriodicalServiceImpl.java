package com.barclays.service;

import com.barclays.model.Periodical;

import java.util.ArrayList;
import java.util.List;

public class PeriodicalServiceImpl implements PeriodicalService {
    @Override
    public List<Periodical> findAll() {
        List<Periodical> periodicals = new ArrayList<>();
        return periodicals;
    }

    @Override
    public Periodical findById(int id) {
        return null;
    }
}
