package org.Dsa_code.Arrays;

public class BinarySearchWithRecursion {

    public int binarySearchWithRec(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (target < nums[mid]) {
            return binarySearchWithRec(nums, target, left, mid - 1);
        } else {
            return binarySearchWithRec(nums, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] input = {5, 10, 15, 20, 25};
        int target = 10;

        BinarySearchWithRecursion searcher = new BinarySearchWithRecursion();
        int result = searcher.binarySearchWithRec(input, target, 0, input.length - 1);

        System.out.println("Output: " + result);
    }
}
