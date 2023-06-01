package org.klozevitz.easybot_test.model.dao.laptop;

import org.klozevitz.easybot_test.model.entities.Laptop;
import org.springframework.data.repository.CrudRepository;

public interface IRepoLaptop extends CrudRepository<Laptop, Integer> {
}
