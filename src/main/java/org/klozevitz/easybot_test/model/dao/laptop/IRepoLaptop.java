package org.klozevitz.easybot_test.model.dao.laptop;

import org.klozevitz.easybot_test.model.entities.Laptop;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IRepoLaptop extends CrudRepository<Laptop, Integer> {
    Optional<Laptop> findBySerial(int serial);
}
