package org.testseed.Arrays;

public class LargestOddNumber {

    public static String findLargetsOdd(String input){
        if (input == null || !input.matches("\\d+")) return "";

        for (int i = input.length() - 1; i >= 0; i--){
            int convDigit = input.charAt(i) -'0';
            if (convDigit % 2 != 0){
                return input.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String g = "5679";
        System.out.println(findLargetsOdd(g));
    }
}
