package org.testseed.Arrays;

public class RemoveAllOccurrencesAp02 {

    public String removeOcr(String s, String part){
        while (s.contains(part)){
            s = s.replaceFirst(part,"");
        }

        return s;
    }

    public static void main(String[] args) {
        String input = "axxxxxyyyyyb", part = "xy";

        RemoveAllOccurrencesAp02 removeOcrViaReplaceFun = new RemoveAllOccurrencesAp02();
        System.out.println("Result is => "+ removeOcrViaReplaceFun.removeOcr(input,part));
    }
}
