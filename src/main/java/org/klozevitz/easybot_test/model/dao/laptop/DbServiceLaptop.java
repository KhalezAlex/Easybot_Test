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
        return laptopRepo.save(laptop);
    }

    @Override
    public Laptop update(Laptop laptop) {
        return null;
    }

    @Override
    public List<Laptop> findAll() {
        return (List<Laptop>) laptopRepo.findAll();
    }

    @Override
    public Laptop findById(int id) {
        return laptopRepo.findById(id).orElse(new Laptop());
    }

    @Override
    public boolean isPresent(int serial) {
        return laptopRepo.findBySerial(serial).isPresent();
    }
}
