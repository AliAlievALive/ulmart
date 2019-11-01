package ru.itpark.repository;

import ru.itpark.model.*;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ProductRepository {
  private final Collection<Product> products = new LinkedList<>();
  private long nextId = 1;

    public void save(Product item) {
    if (item.getId() == 0) {
      item.setId(nextId++);
    }
    products.add(item);
  }

/*  public void save(Collection<Product> newProducts) {
      for (Product newProduct : newProducts) {
          newProduct.setId(nextId++);
          save(newProduct);
      }
  }*/

  public Collection<Product> getAll() {
    return products;
  }

  public Collection<Product> getProductsWithType(String itemType) {
    List<Product> items = new LinkedList<>();
    for (Product product : products) {
      if (product.getType().equals(itemType)) {
        items.add(product);
      }
    }
    return items;
  }
}
