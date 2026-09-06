package dsa.exercises;

import static org.junit.jupiter.api.Assertions.*;

import dsa.exercises.backtracking.*;
import dsa.exercises.binary_search.*;
import dsa.exercises.bit_manipulation.*;
import dsa.exercises.dynamic_programming.*;
import dsa.exercises.graphs.*;
import dsa.exercises.greedy.*;
import dsa.exercises.hashing.*;
import dsa.exercises.heaps.*;
import dsa.exercises.sliding_window.*;
import dsa.exercises.stacks_queues.*;
import dsa.exercises.strings.*;
import dsa.exercises.two_pointers.*;
import java.util.List;
import org.junit.jupiter.api.Test;

class ReferenceSolutionsTest {
    @Test void strings() {
        assertTrue(ValidAnagram.isAnagram("anagram", "nagaram"));
        assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(2, GroupAnagrams.groupAnagrams(new String[] {"eat", "tea", "tan"}).size());
        assertEquals(3, LongestPalindromicSubstring.longestPalindrome("babad").length());
    }

    @Test void hashing() {
        assertTrue(ContainsDuplicate.containsDuplicate(new int[] {1, 2, 1}));
        assertEquals(2, TopKFrequentElements.topKFrequent(new int[] {1, 1, 2, 2, 3}, 2).length);
        assertTrue(HappyNumber.isHappy(19));
        assertTrue(IsomorphicStrings.isIsomorphic("egg", "add"));
        assertEquals(4, LongestConsecutiveSequence.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
    }

    @Test void binarySearchAndBits() {
        assertEquals(2, ClassicBinarySearch.search(new int[] {1, 3, 5}, 5));
        assertEquals(4, SearchRotatedSortedArray.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(0, FindMinimumInRotatedSortedArray.findMin(new int[] {3, 4, 0, 1, 2}));
        assertArrayEquals(new int[] {3, 4}, FirstAndLastPosition.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8));
        assertEquals(4, KokoEatingBananas.minEatingSpeed(new int[] {3, 6, 7, 11}, 8));
        assertEquals(4, SingleNumber.singleNumber(new int[] {4, 1, 2, 1, 2}));
        assertEquals(3, NumberOfOneBits.hammingWeight(0b1011));
        assertArrayEquals(new int[] {0, 1, 1, 2, 1, 2}, CountingBits.countBits(5));
        assertEquals(964176192, ReverseBits.reverseBits(43261596));
        assertEquals(2, MissingNumber.missingNumber(new int[] {3, 0, 1}));
    }

    @Test void dynamicProgramming() {
        assertEquals(8, ClimbingStairs.climbStairs(5));
        assertEquals(12, HouseRobber.rob(new int[] {2, 7, 9, 3, 1}));
        assertEquals(3, CoinChange.coinChange(new int[] {1, 2, 5}, 11));
        assertEquals(4, LongestIncreasingSubsequence.lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18}));
        assertTrue(WordBreak.wordBreak("leetcode", List.of("leet", "code")));
    }

    @Test void twoPointersAndWindows() {
        assertEquals(49, ContainerWithMostWater.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
        int[] moved = {0, 1, 0, 3, 12}; MoveZeroes.moveZeroes(moved); assertArrayEquals(new int[] {1, 3, 12, 0, 0}, moved);
        int[] unique = {1, 1, 2}; assertEquals(2, RemoveDuplicatesFromSortedArray.removeDuplicates(unique));
        assertArrayEquals(new int[] {0, 1, 9, 16, 100}, SquaresOfSortedArray.sortedSquares(new int[] {-4, -1, 0, 3, 10}));
        assertEquals(2, ThreeSum.threeSum(new int[] {-1, 0, 1, 2, -1, -4}).size());
        assertEquals(12.75, MaximumAverageSubarray.findMaxAverage(new int[] {1, 12, -5, -6, 50, 3}, 4));
        assertEquals(2, MinimumSizeSubarraySum.minSubArrayLen(7, new int[] {2, 3, 1, 2, 4, 3}));
        assertTrue(PermutationInString.checkInclusion("ab", "eidbaooo"));
        assertEquals(4, LongestRepeatingCharacterReplacement.characterReplacement("AABABBA", 1));
        assertEquals("BANC", MinimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test void greedyAndStacks() {
        assertTrue(JumpGame.canJump(new int[] {2, 3, 1, 1, 4}));
        assertEquals(3, GasStation.canCompleteCircuit(new int[] {1, 2, 3, 4, 5}, new int[] {3, 4, 5, 1, 2}));
        assertEquals(List.of(9, 7, 8), PartitionLabels.partitionLabels("ababcbacadefegdehijhklij"));
        assertEquals(1, NonOverlappingIntervals.eraseOverlapIntervals(new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
        assertTrue(HandOfStraights.isNStraightHand(new int[] {1, 2, 3, 6, 2, 3, 4, 7, 8}, 3));
        assertTrue(ValidParentheses.isValid("()[]{}"));
        assertEquals(9, EvaluateReversePolishNotation.evalRPN(new String[] {"2", "1", "+", "3", "*"}));
        assertArrayEquals(new int[] {1, 1, 4, 2, 1, 1, 0, 0}, DailyTemperatures.dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73}));
        MinStack stack = new MinStack(); stack.push(-2); stack.push(0); stack.push(-3); assertEquals(-3, stack.getMin()); stack.pop(); assertEquals(-2, stack.getMin());
        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks(); queue.push(1); queue.push(2); assertEquals(1, queue.pop()); assertEquals(2, queue.peek());
    }

    @Test void heapsAndBacktracking() {
        assertEquals(5, KthLargestElement.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2));
        assertEquals(1, LastStoneWeight.lastStoneWeight(new int[] {2, 7, 4, 1, 8, 1}));
        assertEquals(2, KClosestPointsToOrigin.kClosest(new int[][] {{3, 3}, {5, -1}, {-2, 4}}, 2).length);
        assertEquals(8, TaskScheduler.leastInterval(new char[] {'A', 'A', 'A', 'B', 'B', 'B'}, 2));
        assertEquals(8, Subsets.subsets(new int[] {1, 2, 3}).size());
        assertEquals(6, Permutations.permute(new int[] {1, 2, 3}).size());
        assertEquals(2, CombinationSum.combinationSum(new int[] {2, 3, 6, 7}, 7).size());
        assertEquals(5, GenerateParentheses.generateParenthesis(3).size());
        assertTrue(WordSearch.exist(new char[][] {{'A', 'B'}, {'C', 'D'}}, "AB"));
    }

    @Test void graphs() {
        assertEquals(2, NumberOfIslands.numIslands(new char[][] {{'1', '0', '1'}}));
        assertTrue(CourseSchedule.canFinish(2, new int[][] {{1, 0}}));
        assertEquals(7, PacificAtlanticWaterFlow.pacificAtlantic(new int[][] {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}}).size());
        assertEquals(5, WordLadder.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
        CloneGraph.Node original = new CloneGraph.Node(1); original.neighbors.add(original); CloneGraph.Node copy = CloneGraph.cloneGraph(original); assertNotSame(original, copy); assertSame(copy, copy.neighbors.getFirst());
    }
}
