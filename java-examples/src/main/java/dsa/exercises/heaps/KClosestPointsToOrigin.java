package dsa.exercises.heaps;

import dsa.exercises.DsaExercise;

/**
 * Return the k points nearest to the origin.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class KClosestPointsToOrigin implements DsaExercise {
    // Keep the worst retained point at the max-heap root so it is cheap to replace.
    public static int[][] kClosest(int[][] points, int k) { if (k < 0 || k > points.length) throw new IllegalArgumentException("invalid k"); java.util.PriorityQueue<int[]> heap = new java.util.PriorityQueue<>((a, b) -> Long.compare(distance(b), distance(a))); for (int[] point : points) { heap.add(point); if (heap.size() > k) heap.remove(); } int[][] result = new int[k][]; for (int i = 0; i < k; i++) result[i] = heap.remove().clone(); return result; }
    private static long distance(int[] point) { return (long) point[0] * point[0] + (long) point[1] * point[1]; }

    @Override
    public String problem() {
        return "Return the k points nearest to the origin.";
    }

    @Override
    public String hint() {
        return "Keep a size-k max-heap ordered by squared distance.";
    }

    @Override
    public String targetComplexity() {
        return "O(n log k) time, O(k) space";
    }

    public static void main(String[] args) {
        new KClosestPointsToOrigin().printGuide();
    }
}
