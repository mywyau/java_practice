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
<<<<<<< HEAD:app/src/main/java/java_practice/Dog.java
        //System.out.println(name + " says woof!");
=======
>>>>>>> 4d7d993 (checkpoint):app/src/main/java/java_practice/basics/Dog.java
        System.out.println(message);
    }
}

// Usage
