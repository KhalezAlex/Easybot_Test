package org.klozevitz.easybot_test.controllers;

import lombok.RequiredArgsConstructor;
import org.klozevitz.easybot_test.model.dao.laptop.IDaoLaptop;
import org.klozevitz.easybot_test.model.entities.Laptop;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/all")
    public List<Laptop> findAll() {
        return laptopDao.findAll();
    }

    @GetMapping("/findById")
    public Laptop findById(int id) {
        return laptopDao.findById(id);
    }

    @PostMapping("/update")
    public Laptop update(@RequestParam int id, @RequestParam(required = false) Integer serial,
                     @RequestParam(required = false) String brand, @RequestParam(required = false) Double price,
                     @RequestParam(required = false) Integer amount, @RequestParam(required = false) Integer size) {
        if (laptopDao.findById(id) == null)
            return new Laptop();
        return laptopDao.update(new Laptop(id, serial, brand, price, amount, size));
    }
}