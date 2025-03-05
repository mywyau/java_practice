package java_practice;

public class Dog {
    // Fields
    String name;
    int age;

    // Constructor
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void bark() {
        String message = String.format("\n%s says woof!.\n", name);
        //System.out.println(name + " says woof!");
        System.out.println(message);
    }
}

// Usage
