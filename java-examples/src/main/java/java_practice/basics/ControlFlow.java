package java_practice.basics;

public class ControlFlow {

    int x = 10;

    public void ifElseMethod() {
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is 5 or less");
        }
    }

    public void ifElseMethod2(int x) {
        if (x > 5) {
            System.out.println("Help me x:" + x);
        } else {
            System.out.println("Kill me x is less than 5, x: " + x);
        }
    }

    public static void main(String[] args) {
        ControlFlow controlFlow = new ControlFlow();

        controlFlow.ifElseMethod2(controlFlow.x);
    }

}