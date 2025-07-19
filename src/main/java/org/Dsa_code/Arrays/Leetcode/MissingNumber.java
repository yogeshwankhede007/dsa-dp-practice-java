package org.Dsa_code.Arrays.Leetcode;

/**
 * Problem:
 * Given an array of size n containing unique integers from 1 to n+1 with one number missing,
 * find the missing number using XOR.
 * Example: Input = [1, 3, 4, 6, 2, 7] → Output = 5
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MissingNumber {

    /**
     * Finds the missing number from the range [1, n+1]
     *
     * @param nums input array of size n with values from 1 to n+1 (one number missing)
     * @return the missing number
     * @throws IllegalArgumentException if the array is null
     */
    public int findMissingNumber(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array must not be null.");
        }

        int n = nums.length;
        int xorAll = 0;

        // XOR all numbers from 1 to n+1 (inclusive)
        for (int i = 1; i <= n + 1; i++) {
            xorAll ^= i;
        }

        // XOR all elements of the array
        for (int num : nums) {
            xorAll ^= num;
        }

        // Remaining number is the missing one
        return xorAll;
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 4, 6, 2, 7}; // Missing number is 5

        MissingNumber missingNumber = new MissingNumber();
        try {
            int result = missingNumber.findMissingNumber(input);
            System.out.println("Missing Number From the List Is: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}