package org.klozevitz.easybot_test.model.dao.monitor;

import lombok.RequiredArgsConstructor;
import org.klozevitz.easybot_test.model.entities.Monitor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DbServiceMonitor implements IDaoMonitor {
    private final IRepoMonitor monitorRepo;

    @Override
    public Monitor save(Monitor monitor) {
        return null;
    }

    @Override
    public Monitor update(Monitor monitor) {
        return null;
    }

    @Override
    public List<Monitor> findAll() {
        return null;
    }

    @Override
    public Monitor findById(int id) {
        return null;
    }
}
