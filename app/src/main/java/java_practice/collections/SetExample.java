package java_practice.collections;

import java.util.HashSet;
import java.util.Set;
import static utils.Utils.println;;


public class SetExample {

    public static void exampleOne() {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("apple"); // ignored
        System.out.println(set);
        println(set);
    };

    public static void main(String[] args) {
        exampleOne();
    }

}
