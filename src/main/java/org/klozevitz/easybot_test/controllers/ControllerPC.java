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
}
