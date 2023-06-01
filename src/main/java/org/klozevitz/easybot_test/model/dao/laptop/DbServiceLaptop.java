package org.klozevitz.easybot_test.model.dao.laptop;

import lombok.RequiredArgsConstructor;
import org.klozevitz.easybot_test.model.entities.Laptop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DbServiceLaptop implements IDaoLaptop{
    private final IRepoLaptop laptopRepo;

    @Override
    public Laptop save(Laptop laptop) {
        return null;
    }

    @Override
    public Laptop update(Laptop laptop) {
        return null;
    }

    @Override
    public List<Laptop> findAll() {
        return null;
    }

    @Override
    public Laptop findById(int id) {
        return null;
    }
}
