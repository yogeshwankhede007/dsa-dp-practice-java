package org.testseed.Arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidateAnagramUsingHashMap {

    public boolean areAnagram(String s1, String s2){

        if (s1.length() != s2.length()) return false;

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : s1.toCharArray())
            charCount.put(ch, charCount.getOrDefault(ch,0)+1);
        for (char ch : s2.toCharArray())
            charCount.put(ch, charCount.getOrDefault(ch,0)-1);
        for (var pair : charCount.entrySet()){
            if (pair.getValue() != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "rat";

        ValidateAnagramUsingHashMap validateAnagramUsingHashMap = new ValidateAnagramUsingHashMap();

        if (validateAnagramUsingHashMap.areAnagram(s1,s2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
