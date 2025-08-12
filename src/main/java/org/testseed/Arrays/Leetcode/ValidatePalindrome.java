package org.testseed.Arrays.Leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidatePalindrome {

    public boolean isPalindrome(String s) {
      int left =0, right = s.length()-1;

      while (left < right){
          while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
          while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
          if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
              return false;
          }
          left ++;
          right --;
      }
        return true;
    }

    public static void main(String[] args) {
        String input = "A Man, a plan, a canal : Panama";
        ValidatePalindrome validatePalindrome = new ValidatePalindrome();
        String string = "racecar";
        boolean out = validatePalindrome.isPalindrome(string);
        if (out) System.out.println("Given input "+string + " Is Palindrome");
        else System.out.println("Given input is not Palindrome");
    }
}
