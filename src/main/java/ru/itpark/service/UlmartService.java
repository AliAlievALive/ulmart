package ru.itpark.service;

import ru.itpark.comparator.ProductByIdAscComparator;
import ru.itpark.comparator.ProductByNameAscComparator;
import ru.itpark.comparator.ProductByPriceAscComparator;
import ru.itpark.model.Product;
import ru.itpark.repository.ProductRepository;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class UlmartService {
  private final ProductRepository repository;
  private Comparator<Product> comparator = new ProductByPriceAscComparator();


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
    if (item.getBrand().equals("")) {
      throw new IllegalArgumentException("name don't must be empty");
    }
    repository.save(item);
  }

  public void addAll(Collection<Product> products) {
    for (Product product : products) {
      product.setId(0);
      repository.save(product);
    }
  }

  public List<Product> getSortedById() {
    return getSortedBy(new ProductByIdAscComparator());
  }

  public List<Product> getSortedByPriceUp() {
    return getSortedBy(new ProductByPriceAscComparator());
  }

  public List<Product> getSortedByPriceDown() {
    return getSortedBy(new ProductByPriceAscComparator());
  }

  public List<Product> getSortedByName() {
    return getSortedBy(new ProductByNameAscComparator());
  }

  public List<Product> getSortedBy() {
    List<Product> result = new LinkedList<>(repository.getAll());
    result.sort(comparator);
    return result;
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

  public void remove(long id) {
    Collection<Product> products= repository.getAll();
    products.removeIf(i -> i.getId() == id);
  }
}
