package com.barclays.repository;

import com.barclays.model.Periodical;
import org.springframework.data.repository.CrudRepository;

public interface PeriodicalRepository extends CrudRepository<Periodical,Integer> {
}
