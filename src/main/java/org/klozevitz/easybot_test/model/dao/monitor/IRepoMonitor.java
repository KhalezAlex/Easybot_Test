package org.klozevitz.easybot_test.model.dao.monitor;

import org.klozevitz.easybot_test.model.entities.Monitor;
import org.springframework.data.repository.CrudRepository;

public interface IRepoMonitor extends CrudRepository<Monitor, Integer> {
}
