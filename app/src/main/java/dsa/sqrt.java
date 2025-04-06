
package dsa;

// Complexity Analysis
// Time Complexity: O(log x) - Due to binary search.

// Space Complexity: O(1) - Uses constant space.

public class Sqrt {

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
        
        System.out.println(switchStatements.dayName);
    }
}
