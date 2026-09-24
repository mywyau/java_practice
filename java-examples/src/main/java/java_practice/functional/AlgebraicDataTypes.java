package java_practice.functional;

/** Sealed interfaces plus records model a closed set of immutable cases. */
public class AlgebraicDataTypes {

    sealed interface PaymentResult permits Approved, Declined, Unavailable {
    }

    record Approved(String transactionId) implements PaymentResult {
    }

    record Declined(String reason) implements PaymentResult {
    }

    record Unavailable(int retryAfterSeconds) implements PaymentResult {
    }

    static String message(PaymentResult result) {
        // The compiler checks that every permitted case is handled.
        return switch (result) {
            case Approved approved -> "Approved: " + approved.transactionId();
            case Declined declined -> "Declined: " + declined.reason();
            case Unavailable unavailable -> "Try again in " + unavailable.retryAfterSeconds() + " seconds";
        };
    }

    public static void main(String[] args) {
        System.out.println(message(new Approved("txn-123")));
        System.out.println(message(new Declined("Insufficient funds")));
        System.out.println(message(new Unavailable(30)));
    }
}
