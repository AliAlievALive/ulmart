package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tv extends Product {
    private int diagonal;
    private int colors;
    private boolean smart;

    public Tv(long id, String brand, int price, int rating, String type, int diagonal, int colors, boolean smart) {
        super(id, brand, price, rating, type);
        this.diagonal = diagonal;
        this.colors = colors;
        this.smart = smart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tv)) return false;
        if (!super.equals(o)) return false;
        Tv tv = (Tv) o;
        if (diagonal != tv.diagonal) return false;
        if (colors != tv.colors) return false;
        return smart == tv.smart;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + diagonal;
        result = 31 * result + colors;
        result = 31 * result + (smart ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "Tv{" +
                "diagonal=" + diagonal +
                ", colors=" + colors +
                ", smart=" + smart +
                "} ";
    }
}
