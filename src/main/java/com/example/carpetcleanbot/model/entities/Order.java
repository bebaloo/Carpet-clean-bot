package com.example.carpetcleanbot.model.entities;

import com.example.carpetcleanbot.model.Carpet;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @CollectionTable(name = "order_carpets",
            joinColumns = @JoinColumn(name = "order_id"))
    private List<Carpet> carpets;

    private Double price;

    private final LocalDate date = LocalDate.now();

    private String address;

    public void setPrice() {
        this.price = this.carpets.stream()
                .mapToDouble(Carpet::getPrice)
                .sum();
    }
}
