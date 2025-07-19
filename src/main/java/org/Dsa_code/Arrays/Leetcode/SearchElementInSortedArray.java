package org.Dsa_code.Arrays.Leetcode;

public class SearchElementInSortedArray {

    public int findElement(int [] nums, int target){
        int low =0, high = nums.length -1;
        while(low < high){
            int mid = low + (high -low)/2;

            if (nums[mid] ==target){
                return  mid;
            }
            if(nums[low] <= nums[mid]){
                if (nums[low] <= target && target< nums[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
            else {
                if (nums[mid] < target && target <= nums[high])
                    low = mid +1;
                else
                    high = mid -1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int [] input = {7,8,9,1,2,3,4,5,6};
        int target = 2;
        SearchElementInSortedArray seas = new SearchElementInSortedArray();
        System.out.println("search result is : "+ seas.findElement(input,target));
    }
}
