package org.klozevitz.easybot_test.model.entities;

import lombok.*;

import javax.persistence.*;

import static org.klozevitz.easybot_test.util.Validations.isVolumeValid;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    public void update(HDD hdd) {
        if (hdd.getSerial() != null)
            setSerial(hdd.getSerial());
        if (hdd.getBrand() != null && !hdd.getBrand().equals(""))
            setBrand(hdd.getBrand());
        if (hdd.getPrice() != null && hdd.getPrice() > 0)
            setPrice(hdd.getPrice());
        if (hdd.getAmount() != null && hdd.getAmount() >= 0)
            setAmount(hdd.getAmount());
        if (hdd.getVolume() != null && isVolumeValid(hdd.getVolume()))
            setVolume(hdd.getVolume());
    }

    @Override
    public String toString() {
        return "HDD{" +
                "id=" + id +
                ", serial=" + serial +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", volume=" + volume +
                '}';
    }
}