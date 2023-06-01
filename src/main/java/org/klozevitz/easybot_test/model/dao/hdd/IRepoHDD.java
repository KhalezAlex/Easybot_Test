package org.klozevitz.easybot_test.model.dao.hdd;

import org.klozevitz.easybot_test.model.entities.HDD;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IRepoHDD extends CrudRepository<HDD, Integer> {
    Optional<HDD> findBySerial(int serial);
}
