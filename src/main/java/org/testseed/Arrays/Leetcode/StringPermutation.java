package org.testseed.Arrays.Leetcode;

import java.util.Arrays;

public class StringPermutation {
    public static boolean checkInclusion(String s1, String s2){
        int m = s1.length(), n = s2.length();
        if (m > n) return false;
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (int i =0; i < m; i++){
            count1[s1.charAt(i) - 'a']++;
            count1[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < n-m; i++){
            if (Arrays.equals(count1,count2)) return true;
            count2[s2.charAt(i) - 'a']--;
            count2[s2.charAt(i+m) - 'a']++;
        }
        return  Arrays.equals(count1, count2);
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("abi","eidbaooo"));
    }
}
