package org.Dsa_code.Arrays.Leetcode;

public class SingleElementInSortedArray {

    public int findSingleElement(int [] nums){
        int n = nums.length;

        if(n == 1){
            return  nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[n-1] != nums[n-2]){
            return nums[n-1];
        }

        int low =1, high = n-2;

        while(low < high){
            int mid = (low+high)/2;
            if(nums[mid] != nums[mid+1] &&
               nums[mid] != nums[mid-1]){
                return nums[mid];
            }

            if((mid%2 == 1 && nums[mid] == nums[mid-1]) ||
                    (mid%2 == 0 && nums[mid] == nums[mid+1])){
                low = mid +1;
            } else if ((mid%2 == 0 && nums[mid] == nums[mid-1]) ||
                    (mid%2 == 1 && nums[mid] == nums[mid+1])){
                high = mid -1;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int [] input = {1,1,2,2,3,4,4,5,5};

        SingleElementInSortedArray sesa = new SingleElementInSortedArray();
        System.out.println("Single Element in list is : "+sesa.findSingleElement(input));
    }
}
