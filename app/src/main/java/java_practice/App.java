
package java_practice;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        ControlFlow controlFlow = new ControlFlow();
        ForLoops forLoops = new ForLoops();        
        Dog myDog = new Dog("Buddy", 3);
        SwitchStatements switchStatements = new SwitchStatements();

        System.out.println(new App().getGreeting());

        controlFlow.ifElseMethod();
        myDog.bark();
        forLoops.printNumbers();
        
        System.out.println(switchStatements.dayName);
    }
}
