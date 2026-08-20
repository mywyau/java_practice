package java_practice.dep_injection;

// Wiring up manually
public class Main {
    public static void main(String[] args) {
        PaymentProcessor stripe = new StripeProcessor();
        OrderService service = new OrderService(stripe);
        service.placeOrder(new Order("orderId1"));
    }
}