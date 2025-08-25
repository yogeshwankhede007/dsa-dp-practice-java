package org.testseed.Arrays;

public class StringCompressionTwoPointer {
    public static int compressString(char[] chars){
        int n = chars.length;
        int write =0, read=0;

        while(read < n){
            char currentChar = chars[read];
            int count =0;

            while (read < n && chars[read] == currentChar){
                read++;
                count++;
            }

            chars[write++] = currentChar;

            if (count > 1){
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        return write;
    }

    public static void main(String[] args) {
        char[] input = {'a','a','a','b','b','b','c'};
        System.out.println("Compressed String size is : "+compressString(input));
    }
}
