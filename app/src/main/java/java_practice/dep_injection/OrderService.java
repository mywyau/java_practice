package java_practice.dep_injection;

// Client with constructor injection
public class OrderService {
    private final PaymentProcessor processor;
    public OrderService(PaymentProcessor processor) {
        this.processor = processor;
    }
    public void placeOrder(Order o) {
        // ... business logic ...
        processor.process(o);
    }
}