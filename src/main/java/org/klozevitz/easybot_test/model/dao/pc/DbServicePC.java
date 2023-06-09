package org.klozevitz.easybot_test.model.dao.pc;

import lombok.RequiredArgsConstructor;
import org.klozevitz.easybot_test.model.entities.PC;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DbServicePC implements IDaoPC {
    private final IRepoPC pcRepo;

    @Override
    public PC save(PC pc) {
        return pcRepo.save(pc);
    }

    @Override
    public PC update(PC pc) {
        PC pcToUpdate = pcRepo.findById(pc.getId()).orElse(null);
        if (pcToUpdate == null) {
            return new PC();
        }
        pcToUpdate.update(pc);
        return pcToUpdate;
    }

    @Override
    public List<PC> findAll() {
        return (List<PC>) pcRepo.findAll();
    }

    @Override
    public PC findById(int id) {
        return pcRepo.findById(id).orElse(new PC());
    }

    @Override
    public boolean isPresent(int serial) {
        return pcRepo.findBySerial(serial).isPresent();
    }
}