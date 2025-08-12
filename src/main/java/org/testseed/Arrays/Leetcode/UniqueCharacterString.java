package org.testseed.Arrays.Leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacterString {
//    public int firstUniqueChar(String s) {
//
//        Map<Character, Integer> map = new LinkedHashMap<>();
//
//        for(char c : s.toCharArray()){
//            map.put(c, map.getOrDefault(c,0) +1);
//        }
//
//        for(int i =0; i<s.length(); i++){
//            if(map.get(s.charAt(i)) == 1) return i;
//        }
//        return -1;
//    }

    public int firstUniqueChar(String s){
         String input = s.toLowerCase();

        int[] charCounts = new int[26];

        for (int i =0; i< input.length(); i++){

            charCounts[input.charAt(i) - 'a']++;
        }

        for (int i =0; i<input.length(); i++){
            if (charCounts[input.charAt(i) - 'a'] ==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String input = "loVEleetcode";
        UniqueCharacterString uniqueCharacterString = new UniqueCharacterString();
        int out = uniqueCharacterString.firstUniqueChar(input);
        System.out.println("Unique Char is at "+ out);

    }
}
