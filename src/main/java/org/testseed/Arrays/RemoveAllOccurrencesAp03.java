package org.testseed.Arrays;

public class RemoveAllOccurrencesAp03 {

    public String removeOcr(String s, String part){
        StringBuilder builder = new StringBuilder();
        int partLength = part.length();
        for (int i=0; i<s.length(); i++){
            builder.append(s.charAt(i));

            if (builder.length() >= partLength && builder.substring(builder.length() - partLength).equals(part)){
                builder.delete(builder.length() - partLength, builder.length());
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String input = "AbXXXXYYYYBBc", part ="XY";
        RemoveAllOccurrencesAp03 removeAllOccurrencesAp03 = new RemoveAllOccurrencesAp03();
        System.out.println("Resulting Output is => "+removeAllOccurrencesAp03.removeOcr(input,part));
    }
}
