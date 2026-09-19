# DSA Technique Notes

This guide assumes you know basic Java but are new to algorithm problems. You do
not need to memorise every solution. The goal is to recognise a small number of
patterns and understand why they work.

For Java-specific shorthand, keep [`JAVA_DSA_SYNTAX.md`](JAVA_DSA_SYNTAX.md)
open beside the implementation.

## What an algorithm problem is testing

Most DSA questions combine three skills:

1. **Model the problem**: decide which information matters and which details can
   be ignored.
2. **Choose a data structure or pattern**: for example, a set for fast membership,
   a queue for breadth-first search, or two pointers for a sorted array.
3. **Prove and analyse the solution**: explain why it returns the right answer and
   estimate how its work and memory grow with the input.

LeetCode-style method signatures usually omit input/output code. You are given
parameters, such as an array and a target, and return the requested result. The
platform constructs the inputs and calls your method.

## A repeatable problem-solving workflow

### 1. Restate the problem

Write one sentence in your own words. Identify:

- the input and expected output;
- whether the input is sorted, unique, positive, connected, or otherwise constrained;
- whether you may modify the input;
- what should happen for empty input, no solution, duplicates, or negative values.

Constraints are clues. “Sorted array” often suggests binary search or two pointers.
“Shortest unweighted path” suggests BFS. “Top k” often suggests a heap.

### 2. Find a correct simple solution

Start with a brute-force approach even when it is slow. It clarifies the required
behaviour and gives you something against which to compare an optimised solution.
For `TwoSum`, checking every pair is `O(n²)` but establishes what counts as a pair.

### 3. Locate repeated work

Ask what the brute-force approach calculates repeatedly. Typical improvements are:

- remember earlier answers in a map or DP array;
- maintain a running sum rather than summing a window again;
- sort once so later decisions become local;
- traverse from several sources once rather than searching from every destination.

### 4. State the invariant

An **invariant** is a fact that remains true after every iteration. Examples:

- before `write`, all required non-zero values are already in the correct order;
- a monotonic stack contains unresolved indexes in decreasing-value order;
- the binary-search target, if present, remains inside the search range;
- `dp[i]` contains the answer for the first `i` input items.

If you can state the invariant, the code is usually easier to write and debug.

### 5. Trace a tiny example

Use a three- to six-element input. Record pointer positions, the current collection,
and the partial answer after each iteration. Include an awkward example containing
duplicates, zeroes, or a missing answer—not only the normal example.

### 6. Test boundaries

Common cases are an empty input, one element, all equal elements, an answer at the
first or last position, no valid answer, integer overflow, and the smallest allowed
parameter. Only test cases permitted by the problem's constraints.

## Essential vocabulary

- **Index**: an array or string position, beginning at zero in Java.
- **Subarray/substring**: contiguous elements. `[2, 3]` can be a subarray of
  `[1, 2, 3, 4]`; `[1, 3]` cannot.
- **Subsequence**: elements kept in order but not necessarily adjacent.
- **In place**: modifying the supplied structure using little or no extra storage.
- **Stable order**: retained values stay in their original relative order.
- **Traversal**: visiting nodes or elements systematically.
- **Depth/height**: distance through levels of a tree. Check whether a question
  counts nodes or edges because conventions differ.
- **Connected component**: a group of graph nodes reachable from one another.
- **State**: information describing a partially solved problem.
- **Memoisation**: caching recursive results. **Tabulation** builds them iteratively.
- **Amortized time**: an occasional expensive operation averaged over a sequence
  of operations; the two-stack queue is a standard example.

## Big O without the mystery

Big O describes how resource use grows as the input grows. It normally ignores
constant multipliers and smaller terms. If a method performs `3n + 5` operations,
we describe it as `O(n)`.

| Complexity | Informal meaning | Common example in this project |
|---|---|---|
| `O(1)` | Work does not grow with input | Read an array index; stack `peek` |
| `O(log n)` | Repeatedly discard a fraction | Binary search |
| `O(n)` | Visit input once or a constant number of times | Move zeroes; DFS |
| `O(n log n)` | Usually sorting or `n` heap operations | Merge intervals |
| `O(n²)` | Compare many pairs or use nested full scans | Expand palindrome centers |
| `O(2ⁿ)` | Include/exclude choices | Subsets |
| `O(n!)` | Every ordering | Permutations |

Use separate symbols when inputs have different sizes: merging lists of lengths
`n` and `m` is `O(n + m)`, while graph traversal is `O(V + E)` for vertices and edges.

Space complexity measures additional memory. An output array is often excluded
from “extra space,” but maps, copied arrays, queues, heaps, and the recursive call
stack count. Always state the convention you are using.

## Pattern recognition guide

| Clue in the question | Pattern to consider | Typical state |
|---|---|---|
| Pair, complement, frequency, membership | Hash map or set | Seen values or counts |
| Sorted data, opposite ends | Two pointers | Left and right indexes |
| Contiguous range | Sliding window or prefix sum | Window boundaries and summary |
| Repeatedly need smallest/largest or top `k` | Heap | Best candidates so far |
| Nested structure or all combinations | Recursion/backtracking | Current node or current path |
| Shortest path with equal-cost edges | BFS | Queue and visited set |
| Reachability/components | DFS or BFS | Frontier and visited state |
| Dependencies before tasks | Topological sort | Indegrees and ready queue |
| Best/count answer from smaller answers | Dynamic programming | `dp` meaning and transition |
| A local choice can safely discard alternatives | Greedy | Best boundary/reach so far |
| Sorted search space or monotonic yes/no answer | Binary search | Candidate range |

## How to read each implementation

Use these notes after attempting a problem. For each implementation, identify:

1. **State** — the smallest information carried between steps.
2. **Invariant** — the fact that remains true throughout the loop or recursion.
3. **Progress** — why every step moves toward completion.

Then answer two further questions:

4. **Base/boundary case** — what is the smallest input, and how does it stop?
5. **Cost** — how often can each pointer, node, or value be processed?

## Worked trace: one-pass lookup

For `TwoSum([2, 7, 11, 15], 9)`, the complement is `target - current`:

| Index | Current | Needed | Previously stored | Result |
|---:|---:|---:|---|---|
| 0 | 2 | 7 | `{}` | Store `2 → 0` |
| 1 | 7 | 2 | `{2 → 0}` | Found index `0`; return `[0, 1]` |

Looking before storing prevents one occurrence from pairing with itself. The map
answers “where did I see this value?” in expected constant time, replacing the
inner loop of the brute-force solution.

## Worked trace: read/write pointers

For `MoveZeroes([0, 1, 0, 3, 12])`, `write` means “the next output position”:

| Value read | Action | Useful prefix | `write` |
|---:|---|---|---:|
| 0 | Skip | `[]` | 0 |
| 1 | Write at index 0 | `[1]` | 1 |
| 0 | Skip | `[1]` | 1 |
| 3 | Write at index 1 | `[1, 3]` | 2 |
| 12 | Write at index 2 | `[1, 3, 12]` | 3 |

The first pass guarantees that indexes before `write` contain all non-zero values
in their original order. The second pass fills indexes 3 and 4 with zero. The
expression `numbers[write++] = number` assigns using the old index and increments
afterwards; see the syntax guide for its expanded form.

## Worked trace: recursive tree return values

Consider a root with a left leaf and no right child:

```text
    10
   /
  5
```

For maximum depth:

1. `maxDepth(null)` returns `0`; this is the base case.
2. The leaf `5` receives `0` from both children and returns `1 + max(0, 0) = 1`.
3. The root receives `1` from the left and `0` from the right.
4. The root returns `1 + max(1, 0) = 2`.

Each call answers one precise question: “What is the maximum depth of the subtree
rooted here?” Defining that promise is usually the key to tree recursion.

## Worked trace: dynamic programming

For `ClimbingStairs(5)`, the number of ways to reach a step is the sum of the ways
to reach the two steps before it:

| Step | Ways | Reason |
|---:|---:|---|
| 0 | 1 | One way to make no moves |
| 1 | 1 | One single step |
| 2 | 2 | From step 1 or step 0 |
| 3 | 3 | `2 + 1` |
| 4 | 5 | `3 + 2` |
| 5 | 8 | `5 + 3` |

Only the previous two values are needed, so the implementation uses two variables
instead of an entire array. This is a space optimisation of the same DP recurrence.

## Recursion patterns compared

Recursion is not one algorithm. It is a way to express a problem in terms of
smaller versions of itself. These exercises use three important forms.

### 1. Return information from child subproblems

Tree problems commonly recurse into children and combine their answers:

```java
int solve(TreeNode node) {
    if (node == null) {
        return BASE_VALUE;
    }

    int leftAnswer = solve(node.left);
    int rightAnswer = solve(node.right);
    return combine(node, leftAnswer, rightAnswer);
}
```

Examples include maximum depth and lowest common ancestor. Ask:

- What does one call return?
- What should an empty subtree return?
- How are the left and right answers combined?

### 2. Traverse while marking visited state

Graph and grid DFS often returns nothing because discovery itself is the goal:

```java
void visit(Node node, Set<Node> visited) {
    if (node == null || visited.contains(node)) {
        return;
    }

    visited.add(node); // mark before following edges
    for (Node neighbor : node.neighbors) {
        visit(neighbor, visited);
    }
}
```

Unlike a tree, a graph may contain cycles and several paths to the same node.
Without `visited`, recursion may repeat work forever. Mark on discovery, before
recursing into neighbours.

### 3. Explore choices and undo them

Backtracking generates candidates using a mutable path:

```java
void search(List<Integer> path) {
    if (isComplete(path)) {
        answers.add(new ArrayList<>(path)); // save a snapshot
        return;
    }

    for (int choice : availableChoices) {
        path.add(choice);                   // choose
        search(path);                       // explore
        path.removeLast();                  // undo
    }
}
```

The copy is important: adding `path` itself would store several references to the
same mutable list. Undoing is equally important; without it, choices from one
branch leak into its siblings.

### Base cases and progress

A base case alone does not guarantee termination. Each recursive call must move
toward it:

- a tree call moves to a child;
- a grid call advances the word index or visits a new cell;
- a combination call reduces the remaining target;
- a permutation call marks one more value used.

If progress is unclear, write down the quantity that strictly decreases or
increases toward a bound.

### Recursion space

Each active call stores parameters and local variables on the call stack. A tree
of height `h` therefore uses `O(h)` recursive stack space. A balanced tree has
`h = O(log n)`, but a chain-shaped tree has `h = O(n)` and may overflow Java's
stack for a very large input. An iterative DFS replaces implicit call-stack space
with an explicit `Deque` but still needs memory for pending work.

### A recursion debugging checklist

1. Confirm the base case handles the smallest valid input.
2. Confirm every recursive call receives a smaller or newly discovered state.
3. Print entry and exit with the current depth when the call order is unclear.
4. Check whether mutable state must be copied, restored, or shared.
5. For graphs, confirm nodes are marked before their neighbours are visited.
6. For backtracking, pair every mutation with an undo operation.

## Arrays

- **One-pass lookup (`TwoSum`)**: store earlier values by index. Before storing the
  current value, look for its complement so one element cannot be used twice.
- **Running optimum (`BestTimeToBuyAndSellStock`, `MaximumSubarray`)**: retain only
  the best state needed by the next item. Kadane's choice is “extend or restart.”
- **Two directional passes (`ProductOfArrayExceptSelf`)**: prefix and suffix
  products replace division and naturally handle zeroes.
- **Sort then sweep (`MergeIntervals`)**: sorting by start turns arbitrary overlap
  into a local comparison with only the last merged interval.

## Strings

- **Character counts (`ValidAnagram`, `GroupAnagrams`)** turn ordering questions
  into equality of signatures. A sorted word is simple; a frequency key can be faster.
- **Inward pointers (`ValidPalindrome`)** work because only mirrored characters
  matter. Skip irrelevant characters before comparing.
- **Last-seen index (`LongestSubstringWithoutRepeatingCharacters`)** jumps the left
  boundary forward; never move it backward when an old duplicate is outside the window.
- **Expand around centers (`LongestPalindromicSubstring`)** handles both odd and
  even palindromes by trying one-character and two-character centers.

## Hashing

- **Sets (`ContainsDuplicate`)** answer “have I seen this?” in expected constant time.
- **Frequency buckets (`TopKFrequentElements`)** use frequency as an array index,
  avoiding a full sort when counts are bounded by the input length.
- **Cycle detection (`HappyNumber`)** uses slow and fast values just like a linked
  list; a repeated transformation means the process will never reach one.
- **Bidirectional maps (`IsomorphicStrings`)** enforce a one-to-one mapping. A map
  in only one direction incorrectly permits two characters to share a target.
- **Sequence starts (`LongestConsecutiveSequence`)** grow only from values without
  a predecessor, ensuring each sequence is traversed once.

## Two Pointers

- **Discard the limiting side (`ContainerWithMostWater`)**: width always shrinks,
  so only moving the shorter wall can possibly improve the area.
- **Read/write pointers (`MoveZeroes`, `RemoveDuplicatesFromSortedArray`)** separate
  inspecting input from placing the next retained value.
- **Fill from the largest end (`SquaresOfSortedArray`)** because the largest square
  is at either edge even though negative values appear first.
- **Fix one, search two (`ThreeSum`)** reduces three nested loops to a sorted
  two-pointer scan. Skip duplicates at every decision level.

## Sliding Window

- **Fixed window (`MaximumAverageSubarray`, `PermutationInString`)** adds the new
  right value and removes the value that just left on the left.
- **Variable window (`MinimumSizeSubarraySum`, `MinimumWindowSubstring`)** expands
  until valid, then shrinks while validity remains to find the tightest answer.
- **Budgeted invalidity (`LongestRepeatingCharacterReplacement`)** keeps a window
  while `window length - largest frequency <= replacements`.
- Sliding-window sums require non-negative values when shrinking is based on the
  sum; negative values break that monotonic reasoning.

## Linked Lists

- **Pointer reversal (`ReverseLinkedList`)** saves `next` before changing it; losing
  that reference loses the remainder of the list.
- **Fast and slow pointers (`LinkedListCycle`)** must meet inside a cycle because
  the faster pointer gains one node per step.
- **Dummy heads (`MergeTwoSortedLists`, `RemoveNthNodeFromEnd`)** remove special
  cases when the real head is inserted or removed.
- **Gap pointers (`RemoveNthNodeFromEnd`)** keep the pointers `n` nodes apart, so
  the slower one reaches the predecessor of the node to remove.
- **Split, reverse, weave (`ReorderList`)** is a useful pattern for in-place list
  rearrangement. Disconnect the halves before merging them.

## Stacks and Queues

- **Matching stack (`ValidParentheses`)** stores unresolved opening brackets.
- **Parallel state (`MinStack`)** stores the minimum at every depth, making removal
  automatically restore the previous minimum.
- **Operand order (`EvaluateReversePolishNotation`)** matters for subtraction and
  division: the first popped value is the right operand.
- **Monotonic stack (`DailyTemperatures`)** holds unresolved indices in decreasing
  temperature order; each index is pushed and popped at most once.
- **Lazy transfer (`ImplementQueueUsingStacks`)** moves input only when output is
  empty. Each value moves once, giving amortized constant-time operations.

## Binary Search

- Binary search needs a **monotonic decision**: one side can be proven impossible.
- **Classic search** uses a closed interval `[left, right]`; update past `middle` so
  the interval always shrinks.
- **Rotated arrays** still have at least one sorted half. Decide which half is sorted
  before checking whether the target lies within it.
- **Boundary search (`FirstAndLastPosition`)** finds insertion boundaries rather
  than stopping at an arbitrary match.
- **Search the answer (`KokoEatingBananas`)** because “can finish at this speed”
  changes only once from false to true.
- Calculate the midpoint as `left + (right - left) / 2` to avoid integer overflow.

## Trees

- Recursive tree methods define the **meaning of the return value** first: subtree
  depth, inverted subtree root, validity, or a discovered target.
- **Level order** uses the queue size captured before processing as the exact size
  of the current level.
- **BST validation** carries exclusive lower and upper bounds; comparing only with
  a node's parent misses violations deeper in a subtree.
- **Lowest common ancestor** returns a found target upward. Non-null results from
  both sides mean the current node is the split point.
- Recursion uses `O(h)` stack space: balanced trees have logarithmic height, while
  a chain-shaped tree has linear height.

## Heaps

- A heap is useful when only the **next extreme** or the best `k` items matter.
- **Size-k min-heap (`KthLargestElement`)** discards everything below the current
  top `k`; the root is therefore the kth largest.
- **Size-k max-heap (`KClosestPointsToOrigin`)** keeps the worst retained point at
  the root so it is cheap to replace.
- **Repeated maximum (`LastStoneWeight`)** directly models the problem with a max-heap.
- **K-way merge (`MergeKSortedLists`)** keeps one candidate per list, so the heap
  size depends on the number of lists rather than the total node count.
- **Frequency formula (`TaskScheduler`)** treats the most frequent tasks as a frame;
  other tasks fill its gaps, and the final answer cannot be shorter than the task count.

## Graphs

- **Flood fill (`NumberOfIslands`)** marks a node when it is discovered, preventing
  duplicate work and cycles.
- **Clone with a map (`CloneGraph`)** creates and records the copy before visiting
  neighbors; this is essential when edges lead back to an earlier node.
- **Topological sort (`CourseSchedule`)** repeatedly removes zero-indegree courses.
  Processing fewer than all courses proves a directed cycle exists.
- **Reverse reachability (`PacificAtlanticWaterFlow`)** searches uphill from each
  ocean rather than starting a separate downhill search from every cell.
- **Breadth-first search (`WordLadder`)** explores transformations by distance, so
  the first arrival at the target is the shortest path.

## Backtracking

- Backtracking follows **choose → explore → undo**. Copy the current path only when
  recording an answer; otherwise reuse it to avoid excess allocation.
- **Start index (`Subsets`, `CombinationSum`)** prevents reordered duplicates.
  Reuse the same index when a candidate may be chosen again.
- **Used markers (`Permutations`)** track which values are already in the ordering.
- **Valid-prefix rules (`GenerateParentheses`)** prune impossible branches early:
  never close more pairs than have been opened.
- **Temporary marking (`WordSearch`)** prevents revisiting a board cell on the same
  path. Restore the cell before returning so other paths can use it.

## Dynamic Programming

- DP stores answers to overlapping subproblems. State precisely what `dp[i]` means
  before writing the transition.
- **Rolling state (`ClimbingStairs`, `HouseRobber`)** reduces space when the next
  answer depends on only the previous one or two answers.
- **Bottom-up minimum (`CoinChange`)** starts with an unreachable sentinel and
  improves amounts using already-solved smaller amounts.
- **Smallest tails (`LongestIncreasingSubsequence`)** does not store the actual
  sequence; it stores the easiest possible ending value for each length.
- **Reachable prefixes (`WordBreak`)** mark where a valid segmentation can end.
  A word is useful only when the prefix before it was already reachable.

## Greedy

- A greedy algorithm commits to a local choice only when an **exchange argument**
  shows an optimal solution can use that choice without becoming worse.
- **Farthest reach (`JumpGame`)** summarizes every path available so far.
- **Reset after deficit (`GasStation`)**: if a start fails before station `i`, none
  of the stations crossed with that same accumulated deficit can be a valid start.
- **Last occurrence (`PartitionLabels`)** closes a partition only after every
  character seen in it has made its final appearance.
- **Earliest finish (`NonOverlappingIntervals`)** leaves the most room for future intervals.
- **Smallest first (`HandOfStraights`)** forces the beginning of each consecutive
  group; delaying the smallest remaining card cannot help.

## Bit Manipulation

- XOR is associative and `x ^ x == 0`, which powers `SingleNumber` and lets
  `MissingNumber` cancel matching indexes and values.
- `n & (n - 1)` clears the lowest set bit, so `NumberOfOneBits` loops once per one-bit.
- `CountingBits` reuses `count[i >> 1]` and adds the low bit `i & 1`.
- `ReverseBits` uses unsigned right shift (`>>>`) so leading zeroes enter even when
  the input's sign bit is set.

## Complexity checklist

- Nested loops are not automatically quadratic: if two pointers only move forward,
  the combined work can still be linear.
- Sorting usually contributes `O(n log n)` even when the following scan is linear.
- Output storage is normally excluded from “extra space,” but recursion stacks,
  maps, queues, copied input, and temporary arrays are included.
- Use `long` for intermediate sums, products, distances, and hour counts when an
  `int` could overflow before the final result is produced.
