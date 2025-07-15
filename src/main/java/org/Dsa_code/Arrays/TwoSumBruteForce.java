package org.Dsa_code.Arrays;

public class TwoSumBruteForce {

    public void findTwoSum(int [] nums, int target){
        int n = nums.length;

        for(int i=0; i<n; i++){
            int sum =0;
            for(int j = i+1; j<n; j++){
                sum = nums[i]+nums[j];
            }
        }
    }
}
