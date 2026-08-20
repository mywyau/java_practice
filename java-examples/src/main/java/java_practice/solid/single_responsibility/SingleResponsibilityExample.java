package java_practice.solid.single_responsibility;

/**
 * S — Single Responsibility Principle
 *
 * A class should have one reason to change. Invoice calculates a total while
 * InvoicePrinter handles presentation. A tax-rule change and an output-format
 * change therefore affect different classes.
 */
public class SingleResponsibilityExample {

    record Invoice(String item, int quantity, double unitPrice) {
        double total() {
            return quantity * unitPrice;
        }
    }

    static class InvoicePrinter {
        String format(Invoice invoice) {
            return "%d × %s = £%.2f".formatted(
                    invoice.quantity(), invoice.item(), invoice.total());
        }
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("Java book", 2, 24.99);
        System.out.println(new InvoicePrinter().format(invoice));
    }
}
