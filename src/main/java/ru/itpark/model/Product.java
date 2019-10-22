package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Comparable<Product> {
    private long id;
    private String name;
    private int price;
    private int rating;

    @Override
    public int compareTo(Product o) {
        return rating - o.rating;
    }
}
