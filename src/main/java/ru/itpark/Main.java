package ru.itpark;

import ru.itpark.model.Phone;
import ru.itpark.model.TShirt;
import ru.itpark.model.Tv;
import ru.itpark.repository.ProductRepository;
import ru.itpark.service.UlmartService;

public class Main {
    public static void main(String[] args) {
        final UlmartService service = new UlmartService(new ProductRepository());
        service.add(new Phone(0, "Xiaomi", 15_000, 3, "Android", 8, true));
        service.add(new Phone(0, "Apple", 100_000, 1, "iOS", 8, true));
        service.add(new Phone(0, "Samsung", 65_000, 2, "Android", 8, true));
        service.add(new Phone(0, "Nokia", 15_000, 4, "Windows Mobile", 8, true));
        service.add(new Tv(0, "TV", 15_000, 2, "LG", 54, 500_000, true));
        service.add(new Tv(0, "TV", 15_000, 1, "Samsung", 30, 50_000, true));
        service.add(new TShirt(0, "T-Short", 15_000, 3, "Reebok", "black", 50));
        service.add(new TShirt(0, "T-Short", 15_000, 2, "Nike", "blue", 45));
        service.add(new TShirt(0, "T-Short", 15_000, 1, "Adiddas", "white", 40));
        System.out.println(service.getSortedPhonesBy((o1, o2) -> o1.getBrand().compareToIgnoreCase(o2.getBrand())));
    }
}
