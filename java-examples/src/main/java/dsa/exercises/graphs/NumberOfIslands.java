package dsa.exercises.graphs;

import dsa.exercises.DsaExercise;

/**
 * Count connected land regions in a grid.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class NumberOfIslands implements DsaExercise {
    // Mark land when discovered so each connected component is counted once.
    public static int numIslands(char[][] grid) { boolean[][] visited = new boolean[grid.length][]; for (int row = 0; row < grid.length; row++) visited[row] = new boolean[grid[row].length]; int count = 0; for (int row = 0; row < grid.length; row++) for (int column = 0; column < grid[row].length; column++) if (grid[row][column] == '1' && !visited[row][column]) { count++; flood(grid, visited, row, column); } return count; }
    private static void flood(char[][] grid, boolean[][] visited, int row, int column) { if (row < 0 || row >= grid.length || column < 0 || column >= grid[row].length || visited[row][column] || grid[row][column] != '1') return; visited[row][column] = true; flood(grid, visited, row + 1, column); flood(grid, visited, row - 1, column); flood(grid, visited, row, column + 1); flood(grid, visited, row, column - 1); }

    @Override
    public String problem() {
        return "Count connected land regions in a grid.";
    }

    @Override
    public String hint() {
        return "Start DFS or BFS at each unvisited land cell.";
    }

    @Override
    public String targetComplexity() {
        return "O(rows·cols) time and space";
    }

    public static void main(String[] args) {
        new NumberOfIslands().printGuide();
    }
}
