package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Computer extends Product {
    private long id;
    private String brand;
    private String name;
    private int price;
    private int rating;
    private String os;
    private int ramSize;
    private int hardSize;
    private int Cores;
}
