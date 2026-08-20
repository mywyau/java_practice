package dsa.exercises;

/** A small common contract that makes every exercise runnable and discoverable. */
public interface DsaExercise {
    String problem();
    String hint();
    String targetComplexity();

    default void printGuide() {
        System.out.println("Problem: " + problem());
        System.out.println("Hint: " + hint());
        System.out.println("Target: " + targetComplexity());
    }
}
