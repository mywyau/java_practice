
package java_practice;

public class App {

    public String getGreeting() {
        return "\nHello World!\n";
    }

    public static void main(String[] args) {

        ControlFlow controlFlow = new ControlFlow();
        ForLoops forLoops = new ForLoops();        
        Dog myDog = new Dog("Buddy", 3);
        SwitchStatements switchStatements = new SwitchStatements();

        While whileLoop = new While();

        System.out.println(new App().getGreeting());

        controlFlow.ifElseMethod();
        myDog.bark();
        forLoops.printNumbers();
        whileLoop.whileLoop();
        
        System.out.println(switchStatements.dayName);
    }
}
