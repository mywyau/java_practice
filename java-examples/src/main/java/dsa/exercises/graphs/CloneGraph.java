package dsa.exercises.graphs;

import dsa.exercises.DsaExercise;

/**
 * Create a deep copy of a connected graph.
 *
 * Learning workflow: write a solution method, add edge cases, then compare its
 * complexity with targetComplexity().
 */
public class CloneGraph implements DsaExercise {
    // Record each copy before following edges so cycles reuse it instead of recursing forever.
    public static class Node { public int value; public java.util.List<Node> neighbors = new java.util.ArrayList<>(); public Node(int value) { this.value = value; } }
    public static Node cloneGraph(Node node) { return clone(node, new java.util.IdentityHashMap<>()); }
    private static Node clone(Node node, java.util.Map<Node, Node> copies) { if (node == null) return null; if (copies.containsKey(node)) return copies.get(node); Node copy = new Node(node.value); copies.put(node, copy); for (Node neighbor : node.neighbors) copy.neighbors.add(clone(neighbor, copies)); return copy; }

    @Override
    public String problem() {
        return "Create a deep copy of a connected graph.";
    }

    @Override
    public String hint() {
        return "Map each original node to its clone during DFS or BFS.";
    }

    @Override
    public String targetComplexity() {
        return "O(V+E) time, O(V) space";
    }

    public static void main(String[] args) {
        new CloneGraph().printGuide();
    }
}
