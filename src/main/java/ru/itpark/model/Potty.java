package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Potty extends Product {
    private String color;
    private int maxWeight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Potty)) return false;
        if (!super.equals(o)) return false;
        Potty potty = (Potty) o;
        if (maxWeight != potty.maxWeight) return false;
        return Objects.equals(color, potty.color);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + maxWeight;
        return result;
    }
}
