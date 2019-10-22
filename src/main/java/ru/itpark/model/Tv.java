package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tv extends Product {
    private int id;
    private String brand;
    private int diagonal;
    private int colors;
    private boolean smart;
}
