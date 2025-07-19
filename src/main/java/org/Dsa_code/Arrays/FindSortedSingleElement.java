package org.Dsa_code.Arrays;

public class FindSortedSingleElement {

    public int getNonDuplicateElement(int [] nums){
        int n = nums.length;

        if(n == 1){
            return nums[0];
        }

        for(int i =0; i < n; i++){
            if(i == 0){
                if(nums[i] != nums[i+1])
                return nums[i];
            } else if ( i == n-1) {
                if(nums[i] != nums[i-1])
                    return nums[i];
            }
            else {
                if(nums[i] != nums[i-1] && nums[i] != nums[i+1])
                    return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] input = {1,1,1,1,2,2,2,3,4,4,4,5,5};
        FindSortedSingleElement findSortedSingleElement = new FindSortedSingleElement();
        System.out.println("Single Element is : "+findSortedSingleElement.getNonDuplicateElement(input));
    }
}
