package org.klozevitz.easybot_test.model.dao.hdd;

import lombok.RequiredArgsConstructor;
import org.klozevitz.easybot_test.model.entities.HDD;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DbServiceHDD implements IDaoHDD {
    private final IRepoHDD hddRepo;

    @Override
    public HDD save(HDD hdd) {
        return hddRepo.save(hdd);
    }

    @Override
    public HDD update(HDD hdd) {
        return null;
    }

    @Override
    public List<HDD> findAll() {
        return (List<HDD>) hddRepo.findAll();
    }

    @Override
    public HDD findById(int id) {
        return null;
    }

    @Override
    public boolean isPresent(int serial) {
        return hddRepo.findBySerial(serial).isPresent();
    }
}
