error id: file://<WORKSPACE>/java-examples/src/main/java/dsa/exercises/sliding_window/MaximumAverageSubarray.java:dsa/exercises/sliding_window/MaximumAverageSubarray#printGuide#
file://<WORKSPACE>/java-examples/src/main/java/dsa/exercises/sliding_window/MaximumAverageSubarray.java
empty definition using pc, found symbol in pc: dsa/exercises/sliding_window/MaximumAverageSubarray#printGuide#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1344
uri: file://<WORKSPACE>/java-examples/src/main/java/dsa/exercises/sliding_window/MaximumAverageSubarray.java
text:
```scala
package dsa.exercises.sliding_window;

import dsa.exercises.DsaExercise;

/**
 * Find the largest average among windows of size k.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class MaximumAverageSubarray implements DsaExercise {
    // Update the fixed window by adding its entrant and removing its leaver.
    public static double findMaxAverage(
            int[] numbers, 
            int k
        ) {
        if (k <= 0 || k > numbers.length)
            throw new IllegalArgumentException("invalid window size");
        long sum = 0;
        for (int i = 0; i < k; i++)
            sum += numbers[i];
        long best = sum;
        for (int i = k; i < numbers.length; i++) {
            sum += numbers[i] - numbers[i - k];
            best = Math.max(best, sum);
        }
        return (double) best / k;
    }

    @Override
    public String problem() {
        return "Find the largest average among windows of size k.";
    }

    @Override
    public String hint() {
        return "Update a rolling sum by adding one value and removing one.";
    }

    @Override
    public String targetComplexity() {
        return "O(n) time, O(1) space";
    }

    public static void main(String[] args) {
        new MaximumAverageSubarray().printG@@uide();
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: dsa/exercises/sliding_window/MaximumAverageSubarray#printGuide#