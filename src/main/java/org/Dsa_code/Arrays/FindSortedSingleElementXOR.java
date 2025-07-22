package org.Dsa_code.Arrays;

public class FindSortedSingleElementXOR {

    public int findSingleElement(int [] nums){
        int result =0;
        for(int num :nums){
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] input = {1,1,2,3,3,4,4,5,5};

        FindSortedSingleElementXOR fsse = new FindSortedSingleElementXOR();
        System.out.println("Single Element in this list is : "+fsse.findSingleElement(input));
    }

}
