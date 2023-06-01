package org.klozevitz.easybot_test.controllers;

import lombok.RequiredArgsConstructor;
import org.klozevitz.easybot_test.model.dao.monitor.IDaoMonitor;
import org.klozevitz.easybot_test.model.entities.Monitor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.klozevitz.easybot_test.util.Validations.*;

@RestController
@RequestMapping(path = "/monitor")
@RequiredArgsConstructor
public class ControllerMonitor {
    private final IDaoMonitor monitorDao;

    @PostMapping("/save")
    public Monitor save(@RequestParam int serial, @RequestParam String brand,
                       @RequestParam double price, @RequestParam int amount,
                       @RequestParam double diag) {
        if (!isDataValid(serial, brand, price, amount) || !isDiagValid(diag)||
                monitorDao.isPresent(serial)) {
            return new Monitor();
        }
        return monitorDao.save(new Monitor(serial, brand, price, amount, diag));
    }
}
