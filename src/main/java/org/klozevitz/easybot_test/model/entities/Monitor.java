package org.klozevitz.easybot_test.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static org.klozevitz.easybot_test.util.Validations.isDiagValid;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "monitor_t")
public class Monitor {
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
    @Column(name = "diag", nullable = false)
    private Double diag;

    public Monitor(Integer serial, String brand, Double price, Integer amount, Double diag) {
        this.serial = serial;
        this.brand = brand;
        this.price = price;
        this.amount = amount;
        this.diag = diag;
    }

    public void update(Monitor monitor) {
        if (monitor.getSerial() != null)
            setSerial(monitor.getSerial());
        if (monitor.getBrand() != null && !monitor.getBrand().equals(""))
            setBrand(monitor.getBrand());
        if (monitor.getPrice() != null && monitor.getPrice() > 0)
            setPrice(monitor.getPrice());
        if (monitor.getAmount() != null && monitor.getAmount() >= 0)
            setAmount(monitor.getAmount());
        if (monitor.getDiag() != null && isDiagValid(monitor.getDiag()))
            setDiag(monitor.getDiag());
    }
}
