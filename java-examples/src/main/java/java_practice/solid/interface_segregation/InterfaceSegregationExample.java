package java_practice.solid.interface_segregation;

/**
 * I — Interface Segregation Principle
 *
 * Small role-specific interfaces prevent a basic printer from implementing
 * scan() or fax() with errors or meaningless empty methods.
 */
public class InterfaceSegregationExample {

    interface Printer {
        void print(String document);
    }

    interface Scanner {
        String scan();
    }

    static class BasicPrinter implements Printer {
        @Override
        public void print(String document) {
            System.out.println("Printing: " + document);
        }
    }

    static class MultiFunctionPrinter implements Printer, Scanner {
        @Override
        public void print(String document) {
            System.out.println("Printing: " + document);
        }

        @Override
        public String scan() {
            return "scanned-document.pdf";
        }
    }

    public static void main(String[] args) {
        Printer basicPrinter = new BasicPrinter();
        basicPrinter.print("SOLID notes");

        MultiFunctionPrinter officePrinter = new MultiFunctionPrinter();
        System.out.println("Created: " + officePrinter.scan());
    }
}
