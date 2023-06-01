package org.klozevitz.easybot_test.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "hdd_t")
public class HDD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "serial", nullable = false, unique = true)
    private Integer serial;
    @Column(name = "brand", nullable = false)
    private String brand;
    @Column(name = "price", nullable = false)
    private Double price;
    @Column(name = "amount", nullable = false)
    private Integer amount;
    @Column(name = "volume", nullable = false)
    private Double volume;

    public HDD(Integer serial, String brand, Double price, Integer amount, Double volume) {
        this.serial = serial;
        this.brand = brand;
        this.price = price;
        this.amount = amount;
        this.volume = volume;
    }
}
