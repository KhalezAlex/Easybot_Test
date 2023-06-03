package org.klozevitz.easybot_test.controllers;

import lombok.RequiredArgsConstructor;
import org.klozevitz.easybot_test.model.dao.hdd.IDaoHDD;
import org.klozevitz.easybot_test.model.dao.laptop.IDaoLaptop;
import org.klozevitz.easybot_test.model.dao.monitor.IDaoMonitor;
import org.klozevitz.easybot_test.model.dao.pc.IDaoPC;
import org.klozevitz.easybot_test.model.entities.HDD;
import org.klozevitz.easybot_test.model.entities.Laptop;
import org.klozevitz.easybot_test.model.entities.Monitor;
import org.klozevitz.easybot_test.model.entities.PC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/service")
@RequiredArgsConstructor
public class ServiceController {
    private final IDaoPC pcDao;
    private final IDaoLaptop laptopDao;
    private final IDaoMonitor monitorDao;
    private final IDaoHDD hddDao;

    @GetMapping("/genDB")
    public void genDB() {
        genPC();
        genLaptop();
        genMonitor();
        genHdd();
    }

    private void genPC() {
        pcDao.save(new PC(1000, "asus", 1000.0, 12, "десктоп"));
        pcDao.save(new PC(1001, "alienware", 3000.0, 4, "десктоп"));
        pcDao.save(new PC(1002, "apple", 1800.0, 30, "неттоп"));
        pcDao.save(new PC(1003, "lenovo", 700.0, 42, "моноблок"));
    }

    private void genLaptop() {
        laptopDao.save(new Laptop(2000, "asus", 1800.0, 8, 17));
        laptopDao.save(new Laptop(2001, "alienware", 2100.0, 14, 15));
        laptopDao.save(new Laptop(2002, "apple", 2000.0, 52, 13));
        laptopDao.save(new Laptop(2003, "apple", 2800.0, 17, 15));
    }

    private void genMonitor() {
        monitorDao.save(new Monitor(3000, "asus", 400.0, 5, 24.0));
        monitorDao.save(new Monitor(3001, "aoc", 330.0, 11, 27.0));
        monitorDao.save(new Monitor(3002, "asus", 800.0, 2, 32.0));
        monitorDao.save(new Monitor(3003, "lg", 520.0, 7, 32.0));
    }

    private void genHdd() {
        hddDao.save(new HDD(4000, "seagate", 100.0, 40, 500.0));
        hddDao.save(new HDD(4001, "crucial", 80.0, 20, 500.0));
        hddDao.save(new HDD(4002, "crucial", 60.0, 90, 240.0));
        hddDao.save(new HDD(4003, "barracuda", 300.0, 10, 2000.0));
    }
}
