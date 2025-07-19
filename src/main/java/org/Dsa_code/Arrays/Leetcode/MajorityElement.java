package org.Dsa_code.Arrays.Leetcode;

/**
 * Problem: LeetCode !69
 * Given an array of size n, find the element that appears more than ⌊n/2⌋ times.
 *
 * Assumption:
 * - The majority element is guaranteed to exist in the input.
 *
 * Approach:
 * - Use the Boyer-Moore Majority Voting Algorithm.
 * - It works by maintaining a count that is incremented and decremented based on whether the current element matches the assumed majority.
 *
 * Time Complexity:
 * - O(n): Single traversal through the array.
 *
 * Space Complexity:
 * - O(1): Constant space — no extra data structures used.
 */
public class MajorityElement {

    /**
     * Finds the majority element (appears more than n/2 times).
     *
     * @param nums input integer array
     * @return the majority element
     * @throws IllegalArgumentException if the array is null or empty
     */
    public int findMajority(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array must not be null or empty.");
        }

        int majority = nums[0];
        int votes = 1;

        // First Pass: Boyer-Moore Voting Algorithm to find candidate
        for (int i = 1; i < nums.length; i++) {
            if (votes == 0) {
                majority = nums[i];
                votes = 1;
            } else if (nums[i] == majority) {
                votes++;
            } else {
                votes--;
            }
        }

        // Optional: Second pass to validate the majority (if not guaranteed by problem)
        int count = 0;
        for (int num : nums) {
            if (num == majority) count++;
        }

        if (count > nums.length / 2) {
            return majority;
        } else {
            throw new RuntimeException("No majority element found.");
        }
    }

    public static void main(String[] args) {
        int[] votes = {1, 2, 3, 1, 1, 3};  // Majority is 1
        MajorityElement majorityElement = new MajorityElement();

        try {
            int result = majorityElement.findMajority(votes);
            System.out.println("Majority Winner is: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
