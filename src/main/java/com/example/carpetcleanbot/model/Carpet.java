package com.example.carpetcleanbot.model;

import com.example.carpetcleanbot.model.enums.CarpetType;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Carpet {
    private Double width;
    private Double height;
    private CarpetType carpetType;
    private Double price;

    public void setPrice() {
        this.price = carpetType.getPrice() * width / 100 * height / 100;
    }

    public void setPrice(Double pricePerSquareMeter) {
        this.price = carpetType.getPrice() * width / 100 * height / 100;
    }
}
