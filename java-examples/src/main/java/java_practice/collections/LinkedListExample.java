package java_practice.collections;

import static utils.Utils.println;

import java.util.LinkedList;;

// Use it when you:

// Frequently insert/delete from the front or middle
// Don’t need constant-time random access (ArrayList is better for that)

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Alice");
        names.add("Bob");
        names.addFirst("Zara"); // Insert at head
        names.addLast("Charlie"); // Insert at tail

        println(names); // [Zara, Alice, Bob, Charlie]

        names.removeFirst(); // Remove Zara
        println("After removing first: " + names);
    }
}
