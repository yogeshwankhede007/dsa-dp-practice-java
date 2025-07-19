package org.Dsa_code.Arrays.Leetcode;

public class SearchRepElementInSortedArray {

    public boolean findElement(int [] nums, int target){
        int low =0, high = nums.length-1;

        while(low < high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
                continue;
            } else if (nums[low] <= nums[mid]) {
                if (nums[low] <=target && target<=nums[high])
                    high = mid -1;
                else
                    low = mid +1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] input = {7,8,9,1,2,2,3,4,5,6};
        int target = 2;
        SearchRepElementInSortedArray sresa = new SearchRepElementInSortedArray();
        boolean result = sresa.findElement(input, target);

        if(result)
            System.out.println("Yes, Element is in the list");
        else
            System.out.println("No, Element not found in list");
    }
}
