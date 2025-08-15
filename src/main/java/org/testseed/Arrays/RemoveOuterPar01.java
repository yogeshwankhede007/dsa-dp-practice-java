package org.testseed.Arrays;

public class RemoveOuterPar01 {
    public String decompose(String input){
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (char ch : input.toCharArray()){
            if (ch == '(' || ch =='[' || ch =='{'){
                if (count > 0) sb.append(ch);
                count++;
            }
            else {
                count--;
                if (count > 0) sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "{[(())]}{[((()()))]}";
        RemoveOuterPar01 removeOuterPar01 = new RemoveOuterPar01();
        System.out.println(removeOuterPar01.decompose(input)+" is the output for the input  "+ input );
    }
}
