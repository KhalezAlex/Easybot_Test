package org.klozevitz.easybot_test.model.entities;

import lombok.*;

import javax.persistence.*;

import static org.klozevitz.easybot_test.util.Validations.isSizeValid;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "laptop_t")
public class Laptop {
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
    @Column(name = "size", nullable = false)
    private Integer size;

    public Laptop() {
        this.id = -1;
        this.serial = -1;
        this.brand = "UNDEFINED";
        this.price = -1.0;
        this.amount = -1;
        this.size = -1;
    }

    public Laptop(Integer serial, String brand, Double price, Integer amount, Integer size) {
        this.serial = serial;
        this.brand = brand;
        this.price = price;
        this.amount = amount;
        this.size = size;
    }

    public void update(Laptop laptop) {
        if (laptop.getSerial() != null)
            setSerial(laptop.getSerial());
        if (laptop.getBrand() != null && !laptop.getBrand().equals(""))
            setBrand(laptop.getBrand());
        if (laptop.getPrice() != null && laptop.getPrice() > 0)
            setPrice(laptop.getPrice());
        if (laptop.getAmount() != null && laptop.getAmount() >= 0)
            setAmount(laptop.getAmount());
        if (laptop.getSize() != null && isSizeValid(laptop.getSize()))
            setSize(laptop.getSize());
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", serial=" + serial +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", size=" + size +
                '}';
    }
}