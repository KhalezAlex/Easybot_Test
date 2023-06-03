package org.klozevitz.easybot_test.controllers;

import lombok.RequiredArgsConstructor;
import org.klozevitz.easybot_test.model.dao.monitor.IDaoMonitor;
import org.klozevitz.easybot_test.model.entities.Monitor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/all")
    public List<Monitor> findAll(){
        return monitorDao.findAll();
    }

    @GetMapping("/findById")
    public Monitor findById(int id) {
        return monitorDao.findById(id);
    }

    @PostMapping("/update")
    public Monitor update(@RequestParam int id, @RequestParam(required = false) Integer serial,
                     @RequestParam(required = false) String brand, @RequestParam(required = false) Double price,
                     @RequestParam(required = false) Integer amount, @RequestParam(required = false) Double diag) {
        if (monitorDao.findById(id) == null)
            return new Monitor();
        return monitorDao.update(new Monitor(id, serial, brand, price, amount, diag));
    }
}
