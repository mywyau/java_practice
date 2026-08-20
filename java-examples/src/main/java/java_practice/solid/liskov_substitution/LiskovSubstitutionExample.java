package java_practice.solid.liskov_substitution;

import java.util.List;

/**
 * L — Liskov Substitution Principle
 *
 * A subtype must honour its parent's promises. Modelling every bird with fly()
 * would make Penguin a surprising subtype. Separating Bird from FlyingBird
 * means every FlyingBird can safely be used by makeItFly().
 */
public class LiskovSubstitutionExample {

    interface Bird {
        String name();
    }

    interface FlyingBird extends Bird {
        String fly();
    }

    record Sparrow(String name) implements FlyingBird {
        @Override
        public String fly() {
            return name + " flies through the air";
        }
    }

    record Penguin(String name) implements Bird {
    }

    static void makeItFly(FlyingBird bird) {
        System.out.println(bird.fly());
    }

    public static void main(String[] args) {
        List<Bird> birds = List.of(new Sparrow("Jack"), new Penguin("Pip"));
        birds.forEach(bird -> System.out.println("Observed: " + bird.name()));
        makeItFly(new Sparrow("Jack"));
    }
}
