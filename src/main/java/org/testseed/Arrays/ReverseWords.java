package org.testseed.Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public String revString(String input){
        //split
        List<String> words = Arrays.asList(input.trim().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ",words);
        }

    public static void main(String[] args) {

        String input = "Sky is Blue";
        ReverseWords reverseWords = new ReverseWords();
        System.out.println(reverseWords.revString(input));

    }
}
