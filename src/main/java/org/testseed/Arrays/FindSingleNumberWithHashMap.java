package org.testseed.Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem:
 * Given an array where every element appears twice except one, find the element that appears only once.
 *
 * Approach:
 * - Use a HashMap to count the frequency of each number.
 * - Traverse the map to find the number that occurs exactly once.
 *
 * Time Complexity:
 * - O(n) where n = number of elements in the array
 *   -> First loop to count elements in HashMap = O(n)
 *   -> Second loop to find the element with count 1 = O(n) in worst case (all unique)
 *
 * Space Complexity:
 * - O(n) for storing frequencies in HashMap
 *   -> In worst case, all elements are unique (except one duplicate), hence up to n/2 entries
 */
public class FindSingleNumberWithHashMap {

    /**
     * Finds the single element in an array where all others appear twice.
     *
     * @param nums the input array
     * @return the element that appears only once
     * @throws IllegalArgumentException if no such element exists or input is invalid
     */
    public int findSingle(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array must not be null or empty.");
        }

        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of each element
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find the element that appears only once
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // Edge case: No unique element found
        throw new IllegalArgumentException("No single element found. Every element may appear more than once.");
    }

    public static void main(String[] args) {
        FindSingleNumberWithHashMap finder = new FindSingleNumberWithHashMap();

        int[] input = {4, 1, 2, 1, 2};  // Expected output: 4
        int result = finder.findSingle(input);

        System.out.println("The single number is: " + result);
    }
}
