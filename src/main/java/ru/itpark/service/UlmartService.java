package ru.itpark.service;

import ru.itpark.comparator.ProductByNameAscComparator;
import ru.itpark.comparator.ProductByPriceAscComparator;
import ru.itpark.model.Product;
import ru.itpark.repository.ProductRepository;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class UlmartService {
  private final ProductRepository repository;

  public UlmartService(ProductRepository repository) {
    this.repository = repository;
  }

  public void add(Product item) {
    if (item.getId() != 0) {
      throw new IllegalArgumentException("id must be zero!");
    }
    if (item.getPrice() <= 0) {
      throw new IllegalArgumentException("price must be greater than zero");
    }
    if (item.getName().equals("")) {
      throw new IllegalArgumentException("name don't must be empty");
    }
    repository.save(item);
  }

  public List<Product> getSortedByPrice() {
    return getSortedBy(new ProductByPriceAscComparator());
  }

  public List<Product> getSortedByName() {
    return getSortedBy(new ProductByNameAscComparator());
  }

  public List<Product> getSortedBy(Comparator<Product> comparator) {
    List<Product> result = new LinkedList<>(repository.getAll());
    result.sort(comparator);
    return result;
  }

  public List<Product> getSortedPhonesBy(Comparator<Product> comparator) {
    List<Product> result = new LinkedList<>(repository.getPhones());
    result.sort(comparator);
    return result;
  }

  public List<Product> getSortedTvsBy(Comparator<Product> comparator) {
    List<Product> result = new LinkedList<>(repository.getTvs());
    result.sort(comparator);
    return result;
  }

  public List<Product> getSortedTShirtsBy(Comparator<Product> comparator) {
    List<Product> result = new LinkedList<>(repository.getPhones());
    result.sort(comparator);
    return result;
  }
}
