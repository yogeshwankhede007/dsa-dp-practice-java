package org.testseed.Arrays.Leetcode;

public class SecondHighestDigitInString {

    public int findSecondLargest(String input){
        int first = -1, second = -1;
        for (char c : input.toCharArray()){
            if (Character.isDigit(c)){
                int num = c - '0';
                if (num > first){
                    second = first;
                    first = num;
                } else if ( num < first && num > second){
                    second = num;

                }
            }
        }
        return second;
    }

    public static void main(String[] args) {
        String userInp = "dfa12321afd";
        SecondHighestDigitInString  secondHighestDigitInString = new SecondHighestDigitInString();
        System.out.println("Second Highest Digit is : "+ secondHighestDigitInString.findSecondLargest(userInp));
    }
}
