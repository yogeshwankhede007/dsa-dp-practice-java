package org.testseed.Arrays;

public class FindSingleNumber {

    public int findSingleNumber(int [] numbs){

        int n = numbs.length;

        for (int numb : numbs) {
            int count = 0;
            for (int i : numbs) {
                if (numb == i) {
                    count++;
                }
            }

            if (count == 1) {
                return numb;
            }
        }
        return-1;
    }

    public static void main(String[] args) {
        int[] inputNumbs = {1,1,2,1,3,4,2,3};
        FindSingleNumber findSecondLargestNumber = new FindSingleNumber();
        System.out.println("Single Number is : "+findSecondLargestNumber.findSingleNumber(inputNumbs));
    }
}
