package dsa.exercises.backtracking;

import dsa.exercises.DsaExercise;

/**
 * Determine whether a word can be traced through adjacent grid cells.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class WordSearch implements DsaExercise {
    // Temporarily mark a cell during one path, then restore it for other paths.
    public static boolean exist(char[][] board, String word) { if (word.isEmpty()) return true; for (int row = 0; row < board.length; row++) for (int column = 0; column < board[row].length; column++) if (find(board, word, row, column, 0)) return true; return false; }
    private static boolean find(char[][] board, String word, int row, int column, int index) { if (index == word.length()) return true; if (row < 0 || row >= board.length || column < 0 || column >= board[row].length || board[row][column] != word.charAt(index)) return false; char saved = board[row][column]; board[row][column] = '\0'; boolean found = find(board, word, row + 1, column, index + 1) || find(board, word, row - 1, column, index + 1) || find(board, word, row, column + 1, index + 1) || find(board, word, row, column - 1, index + 1); board[row][column] = saved; return found; }

    @Override
    public String problem() {
        return "Determine whether a word can be traced through adjacent grid cells.";
    }

    @Override
    public String hint() {
        return "DFS while temporarily marking cells as visited.";
    }

    @Override
    public String targetComplexity() {
        return "O(rows·cols·4^wordLength) time";
    }

    public static void main(String[] args) {
        new WordSearch().printGuide();
    }
}
