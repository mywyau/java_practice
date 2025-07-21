package java_practice.collections;

import static utils.Utils.println;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> fruitCounts = new HashMap<>();
        fruitCounts.put("apple", 2);
        fruitCounts.put("banana", 5);
        fruitCounts.put("orange", 3);
        fruitCounts.put("apple", 10); // replaces previous value

        println(fruitCounts); // {banana=5, orange=3, apple=10}
        println("Bananas: " + fruitCounts.get("banana"));
    }
}
