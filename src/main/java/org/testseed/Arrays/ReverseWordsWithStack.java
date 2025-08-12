package org.testseed.Arrays;

import java.util.Stack;

public class ReverseWordsWithStack {

    public static String revWord(String input){
        Stack<String> stack = new Stack<>();
        int n = input.length();
        int i =0;

        while (i < n){
            while (i<n && input.charAt(i) ==' '){
                i++;
            }

            int j=i;
            while (j < n && input.charAt(j) != ' '){
                j++;
            }

            if (i < j){
                stack.push(input.substring(i,j));
            }
            i=j;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()){
            result.append(stack.pop());
            if (!stack.isEmpty()){
                result.append(" ");
            }
        }
        return  result.toString();
    }

    public static void main(String[] args) {
        String input = "Sky is Blue";
        System.out.println(revWord(input));
    }
}
