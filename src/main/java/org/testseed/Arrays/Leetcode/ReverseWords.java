package org.testseed.Arrays.Leetcode;

public class ReverseWords {

    public String reverseWords(String input) {

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder rev = new StringBuilder(words[i]);
            result.append(rev.reverse());
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Lets  It";
    }

}
