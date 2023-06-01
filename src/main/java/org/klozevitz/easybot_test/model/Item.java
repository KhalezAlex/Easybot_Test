package org.klozevitz.easybot_test.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
public abstract class Item {
    @Column(name = "serial_number", nullable = false)
    private Integer serial_number;
    @Column(name = "brand", nullable = false)
    private String brand;
    @Column(name = "price", nullable = false)
    private Double price;
    @Column(name = "amount", nullable = false)
    private Integer amount;

    public Item(Integer serial_number, String brand, Double price, Integer amount) {
        if (!isDataValid(serial_number, brand, price, amount)) {
            throw new IllegalArgumentException();
        }
        this.serial_number = serial_number;
        this.brand = brand;
        this.price = price;
        this.amount = amount;
    }

    private boolean isDataValid(Integer sn, String b, Double p, Integer a) {
        if (sn == null || b == null || p == null || a == null) return false;
        return (sn > 0 && !b.equals("") && p > 0 && a >= 0);
    }
}