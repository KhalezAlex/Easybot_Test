package org.klozevitz.easybot_test.model.dao.monitor;

import org.klozevitz.easybot_test.model.entities.Monitor;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IRepoMonitor extends CrudRepository<Monitor, Integer> {
    Optional<Monitor> findBySerial(int serial);
}
