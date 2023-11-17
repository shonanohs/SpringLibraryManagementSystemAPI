package com.barclays.service;

import com.barclays.model.Periodical;

import java.util.List;

public interface PeriodicalService {
    List<Periodical> findAll();
    Periodical findById(int id);
}
