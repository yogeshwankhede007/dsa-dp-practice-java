package org.testseed.Arrays.Leetcode;

public class ReverseWordsTwoPointer {

    public static String revWord(String s){
        char[] arr = s.toCharArray();

        int left =0, right =0;

        while( right<= arr.length){
            if (right == arr.length || arr[right] == ' '){
                reverse(arr, left, right-1);
                left = right+1;
            }
            right ++;
        }
        reverse(arr,left,right-1);
        return new String(arr);
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left<right){
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public static void main(String[] args) {
        String input = "Hello How are you";
        System.out.print("Reversed output "+revWord(input));

    }
}
