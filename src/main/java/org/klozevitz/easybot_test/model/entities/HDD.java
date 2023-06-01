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
@Table(name = "hdd_t")
public class HDD extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "volume", nullable = false)
    private Double volume;

    public HDD(Integer serial_number, String brand, Double price, Integer amount, Double volume) {
        super(serial_number, brand, price, amount);
        if (!isVolumeValid(volume)) {
            throw new IllegalArgumentException();
        }
        this.volume = volume;
    }

    private boolean isVolumeValid(Double volume) {
        return volume > 32;
    }
}
