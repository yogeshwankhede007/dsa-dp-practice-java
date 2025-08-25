package org.testseed.Arrays;

public class StringCompressionBruteForce {
    public int compressString(char[] chars){

        StringBuilder sb = new StringBuilder();
        int n = chars.length;

        for (int i =0; i < n ;){
            char currentChar = chars[i];
            int count =0;

            while (i < n && chars[i] == currentChar){
                count++;
                i++;
            }
            sb.append(currentChar);
            if (count > 1){
                sb.append(count);
                }
        }
        for (int j =0; j < sb.length(); j++){
            chars[j] = sb.charAt(j);
        }
        return sb.length();
    }

    public static void main(String[] args) {
        char[] input = {'a','a','b','b','c'};
    }
}
