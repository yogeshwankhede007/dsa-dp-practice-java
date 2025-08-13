package org.testseed.Arrays.Leetcode;

public class IsomorphicString {

    public boolean checkIsomorphic(String s, String t){
        if (s.length() != t.length()) return false;
        int[] sMap = new int[256];
        int[] tMap = new int[256];

        for (int i =0; i <s.length(); i++){
            if (sMap[s.charAt(i)] != tMap[t.charAt(i)]){
                return false;
            }
            sMap[s.charAt(i)] = i +1;
            tMap[t.charAt(i)] = i +1;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "yogesh", iso = "admin1as";
        IsomorphicString isomorphicString = new IsomorphicString();
        if (isomorphicString.checkIsomorphic(input,iso))
        System.out.println("YES, IT's ISOMORPHIC");
        else System.out.println("NOT ISOMORPHIC");
    }
}
