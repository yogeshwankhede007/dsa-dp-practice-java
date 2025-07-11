package org.testseed.Arrays.Leetcode;

/**
 * Problem: Leetcode 136
 * Given an array where every element appears twice except for one, find that single one.
 * Constraints:
 * - Exactly one element appears once.
 * - All other elements appear exactly twice.
 * Approach:
 * - Use Bitwise XOR to find the single number.
 * - XOR of a number with itself is 0:     a ^ a = 0
 * - XOR of a number with 0 is the number: a ^ 0 = a
 * - XOR is both commutative and associative.
 * Time Complexity:
 * - O(n) — Single pass over the array.
 * Space Complexity:
 * - O(1) — No extra space used.
 */
public class SingleNumberXOR {

    /**
     * Finds the element that appears exactly once using XOR.
     *
     * @param nums input array
     * @return the single non-repeating number
     * @throws IllegalArgumentException if array is null or empty
     */
    public static int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array must not be null or empty.");
        }

        int result = 0;

        for (int num : nums) {
            result ^= num;  // XOR accumulates: cancels out duplicates
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 1, 2, 3, 4, 4, 5, 3, 5};  // Output: 2

        try {
            int output = singleNumber(input);
            System.out.println("Single number with XOR is: " + output);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}