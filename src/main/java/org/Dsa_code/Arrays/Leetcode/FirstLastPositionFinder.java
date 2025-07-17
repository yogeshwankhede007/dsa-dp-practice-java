package org.Dsa_code.Arrays.Leetcode;

/**
 * Solution class for LeetCode problem #34:
 * Find the first and last positions of a target value in a sorted array.
 *
 * Time Complexity: O(log n) — we perform two binary searches.
 * Space Complexity: O(1) — only constant extra variables.
 */
public class FirstLastPositionFinder {

    /**
     * Finds the inclusive start and end indices of the target in the sorted array.
     * Returns [-1, -1] if the target is not present.
     *
     * @param nums   Sorted array of integers (non-decreasing).
     * @param target Integer value to find.
     * @return int[] of size 2: {firstIndex, lastIndex}.
     */
    public int[] findTargetRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] { -1, -1 };
        }

        int firstIndex = findFirstGreaterOrEqual(nums, target);
        // If the target is out of bounds or not equal to the value at firstIndex, it's not present
        if (firstIndex == nums.length || nums[firstIndex] != target) {
            return new int[] { -1, -1 };
        }

        // Locate the last index by searching for the first index ≥ (target + 1), then subtracting one
        int lastIndex = findFirstGreaterOrEqual(nums, target + 1) - 1;

        return new int[] { firstIndex, lastIndex };
    }

    /**
     * Finds the smallest index i such that nums[i] >= value.
     * Uses a classic left-closed, right-open binary search ([0, nums.length]).
     *
     * @param nums  Sorted array to search (non-decreasing).
     * @param value Value to compare.
     * @return Index in [0, nums.length] meeting the condition.
     */
    private int findFirstGreaterOrEqual(int[] nums, int value) {
        int left = 0;
        int right = nums.length; // Notice right is exclusive

        while (left < right) {
            int mid = left + (right - left) / 2;  // safer mid calculation
            if (nums[mid] >= value) {
                right = mid;  // mid could be first ≥ value
            } else {
                left = mid + 1; // discard left half
            }
        }

        return left;
    }
}
