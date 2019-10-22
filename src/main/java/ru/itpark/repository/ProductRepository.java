package ru.itpark.repository;

import ru.itpark.model.Product;

import java.util.Collection;
import java.util.LinkedList;

public class ProductRepository {
  private final Collection<Product> houses = new LinkedList<>();
  private long nextId = 1;

  public void save(Product item) {
    if (item.getId() == 0) {
      item.setId(nextId++);
    }
    houses.add(item);
  }

  public Collection<Product> getAll() {
    return houses;
  }
}
