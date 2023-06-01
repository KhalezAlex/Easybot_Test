package org.klozevitz.easybot_test.model.dao.pc;

import org.klozevitz.easybot_test.model.entities.PC;
import org.springframework.data.repository.CrudRepository;

public interface IRepoPC extends CrudRepository<PC, Integer> {
}
