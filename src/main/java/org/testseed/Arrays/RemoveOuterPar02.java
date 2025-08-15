package org.testseed.Arrays;

import java.util.Stack;

public class RemoveOuterPar02 {

    public String removePara(String input){

        Stack<String> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()){
            if (ch == '('){
              if (!stack.isEmpty()){
                  result.append(ch);
              }
              stack.push(String.valueOf(ch));
            }
            else {
                stack.pop();
                if (!stack.isEmpty()){
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "(()()())(((())()))";
        RemoveOuterPar02 removeOuterPar02 = new RemoveOuterPar02();
        System.out.println(removeOuterPar02.removePara(input));
    }
}
