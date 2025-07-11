package org.testseed.Arrays.Leetcode;

/**
 * Rotates an array to the right by k steps using in-place reversal.
 LeetCode Problem No : 189. Rotate Array
 * Approach:
 * 1. Reverse the entire array
 * 2. Reverse the first k elements
 * 3. Reverse the remaining elements
 * Time Complexity:
 * O(n) - We perform 3 full traversals (reversals) of the array.
 * Space Complexity:
 * O(1) - In-place modification, no additional space used.
 */
public class RotateRight {

    /**
     * Rotates the array to the right by k positions.
     *
     * @param nums the input array
     * @param k number of steps to rotate
     * @return the rotated array (same reference)
     * @throws IllegalArgumentException if nums is null or empty
     */
    public int[] rotateRightArray(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array must not be null or empty.");
        }

        int n = nums.length;
        k %= n;  // Normalize k if greater than array size

        // Step 1: Reverse the entire array
        reverseArray(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverseArray(nums, 0, k - 1);

        // Step 3: Reverse the rest
        reverseArray(nums, k, n - 1);

        return nums;
    }

    /**
     * Reverses a portion of the array from start to end (inclusive).
     *
     * @param nums the array
     * @param start start index
     * @param end end index
     */
    private void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateRight rotateRight = new RotateRight();
        int[] inputArray = {16, 23, 34, 25, 23};
        int shiftBy = 8;

        int[] output = rotateRight.rotateRightArray(inputArray, shiftBy);

        // Output: Rotated array
        for (int i : output) {
            System.out.print(i + " ");
        }
    }
}