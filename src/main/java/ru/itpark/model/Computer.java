package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Computer extends Product {
    private int id;
    private String brand;
    private String os;
    private int ramSize;
    private int hardSize;
    private int Cores;
}
