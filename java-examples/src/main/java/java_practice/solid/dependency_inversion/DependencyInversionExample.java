package java_practice.solid.dependency_inversion;

/**
 * D — Dependency Inversion Principle
 *
 * OrderService contains high-level checkout policy. It depends on the
 * PaymentGateway abstraction and receives the concrete detail through its
 * constructor. Tests could inject a fake gateway without contacting a bank.
 */
public class DependencyInversionExample {

    interface PaymentGateway {
        void charge(double amount);
    }

    static class CardPaymentGateway implements PaymentGateway {
        @Override
        public void charge(double amount) {
            System.out.printf("Charged £%.2f to the card%n", amount);
        }
    }

    static class FakePaymentGateway implements PaymentGateway {
        private double lastCharge;

        @Override
        public void charge(double amount) {
            lastCharge = amount;
        }

        double lastCharge() {
            return lastCharge;
        }
    }

    static class OrderService {
        private final PaymentGateway paymentGateway;

        OrderService(PaymentGateway paymentGateway) {
            this.paymentGateway = paymentGateway;
        }

        void checkout(double total) {
            if (total <= 0) {
                throw new IllegalArgumentException("Total must be positive");
            }
            paymentGateway.charge(total);
        }
    }

    public static void main(String[] args) {
        new OrderService(new CardPaymentGateway()).checkout(49.99);

        FakePaymentGateway fake = new FakePaymentGateway();
        new OrderService(fake).checkout(10);
        System.out.printf("Test fake recorded: £%.2f%n", fake.lastCharge());
    }
}
