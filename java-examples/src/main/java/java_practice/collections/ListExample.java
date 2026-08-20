package java_practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void exampleOne() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple"); // allowed
        System.out.println(list);
    };

    public static void main(String[] args) {
        exampleOne();
    }

}
