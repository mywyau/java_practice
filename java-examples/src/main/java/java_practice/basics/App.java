
package java_practice.basics;

public class App {

    public String getGreeting() {
        return "\nHello World!\n";
    }

    public static void main(String[] args) {

        ControlFlow controlFlow = new ControlFlow();
        Dog myDog = new Dog("Buddy", 3);
        SwitchStatements switchStatements = new SwitchStatements();

        While whileLoop = new While();

        System.out.println(new App().getGreeting());

        controlFlow.ifElseMethod();
        myDog.bark();
        whileLoop.whileLoop();

        switchStatements.basicExpressionSwitch();
    }
}
