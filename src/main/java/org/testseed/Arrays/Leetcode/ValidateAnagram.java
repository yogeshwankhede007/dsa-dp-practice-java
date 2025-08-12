package org.testseed.Arrays.Leetcode;

import java.util.Arrays;

public class ValidateAnagram {

    public boolean isAnagram(String input1, String input2){
        if (input1.length() != input2.length()) return false;

        char[] input1Arr = input1.toCharArray();
        char[] input2Arr = input2.toCharArray();

        Arrays.sort(input1Arr);
        Arrays.sort(input2Arr);

        return Arrays.equals(input1Arr,input2Arr);
    }

    public static void main(String[] args) {
        String input1 ="geeks";
        String input2 = "kseeg";

        ValidateAnagram validateAnagram = new ValidateAnagram();

        if (validateAnagram.isAnagram(input1,input2)) System.out.println("Input is Anagram");
        else System.out.println(input1 +" & "+ "are not ANAGRAM");
    }
}
