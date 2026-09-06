package java_practice.functional;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Streams describe a pipeline of transformations without changing the source.
 */
public class StreamPipeline {

    record Product(String name, String category, double price) {
    }

    private static final List<Product> PRODUCTS = List.of(
            new Product("Keyboard", "Technology", 75.00),
            new Product("Notebook", "Stationery", 4.50),
            new Product("Monitor", "Technology", 240.00),
            new Product("Pen", "Stationery", 2.00),
            new Product("Headphones", "Technology", 95.00));

    static List<String> affordableProductNames(double maximumPrice) {
        return PRODUCTS.stream()
                .filter(product -> product.price() <= maximumPrice)
                .sorted(Comparator.comparingDouble(Product::price))
                .map(Product::name)
                .toList();
    }

    static double totalPrice() {
        return PRODUCTS.stream()
                .mapToDouble(Product::price)
                .sum();
    }

    static Map<String, List<Product>> productsByCategory() {
        return PRODUCTS.stream()
                .collect(Collectors.groupingBy(Product::category));
    }

    public static void main(String[] args) {
        System.out.println("Products costing no more than £100:");
        affordableProductNames(100).forEach(name -> System.out.println("- " + name));

        System.out.printf("%nTotal price: £%.2f%n", totalPrice());

        System.out.println("\nProducts by category:");
        productsByCategory().forEach((category, products) ->
                System.out.printf("%s: %d product(s)%n", category, products.size()));
    }
}
