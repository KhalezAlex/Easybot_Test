package org.klozevitz.easybot_test.controllers;

import lombok.RequiredArgsConstructor;
import org.klozevitz.easybot_test.model.dao.pc.IDaoPC;
import org.klozevitz.easybot_test.model.entities.PC;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.klozevitz.easybot_test.util.Validations.*;

@RestController
@RequestMapping(path = "/pc")
@RequiredArgsConstructor
public class ControllerPC {
    private final IDaoPC pcDao;

    @PostMapping("/save")
    public PC save(@RequestParam int serial, @RequestParam String brand,
                   @RequestParam double price, @RequestParam int amount,
                   @RequestParam String form) {
        if (!isDataValid(serial, brand, price, amount) || !isFormValid(form) ||
                pcDao.isPresent(serial)) {
            return new PC();
        }
        return pcDao.save(new PC(serial, brand, price, amount, form));
    }

    @GetMapping("/all")
    public List<PC> findAll() {
        return pcDao.findAll();
    }

    @GetMapping("/findById")
    public PC findById(int id) {
        return pcDao.findById(id);
    }

    @PostMapping("/update")
    public PC update(@RequestParam int id, @RequestParam(required = false) Integer serial,
                     @RequestParam(required = false) String brand, @RequestParam(required = false) Double price,
                     @RequestParam(required = false) Integer amount, @RequestParam(required = false) String form) {
        if (pcDao.findById(id) == null)
            return new PC();
        return pcDao.update(new PC(id, serial, brand, price, amount, form));
    }
}