package org.testseed.Arrays.Leetcode;

public class RemoveOuterParentheses {

    public String removeParentheses(String s){
        int openCount =0, closeCount =0;
        int start =0;
        String result = "";
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(') openCount++;
            else if (s.charAt(i) == ')') closeCount++;
            if (openCount == closeCount){
                result += s.substring(start+1, i);
                start = i+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "((()))(()()())";
        RemoveOuterParentheses removeOuterParentheses = new RemoveOuterParentheses();
        System.out.println(removeOuterParentheses.removeParentheses(input));
    }
}
