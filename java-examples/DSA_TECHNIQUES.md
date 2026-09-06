# DSA Technique Notes

Use these notes after attempting a problem. For each implementation, identify:

1. **State** — the smallest information carried between steps.
2. **Invariant** — the fact that remains true throughout the loop or recursion.
3. **Progress** — why every step moves toward completion.

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
