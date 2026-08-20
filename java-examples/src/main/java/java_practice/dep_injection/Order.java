// src/main/java/java_practice/dep_injection/Order.java
package java_practice.dep_injection;

public class Order {
    
    private final String id;
    // add whatever fields you need

    public Order(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    // maybe toString(), equals(), etc.
}