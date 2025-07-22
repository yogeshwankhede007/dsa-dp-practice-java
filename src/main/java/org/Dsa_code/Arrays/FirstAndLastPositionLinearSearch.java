package org.Dsa_code.Arrays;

import java.util.Arrays;

public class FirstAndLastPositionLinearSearch {

    public int [] searchRange( int [] nums, int target){

        int start = -1;
        int end = -1;

        for(int i=0; i<=nums.length-1;i++){

            if(nums[i] == target){
                if(start == -1){
                    start = i;
                }
                end = i;
            }
        }

        return new int[] {start,end};
    }

    public static void main(String[] args) {
        int [] input = {10,12,13,15,15,15,17,17,17,19};
        int target = 17;

        FirstAndLastPositionLinearSearch firstAndLastPositionLinearSearch = new FirstAndLastPositionLinearSearch();
        System.out.println("First and Last Postions are : "+ Arrays.toString(firstAndLastPositionLinearSearch.searchRange(input, target)));
    }
}
