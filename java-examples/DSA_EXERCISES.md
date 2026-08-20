# 75 DSA Practice Questions
+
+The questions are ordered roughly from foundational patterns to more advanced topics. Each class compiles and prints a prompt, hint, and complexity target. Add your solution method and tests directly to the class.
+
+Run one with:
+
+```bash
+./gradlew :java-examples:runExample -PmainClass=dsa.exercises.arrays.TwoSum
+```

## Arrays

- `TwoSum` — Find two indices whose values add to a target.
- `BestTimeToBuyAndSellStock` — Find the maximum profit from one buy followed by one sale.
- `MaximumSubarray` — Find the contiguous subarray with the largest sum.
- `ProductOfArrayExceptSelf` — Return products of all other elements without division.
- `MergeIntervals` — Merge all overlapping numeric intervals.

## Strings

- `ValidAnagram` — Decide whether two strings contain identical character counts.
- `LongestSubstringWithoutRepeatingCharacters` — Find the longest substring containing no repeated characters.
- `ValidPalindrome` — Ignore punctuation and case, then test whether a string is a palindrome.
- `GroupAnagrams` — Group words that are anagrams of one another.
- `LongestPalindromicSubstring` — Find the longest contiguous palindrome.

## Hashing

- `ContainsDuplicate` — Determine whether an array contains a repeated value.
- `TopKFrequentElements` — Return the k most frequent values.
- `HappyNumber` — Detect whether repeatedly summing squared digits reaches one.
- `IsomorphicStrings` — Check whether characters in two strings map one-to-one.
- `LongestConsecutiveSequence` — Find the longest run of consecutive integers in any order.

## Two Pointers

- `ThreeSum` — Find unique triplets whose sum is zero.
- `ContainerWithMostWater` — Find two lines that hold the most water.
- `RemoveDuplicatesFromSortedArray` — Remove duplicates in place and return the new length.
- `MoveZeroes` — Move all zeroes to the end while preserving other values.
- `SquaresOfSortedArray` — Return sorted squares of a sorted array.

## Sliding Window

- `MaximumAverageSubarray` — Find the largest average among windows of size k.
- `MinimumSizeSubarraySum` — Find the shortest positive-number window meeting a target sum.
- `PermutationInString` — Check whether one string's permutation occurs in another.
- `LongestRepeatingCharacterReplacement` — Find the longest window made uniform with at most k replacements.
- `MinimumWindowSubstring` — Find the smallest substring containing all required characters.

## Linked Lists

- `ReverseLinkedList` — Reverse a singly linked list in place.
- `LinkedListCycle` — Determine whether a linked list contains a cycle.
- `MergeTwoSortedLists` — Merge two sorted linked lists.
- `RemoveNthNodeFromEnd` — Remove the nth node measured from the list's end.
- `ReorderList` — Reorder L0→L1→… as L0→Ln→L1→Ln-1→….

## Stacks Queues

- `ValidParentheses` — Check whether brackets are correctly nested.
- `MinStack` — Design a stack supporting constant-time minimum lookup.
- `EvaluateReversePolishNotation` — Evaluate an expression written in postfix notation.
- `DailyTemperatures` — For each day, find how long until a warmer temperature.
- `ImplementQueueUsingStacks` — Implement FIFO operations using two LIFO stacks.

## Binary Search

- `ClassicBinarySearch` — Find a target's index in a sorted array.
- `SearchRotatedSortedArray` — Search a sorted array that was rotated once.
- `FindMinimumInRotatedSortedArray` — Find the minimum value in a rotated sorted array.
- `FirstAndLastPosition` — Find the first and last index of a repeated target.
- `KokoEatingBananas` — Find the smallest integer speed that meets a time limit.

## Trees

- `MaximumDepthOfBinaryTree` — Find the number of nodes on the longest root-to-leaf path.
- `InvertBinaryTree` — Swap every node's left and right subtrees.
- `BinaryTreeLevelOrderTraversal` — Return node values one level at a time.
- `ValidateBinarySearchTree` — Check that every node obeys BST ordering rules.
- `LowestCommonAncestor` — Find the lowest node containing both targets in its subtrees.

## Heaps

- `KthLargestElement` — Find the kth largest value in an unsorted array.
- `LastStoneWeight` — Repeatedly smash the two heaviest stones.
- `KClosestPointsToOrigin` — Return the k points nearest to the origin.
- `MergeKSortedLists` — Merge k already-sorted linked lists.
- `TaskScheduler` — Find minimum slots needed with a cooldown between equal tasks.

## Graphs

- `NumberOfIslands` — Count connected land regions in a grid.
- `CloneGraph` — Create a deep copy of a connected graph.
- `CourseSchedule` — Determine whether prerequisite edges contain a cycle.
- `PacificAtlanticWaterFlow` — Find cells that can reach both ocean boundaries.
- `WordLadder` — Find the shortest one-letter transformation sequence.

## Backtracking

- `Subsets` — Generate the power set of distinct values.
- `Permutations` — Generate every ordering of distinct values.
- `CombinationSum` — Find combinations that sum to a target with reusable values.
- `GenerateParentheses` — Generate all balanced strings containing n bracket pairs.
- `WordSearch` — Determine whether a word can be traced through adjacent grid cells.

## Dynamic Programming

- `ClimbingStairs` — Count ways to climb n steps using jumps of one or two.
- `HouseRobber` — Maximize non-adjacent values selected from a row.
- `CoinChange` — Find the fewest coins needed to make an amount.
- `LongestIncreasingSubsequence` — Find the longest strictly increasing subsequence.
- `WordBreak` — Decide whether a string can be segmented into dictionary words.

## Greedy

- `JumpGame` — Decide whether the final array index is reachable.
- `GasStation` — Find a station from which a full circuit is possible.
- `PartitionLabels` — Split a string so each character appears in one part.
- `NonOverlappingIntervals` — Remove the fewest intervals to eliminate overlap.
- `HandOfStraights` — Group cards into consecutive runs of fixed size.

## Bit Manipulation

- `SingleNumber` — Find the value appearing once when all others appear twice.
- `NumberOfOneBits` — Count set bits in an integer.
- `CountingBits` — Return set-bit counts for every number from 0 through n.
- `ReverseBits` — Reverse all 32 bits of an integer.
- `MissingNumber` — Find the missing value from the range 0 through n.
