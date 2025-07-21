// src/main/java/java_practice/dep_injection/Ticket.java
package java_practice.abstract_class;

public class Ticket {
    
    private final String id;
    // add whatever fields you need

    public Ticket(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    // maybe toString(), equals(), etc.
}