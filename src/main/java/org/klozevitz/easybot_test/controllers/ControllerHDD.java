package org.klozevitz.easybot_test.controllers;

import lombok.RequiredArgsConstructor;
import org.klozevitz.easybot_test.model.dao.hdd.IDaoHDD;
import org.klozevitz.easybot_test.model.entities.HDD;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/all")
    public List<HDD> findAll() {
        return hddDao.findAll();
    }

    @GetMapping("/findById")
    public HDD findById(int id) {
        return hddDao.findById(id);
    }

    @PostMapping("/update")
    public HDD update(@RequestParam int id, @RequestParam(required = false) Integer serial,
                     @RequestParam(required = false) String brand, @RequestParam(required = false) Double price,
                     @RequestParam(required = false) Integer amount, @RequestParam(required = false) Double volume) {
        if (hddDao.findById(id) == null)
            return new HDD();
        return hddDao.update(new HDD(id, serial, brand, price, amount, volume));
    }
}