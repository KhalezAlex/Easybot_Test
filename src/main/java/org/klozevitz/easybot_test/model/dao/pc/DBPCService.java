package org.klozevitz.easybot_test.model.dao.pc;

import lombok.RequiredArgsConstructor;
import org.klozevitz.easybot_test.model.entities.PC;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DBPCService implements IDaoPC {
    private final IRepoPC pcRepo;


    @Override
    public PC save(PC pc) {
        return null;
    }

    @Override
    public PC update(PC pc) {
        return null;
    }

    @Override
    public List<PC> findAll() {
        return null;
    }

    @Override
    public PC findById(int id) {
        return null;
    }
}
