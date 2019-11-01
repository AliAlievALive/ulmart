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
    private String type;

    /*public Product(long id, String brand, int price, int rating, String type) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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
