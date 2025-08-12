package org.testseed.Arrays;

public class ReverseWordsTwoPointers {

    public static String revString(String input){
        char[] arr = input.trim().toCharArray();

        reverse(arr,0,arr.length-1);

        int start =0;
        for (int end =0; end <= arr.length; end++){
            if (end == arr.length || arr[end] == ' '){
                reverse(arr, start,end-1);
                start = end+1;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (c != ' ' || (!sb.isEmpty() && sb.charAt(sb.length() - 1) != ' ')) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static void reverse(char[] arr, int l, int r) {
        while (l < r){
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

    public static void main(String[] args) {
        String input = "Sky is Blue";
        System.out.println(revString(input));

    }
}
