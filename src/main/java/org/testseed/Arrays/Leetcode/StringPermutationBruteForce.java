package org.testseed.Arrays.Leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StringPermutationBruteForce {
    public static boolean checkInclusion(String s1, String s2){
        int len1 = s1.length(), len2 = s2.length();
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        for (int i =0; i < len2 -len1; i++){
            String sub = s2.substring(i, i+len1);
            char[] arr2 = sub.toCharArray();
            Arrays.sort(arr2);
            if (Arrays.equals(arr1,arr2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("abi","eidbaooo"));
        List<String> doublely = new LinkedList<>();
    }
}
