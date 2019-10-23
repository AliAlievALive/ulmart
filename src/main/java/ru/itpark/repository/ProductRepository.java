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

  public Collection<Product> getPhones() {
    List<Product> phones = new LinkedList<>();
    for (Product product : products) {
      if (product instanceof Phone) {
        phones.add(product);
      }
    }
    return phones;
  }

  public Collection<Product> getTvs() {
    List<Product> tvs = new LinkedList<>();
    for (Product tv : products) {
      if (tv instanceof Tv) {
        tvs.add(tv);
      }
    }
    return tvs;
  }

  public Collection<Product> getTShirts() {
    List<Product> tShirts = new LinkedList<>();
    for (Product tShirt : products) {
      if (tShirt instanceof TShirt) {
        tShirts.add(tShirt);
      }
    }
    return tShirts;
  }

  public Collection<Product> getComputers() {
    List<Product> computers = new LinkedList<>();
    for (Product computer : products) {
      if (computer instanceof Computer) {
        computers.add(computer);
      }
    }
    return computers;
  }
}
