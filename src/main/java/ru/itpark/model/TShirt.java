package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TShirt extends Product {
    private long id;
    private String group;
    private int price;
    private int rating;
    private String brand;
    private String color;
    private int size;
}
