package org.testseed.Arrays;

public class FindMinimumNumber {
    private static final int [] input = {12,23,45,13,6,32};

    public void findMinNumber( int [] input){

        int min = input[0];
        for (int i=0; i<input.length; i++){
            if(input[i]<min){
                min = input[i];
            }
        }
        System.out.println("Minimum Number is : "+ min);
    }

    public static void main(String[] args) {


        FindMinimumNumber findMinimumNumber = new FindMinimumNumber();
        findMinimumNumber.findMinNumber(input);
    }
}
