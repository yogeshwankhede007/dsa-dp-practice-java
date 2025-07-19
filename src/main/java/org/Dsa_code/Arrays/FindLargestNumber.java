package org.Dsa_code.Arrays;

public class FindLargestNumber {

    public void findLargestNum(int [] input){
        int max = input[0];
        for(int i =1; i < input.length; i++){
            if(max<input[i]){
                max = input[i];
            }
        }
        System.out.println("Largest Number is :" +max);
    }

    public static void main(String[] args) {
        int [] input = {10,12,23,36,56};

        FindLargestNumber findLargestNumber = new FindLargestNumber();
        findLargestNumber.findLargestNum(input);
    }
}
