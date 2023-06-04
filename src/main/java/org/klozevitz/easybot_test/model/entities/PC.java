package org.klozevitz.easybot_test.model.entities;

import lombok.*;

import javax.persistence.*;

import static org.klozevitz.easybot_test.util.Validations.isFormValid;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "pc_t")
public class PC {
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
    @Column(name = "form", nullable = false)
    private String form;

    public PC() {
        this.id = -1;
        this.serial = -1;
        this.brand = "UNDEFINED";
        this.price = -1.0;
        this.amount = -1;
        this.form = "UNDEFINED";
    }

    public PC(Integer serial, String brand, Double price, Integer amount, String form) {
        this.serial = serial;
        this.brand = brand;
        this.price = price;
        this.amount = amount;
        this.form = form;
    }

    public void update(PC pc) {
        if (pc.getSerial() != null)
            setSerial(pc.getSerial());
        if (pc.getBrand() != null && !pc.getBrand().equals(""))
            setBrand(pc.getBrand());
        if (pc.getPrice() != null && pc.getPrice() > 0)
            setPrice(pc.getPrice());
        if (pc.getAmount() != null && pc.getAmount() >= 0)
            setAmount(pc.getAmount());
        if (pc.getForm() != null && isFormValid(pc.getForm()))
            setForm(pc.getForm());
    }

    @Override
    public String toString() {
        return "PC{" +
                "id=" + id +
                ", serial=" + serial +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", form='" + form + '\'' +
                '}';
    }
}