package org.Dsa_code.Arrays;

public class FindSingleNumber {

    public int findSingleNumber(int [] nums){

        int n = nums.length;

        for (int i=0;i<nums.length; i++){
            int count =0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]== nums[j]){
                    count++;
                }
            }

            if(count == 1) {
                return nums[i];
            }
        }
        return-1;
    }
}
