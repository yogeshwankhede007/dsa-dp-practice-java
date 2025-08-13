package org.testseed.Arrays;

public class RemoveAllOccurrencesAp01 {

    public String removeOcr(String s, String part){
        while (s.contains(part)){
            int index = s.indexOf(part);
           s = s.substring(0,index) + s.substring(index+part.length());
        }
        return s;
    }

    public static void main(String[] args) {

        String s1 = "daabcbaabcbc", part1 = "abc";
        RemoveAllOccurrencesAp01 removeAllOccurrences = new RemoveAllOccurrencesAp01();
        System.out.println(removeAllOccurrences.removeOcr(s1,part1));

    }
}
