package java_practice.solid.open_closed;

import java.util.List;

/**
 * O — Open/Closed Principle
 *
 * DiscountCalculator does not need another if/switch branch when a discount is
 * added. New behaviour is introduced by implementing DiscountPolicy.
 */
public class OpenClosedExample {

    interface DiscountPolicy {
        double apply(double price);
    }

    record PercentageDiscount(double percentage) implements DiscountPolicy {
        @Override
        public double apply(double price) {
            return price * (1 - percentage / 100);
        }
    }

    record FixedDiscount(double amount) implements DiscountPolicy {
        @Override
        public double apply(double price) {
            return Math.max(0, price - amount);
        }
    }

    static class DiscountCalculator {
        double applyAll(double price, List<DiscountPolicy> policies) {
            double result = price;
            for (DiscountPolicy policy : policies) {
                result = policy.apply(result);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        List<DiscountPolicy> policies = List.of(
                new PercentageDiscount(10), new FixedDiscount(5));
        double result = new DiscountCalculator().applyAll(100, policies);
        System.out.printf("Discounted price: £%.2f%n", result);
    }
}
