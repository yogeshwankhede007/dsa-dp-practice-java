package org.testseed.Arrays;

public class LinearSearchWithRecursion {

    public int linearSearchWithRec(int[] arr, int target) {
        return linearSearchWithRec(arr, 0, target);
    }

    private int linearSearchWithRec(int[] arr, int index, int target) {
        if (index >= arr.length) return -1;
        if (arr[index] == target) return index;
        return linearSearchWithRec(arr, index + 1, target);
    }


    public static void main(String[] args) {
        int [] input = {10,22,23,34,23};
        int target = 22;

        LinearSearchWithRecursion linearSearchWithRecursion = new LinearSearchWithRecursion();
        int output = linearSearchWithRecursion.linearSearchWithRec(input,target);
        System.out.println("output "+output);
    }
}
