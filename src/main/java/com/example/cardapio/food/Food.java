package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Table(name = "foods")
@Entity(name = "foods")
@AllArgsConstructor @NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Food implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Integer price;

    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
}
