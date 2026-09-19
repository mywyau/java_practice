# 75 DSA Practice Questions
The questions are ordered roughly from foundational patterns to more advanced topics. Each class compiles and prints a prompt, hint, and complexity target.

Every problem class now contains a callable reference implementation. The Arrays
section additionally includes runnable examples and focused edge-case tests. A
useful learning loop is to attempt each problem first, compare your approach with
the reference, and then change or add a test to check your understanding.

See [`DSA_TECHNIQUES.md`](DSA_TECHNIQUES.md) for beginner-oriented notes explaining
the reusable patterns, worked examples, invariants, and common pitfalls behind
the implementations.
See [`JAVA_DSA_SYNTAX.md`](JAVA_DSA_SYNTAX.md) when Java shorthand in a solution
is unfamiliar; it expands the shortcuts into beginner-friendly equivalents.

Run one with:

```bash
./gradlew :java-examples:runExample -PmainClass=dsa.exercises.arrays.TwoSum
```

## How to use a question

For each problem, use this sequence instead of immediately reading the solution:

1. Read `problem()`, then write down the input, output, and one example by hand.
2. Read `hint()` and name the suggested data structure or pattern.
3. Describe a simple brute-force solution and its likely complexity.
4. Attempt the solution for 20–30 minutes.
5. Read the reference method one block at a time. Expand unfamiliar Java using
   [`JAVA_DSA_SYNTAX.md`](JAVA_DSA_SYNTAX.md).
6. Trace the method with a tiny input, recording every important variable.
7. Close the reference and implement it again from the invariant, not from memory.
8. Add a test that covers a case the existing tests do not cover.

The class-level target complexity is a goal, not enough by itself to prove the
solution. Try to explain why each input element can be visited only once, why a
range halves, or why a heap contains at most `k` values.

## Suggested beginner order

The sections below are grouped by topic, but this order gives a gentler progression:

1. Arrays: `TwoSum`, stock profit, maximum subarray.
2. Hashing: duplicate detection, anagrams, consecutive sequences.
3. Two pointers: move zeroes, remove duplicates, palindrome, sorted squares.
4. Fixed and variable sliding windows.
5. Stacks and queues.
6. Binary search.
7. Linked lists.
8. Trees and recursive DFS.
9. Heaps and graph traversal.
10. Backtracking.
11. One-dimensional dynamic programming.
12. Greedy and bit manipulation.

Within a section, the list is approximately introductory to more involved, though
difficulty varies by person. It is normal for `ThreeSum`, `MinimumWindowSubstring`,
`ReorderList`, `WordLadder`, and `LongestIncreasingSubsequence` to take several
attempts. Treat them as pattern-combination problems rather than starting points.

## Understanding question constraints

The short prompts mirror common interview problems. Before coding, make the usual
constraints explicit:

- Does the problem promise a solution? If not, decide how absence is represented.
- Are values distinct? Duplicates often change pointer movement or map handling.
- Is the input sorted? Never use a sorted-only technique without this guarantee.
- Are numbers positive? Some sliding-window sum techniques fail with negatives.
- Can the input be empty or `null`? Online judges often specify this precisely.
- May the method mutate the input? Sorting and linked-list rewiring are mutations.
- Can arithmetic overflow `int`? Use `long` for intermediate calculations when needed.

The reference implementations follow the conventional constraints for the named
problems. When adapting them to production code, add validation for your actual API.

## Arrays

Start here to practise loops, indexes, running state, and the difference between
returning a new array and modifying an existing one.

- `TwoSum` — Find two indices whose values add to a target.
- `BestTimeToBuyAndSellStock` — Find the maximum profit from one buy followed by one sale.
- `MaximumSubarray` — Find the contiguous subarray with the largest sum.
- `ProductOfArrayExceptSelf` — Return products of all other elements without division.
- `MergeIntervals` — Merge all overlapping numeric intervals.

## Strings

Strings are indexed sequences of characters. These questions introduce character
normalisation, frequency signatures, and windows over contiguous text.

- `ValidAnagram` — Decide whether two strings contain identical character counts.
- `LongestSubstringWithoutRepeatingCharacters` — Find the longest substring containing no repeated characters.
- `ValidPalindrome` — Ignore punctuation and case, then test whether a string is a palindrome.
- `GroupAnagrams` — Group words that are anagrams of one another.
- `LongestPalindromicSubstring` — Find the longest contiguous palindrome.

## Hashing

Use this section to learn when extra memory can remove repeated searching. `HashMap`
and `HashSet` operations are expected `O(1)`, though worst-case behaviour can differ.

- `ContainsDuplicate` — Determine whether an array contains a repeated value.
- `TopKFrequentElements` — Return the k most frequent values.
- `HappyNumber` — Detect whether repeatedly summing squared digits reaches one.
- `IsomorphicStrings` — Check whether characters in two strings map one-to-one.
- `LongestConsecutiveSequence` — Find the longest run of consecutive integers in any order.

## Two Pointers

Before coding, state why moving a particular pointer cannot discard a better answer.
This proof is the heart of the technique, not the two variables themselves.

- `ThreeSum` — Find unique triplets whose sum is zero.
- `ContainerWithMostWater` — Find two lines that hold the most water.
- `RemoveDuplicatesFromSortedArray` — Remove duplicates in place and return the new length.
- `MoveZeroes` — Move all zeroes to the end while preserving other values.
- `SquaresOfSortedArray` — Return sorted squares of a sorted array.

## Sliding Window

Every window needs clear add, remove, and validity rules. Draw the inclusive range
`[left, right]` and decide exactly when the left edge is allowed to move.

- `MaximumAverageSubarray` — Find the largest average among windows of size k.
- `MinimumSizeSubarraySum` — Find the shortest positive-number window meeting a target sum.
- `PermutationInString` — Check whether one string's permutation occurs in another.
- `LongestRepeatingCharacterReplacement` — Find the longest window made uniform with at most k replacements.
- `MinimumWindowSubstring` — Find the smallest substring containing all required characters.

## Linked Lists

Draw node boxes and arrows. Record references before changing `.next`; unlike array
indexes, a lost node reference may make the rest of the structure unreachable.

- `ReverseLinkedList` — Reverse a singly linked list in place.
- `LinkedListCycle` — Determine whether a linked list contains a cycle.
- `MergeTwoSortedLists` — Merge two sorted linked lists.
- `RemoveNthNodeFromEnd` — Remove the nth node measured from the list's end.
- `ReorderList` — Reorder L0→L1→… as L0→Ln→L1→Ln-1→….

## Stacks Queues

A stack is last-in-first-out; a queue is first-in-first-out. Focus on what unresolved
work each stored value represents rather than treating the collection as magic.

- `ValidParentheses` — Check whether brackets are correctly nested.
- `MinStack` — Design a stack supporting constant-time minimum lookup.
- `EvaluateReversePolishNotation` — Evaluate an expression written in postfix notation.
- `DailyTemperatures` — For each day, find how long until a warmer temperature.
- `ImplementQueueUsingStacks` — Implement FIFO operations using two LIFO stacks.

## Binary Search

Write whether your range is closed (`[left, right]`) or half-open (`[left, right)`).
Most off-by-one errors come from mixing the update rules for these conventions.

- `ClassicBinarySearch` — Find a target's index in a sorted array.
- `SearchRotatedSortedArray` — Search a sorted array that was rotated once.
- `FindMinimumInRotatedSortedArray` — Find the minimum value in a rotated sorted array.
- `FirstAndLastPosition` — Find the first and last index of a repeated target.
- `KokoEatingBananas` — Find the smallest integer speed that meets a time limit.

## Trees

For recursion, say what one call promises to return for one subtree. Then trust the
same promise for the left and right children and combine their results.

- `MaximumDepthOfBinaryTree` — Find the number of nodes on the longest root-to-leaf path.
- `InvertBinaryTree` — Swap every node's left and right subtrees.
- `BinaryTreeLevelOrderTraversal` — Return node values one level at a time.
- `ValidateBinarySearchTree` — Check that every node obeys BST ordering rules.
- `LowestCommonAncestor` — Find the lowest node containing both targets in its subtrees.

## Heaps

Java's `PriorityQueue` is a min-heap by default. Decide whether its root should be
the best next item to use or the worst retained item to evict.

- `KthLargestElement` — Find the kth largest value in an unsorted array.
- `LastStoneWeight` — Repeatedly smash the two heaviest stones.
- `KClosestPointsToOrigin` — Return the k points nearest to the origin.
- `MergeKSortedLists` — Merge k already-sorted linked lists.
- `TaskScheduler` — Find minimum slots needed with a cooldown between equal tasks.

## Graphs

First identify nodes and edges. Mark nodes visited when adding them to the frontier,
not later, to avoid inserting the same node many times.

- `NumberOfIslands` — Count connected land regions in a grid.
- `CloneGraph` — Create a deep copy of a connected graph.
- `CourseSchedule` — Determine whether prerequisite edges contain a cycle.
- `PacificAtlanticWaterFlow` — Find cells that can reach both ocean boundaries.
- `WordLadder` — Find the shortest one-letter transformation sequence.

## Backtracking

Draw the decision tree. Each recursive level makes one choice; after returning,
undo that choice so sibling branches begin from the correct state.

- `Subsets` — Generate the power set of distinct values.
- `Permutations` — Generate every ordering of distinct values.
- `CombinationSum` — Find combinations that sum to a target with reusable values.
- `GenerateParentheses` — Generate all balanced strings containing n bracket pairs.
- `WordSearch` — Determine whether a word can be traced through adjacent grid cells.

## Dynamic Programming

Do not begin with a recurrence formula. First write a sentence defining what each
state means, identify the base state, and list which earlier states produce the next.

- `ClimbingStairs` — Count ways to climb n steps using jumps of one or two.
- `HouseRobber` — Maximize non-adjacent values selected from a row.
- `CoinChange` — Find the fewest coins needed to make an amount.
- `LongestIncreasingSubsequence` — Find the longest strictly increasing subsequence.
- `WordBreak` — Decide whether a string can be segmented into dictionary words.

## Greedy

The difficult part is proving the local choice is safe. Try to explain why replacing
another choice with the greedy one cannot make an optimal answer worse.

- `JumpGame` — Decide whether the final array index is reachable.
- `GasStation` — Find a station from which a full circuit is possible.
- `PartitionLabels` — Split a string so each character appears in one part.
- `NonOverlappingIntervals` — Remove the fewest intervals to eliminate overlap.
- `HandOfStraights` — Group cards into consecutive runs of fixed size.

## Bit Manipulation

Write small values in binary and trace every operation. Remember that Java `int`
values always contain 32 bits and that `>>>` is an unsigned right shift.

- `SingleNumber` — Find the value appearing once when all others appear twice.
- `NumberOfOneBits` — Count set bits in an integer.
- `CountingBits` — Return set-bit counts for every number from 0 through n.
- `ReverseBits` — Reverse all 32 bits of an integer.
- `MissingNumber` — Find the missing value from the range 0 through n.
