package ru.itpark.comparator;

import ru.itpark.model.Product;

import java.io.Serializable;
import java.util.Comparator;

public class ProductByIdAscComparator implements Comparator<Product>, Serializable {
    @Override
    public int compare(Product o1, Product o2) {
        return Math.toIntExact(o1.getId() - o2.getId());
    }
}
