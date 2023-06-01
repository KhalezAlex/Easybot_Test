package org.klozevitz.easybot_test.controllers;

import lombok.RequiredArgsConstructor;
import org.klozevitz.easybot_test.model.dao.laptop.IDaoLaptop;
import org.klozevitz.easybot_test.model.entities.Laptop;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.klozevitz.easybot_test.util.Validations.*;

@RestController
@RequestMapping(path = "/laptop")
@RequiredArgsConstructor
public class ControllerLaptop {
    private final IDaoLaptop laptopDao;

    @PostMapping("/save")
    public Laptop save(@RequestParam int serial, @RequestParam String brand,
                   @RequestParam double price, @RequestParam int amount,
                   @RequestParam int size) {
        if (!isDataValid(serial, brand, price, amount) || !isSizeValid(size) ||
                laptopDao.isPresent(serial)) {
            return new Laptop();
        }
        return laptopDao.save(new Laptop(serial, brand, price, amount, size));
    }
}
