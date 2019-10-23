package ru.itpark;

import ru.itpark.model.Phone;
import ru.itpark.model.Product;
import ru.itpark.model.TShirt;
import ru.itpark.model.Tv;
import ru.itpark.repository.ProductRepository;
import ru.itpark.service.UlmartService;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        final UlmartService service = new UlmartService(new ProductRepository());
        service.add(new Phone(0, "Xiaomi", 15_000, 3, "Android", 8, true));
        service.add(new Phone(0, "Apple", 100_000, 1, "iOS", 8, true));
        service.add(new Phone(0, "Samsung", 65_000, 2, "Android", 8, true));
        service.add(new Phone(0, "Nokia", 10_000, 4, "Windows Mobile", 8, true));
        service.add(new Tv(0, "LG", 25_000, 2, 54, 500_000, true));
        service.add(new Tv(0, "Samsung", 45_000, 1, 30, 50_000, true));
        service.add(new TShirt(0, "Reebok", 1_000, 3, "black", 50));
        service.add(new TShirt(0, "Nike", 2_000, 2, "blue", 45));
        service.add(new TShirt(0, "Adidas", 3_000, 1, "white", 40));

        System.out.println(service.getSortedPhonesBy((o1, o2) -> o1.getBrand().compareToIgnoreCase(o2.getBrand())));
        System.out.println(service.getSortedBy((o1, o2) -> o1.getBrand().compareToIgnoreCase(o2.getBrand())));

        Collection<Product> newProducts = service.getSortedById();
        service.addAll(newProducts);
        System.out.println(service.getSortedBy((o1, o2) -> o1.getBrand().compareToIgnoreCase(o2.getBrand())));
        service.remove(18);
        System.out.println(service.getSortedBy((o1, o2) -> o1.getBrand().compareToIgnoreCase(o2.getBrand())));
        System.out.println(service.getSortedBy());
    }
}
