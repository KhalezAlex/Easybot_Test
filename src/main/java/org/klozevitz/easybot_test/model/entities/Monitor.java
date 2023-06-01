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
@Table(name = "monitor_t")
public class Monitor extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "diag", nullable = false)
    private Double diag;

    public Monitor(Integer serial_number, String brand, Double price, Integer amount, Double diag) {
        super(serial_number, brand, price, amount);
        if (isDiagValid(diag)) {
            throw new IllegalArgumentException();
        }
        this.diag = diag;
    }

    private boolean isDiagValid(Double diag) {
        return diag > 5.0;
    }
}
