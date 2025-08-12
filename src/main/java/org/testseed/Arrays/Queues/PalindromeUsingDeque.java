package org.testseed.Arrays.Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeUsingDeque {
    public boolean isPalindrome(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        for( char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                deque.addLast(Character.toLowerCase(c));
            }
        }
        while(deque.size() > 1){
            if(deque.pollFirst() != deque.pollLast()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "A Man, a plan, a canal : Panama";
        PalindromeUsingDeque palindromeUsingDeque = new PalindromeUsingDeque();
        boolean out = palindromeUsingDeque.isPalindrome(input);
        if (out) System.out.println("Given inout "+input + " Is Palindrome");
        else System.out.println("Given input is not Palindrome");
    }
}
