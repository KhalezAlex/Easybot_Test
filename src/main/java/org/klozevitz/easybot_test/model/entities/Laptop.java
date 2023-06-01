package org.klozevitz.easybot_test.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.klozevitz.easybot_test.model.Item;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "laptop_t")
public class Laptop extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "size", nullable = false)
    private Integer size;

    public Laptop(Integer serial_number, String brand, Double price, Integer amount, Integer size) {
        super(serial_number, brand, price, amount);
        if (!isSizeValid(size)) {
            throw new IllegalArgumentException();
        }
        this.size = size;
    }

    private boolean isSizeValid(Integer size) {
        return (size == 13 || size == 14 || size == 15 || size == 17);
    }
}
