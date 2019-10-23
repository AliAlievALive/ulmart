package ru.itpark.comparator;

import ru.itpark.model.Product;

import java.util.Comparator;

import static java.lang.Math.toIntExact;

public class ProductByIdAscComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return toIntExact(o1.getId() - o2.getId());
    }
}
