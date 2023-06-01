package org.klozevitz.easybot_test.controllers;

import lombok.RequiredArgsConstructor;
import org.klozevitz.easybot_test.model.dao.hdd.IDaoHDD;
import org.klozevitz.easybot_test.model.entities.HDD;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.klozevitz.easybot_test.util.Validations.*;

@RestController
@RequestMapping(path = "/hdd")
@RequiredArgsConstructor
public class ControllerHDD {
    private final IDaoHDD hddDao;

    @PostMapping("/save")
    public HDD save(@RequestParam int serial, @RequestParam String brand,
                    @RequestParam double price, @RequestParam int amount,
                    @RequestParam double volume) {
        if (!isDataValid(serial, brand, price, amount) || !isVolumeValid(volume) ||
                hddDao.isPresent(serial)) {
            return new HDD();
        }
        return hddDao.save(new HDD(serial, brand, price, amount, volume));
    }
}
