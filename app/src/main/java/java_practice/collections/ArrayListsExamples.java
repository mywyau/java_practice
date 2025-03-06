package java_practice.collections;

import java.util.ArrayList;

public class ArrayListsExamples {

    void arrayExampleOne() {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Cherry");

        System.out.println(fruits); // Output: [Apple, Banana, Cherry]
    }

    void arrayExampleTwo() {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Cherry");

        String firstItem = fruits.get(0);
        System.out.println(firstItem);
    }

    public static void main(String[] args) {
        ArrayListsExamples arrayListsExamples = new ArrayListsExamples();
        arrayListsExamples.arrayExampleOne();
        arrayListsExamples.arrayExampleTwo();



    }

}
