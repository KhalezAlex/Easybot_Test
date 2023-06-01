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
@Table(name = "pc_t")
public class PC extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "form", nullable = false)
    private String form;

    public PC(Integer serial_number, String brand, Double price, Integer amount, String form) {
        super(serial_number, brand, price, amount);
        if (!isFormValid(form)) {
            throw new IllegalArgumentException();
        }
        this.form = form;
    }

    private boolean isFormValid(String form) {
        return (form.equalsIgnoreCase("десктоп") ||
                form.equalsIgnoreCase("неттоп") ||
                form.equalsIgnoreCase("моноблок"));
    }
}
