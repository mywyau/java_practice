package dsa.exercises.graphs;

import dsa.exercises.DsaExercise;

/**
 * Find cells that can reach both ocean boundaries.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class PacificAtlanticWaterFlow implements DsaExercise {
    // Search uphill from each ocean; intersection means water can flow to both downhill.
    public static java.util.List<java.util.List<Integer>> pacificAtlantic(int[][] heights) { java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>(); if (heights.length == 0) return result; int rows = heights.length, columns = heights[0].length; boolean[][] pacific = new boolean[rows][columns], atlantic = new boolean[rows][columns]; for (int row = 0; row < rows; row++) { flow(heights, pacific, row, 0, Integer.MIN_VALUE); flow(heights, atlantic, row, columns - 1, Integer.MIN_VALUE); } for (int column = 0; column < columns; column++) { flow(heights, pacific, 0, column, Integer.MIN_VALUE); flow(heights, atlantic, rows - 1, column, Integer.MIN_VALUE); } for (int row = 0; row < rows; row++) for (int column = 0; column < columns; column++) if (pacific[row][column] && atlantic[row][column]) result.add(java.util.List.of(row, column)); return result; }
    private static void flow(int[][] heights, boolean[][] reached, int row, int column, int previous) { if (row < 0 || row >= heights.length || column < 0 || column >= heights[0].length || reached[row][column] || heights[row][column] < previous) return; reached[row][column] = true; int height = heights[row][column]; flow(heights, reached, row + 1, column, height); flow(heights, reached, row - 1, column, height); flow(heights, reached, row, column + 1, height); flow(heights, reached, row, column - 1, height); }

    @Override
    public String problem() {
        return "Find cells that can reach both ocean boundaries.";
    }

    @Override
    public String hint() {
        return "Search backward from each ocean into non-decreasing heights.";
    }

    @Override
    public String targetComplexity() {
        return "O(rows·cols) time and space";
    }

    public static void main(String[] args) {
        new PacificAtlanticWaterFlow().printGuide();
    }
}
