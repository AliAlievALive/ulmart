package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tv extends Product {
    private long id;
    private String brand;
    private int price;
    private int rating;
    private int diagonal;
    private int colors;
    private boolean smart;
}
