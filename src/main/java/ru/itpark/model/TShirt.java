package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TShirt extends Product {
    private String color;
    private int size;

    public TShirt(long id, String brand, int price, int rating, String color, int size) {
        super(id, brand, price, rating);
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TShirt)) return false;
        if (!super.equals(o)) return false;
        TShirt tShirt = (TShirt) o;
        if (size != tShirt.size) return false;
        return Objects.equals(color, tShirt.color);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "TShirt{" +
                "color='" + color + '\'' +
                ", size=" + size +
                "} ";
    }
}
