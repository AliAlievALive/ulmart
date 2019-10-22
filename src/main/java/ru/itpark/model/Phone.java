package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone extends Product {
    private String brand;
    private String os;
    private int ramSize;
    private boolean haveNFC;
}
