package com.barclays.repository;

import com.barclays.model.Periodical;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodicalRepository extends CrudRepository<Periodical,Integer> {
}
