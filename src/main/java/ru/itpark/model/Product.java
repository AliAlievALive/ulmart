package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Comparable<Product> {
    private long id;
    private String brand;
    private int price;
    private int rating;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        if (id != product.id) return false;
        if (price != product.price) return false;
        if (rating != product.rating) return false;
        return Objects.equals(brand, product.brand);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + rating;
        return result;
    }

    @Override
    public int compareTo(Product o) {
        return rating - o.rating;
    }
}
