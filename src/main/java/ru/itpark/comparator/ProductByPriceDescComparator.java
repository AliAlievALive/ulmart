package ru.itpark.comparator;

import ru.itpark.model.Product;

import java.io.Serializable;
import java.util.Comparator;

public class ProductByPriceDescComparator implements Comparator<Product>, Serializable {
    @Override
    public int compare(Product o1, Product o2) {
        return -(o1.getPrice() - o2.getPrice());
    }
}
