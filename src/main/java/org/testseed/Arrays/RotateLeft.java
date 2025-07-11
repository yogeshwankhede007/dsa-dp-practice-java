package org.testseed.Arrays;

public class RotateLeft {

    public int[] rotateLeftArray(int [] nums, int k){


        int n = nums.length;
        k = k % n;

        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n - 1);
        reverseArray(nums, 0, n - 1);

        return nums;
    }

    private void reverseArray(int[] nums, int start, int end) {

        while (start <= end){

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateLeft rotateleft = new RotateLeft();
        int [] inputArray = {1,2,3,4,5};
        int shiftBy = 4;
        int[] output = rotateleft.rotateLeftArray(inputArray, shiftBy);
        for (int i : output) {
            System.out.println(i);
        }
    }
}
