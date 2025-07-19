package org.Dsa_code.Arrays;

public class BinarySearch {

    public int checkBinarySearch(int [] nums, int target){

        int left =0;
        int right = nums.length-1;

        while (left<= right){
            int mid = left+(right-left)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                left = mid +1;
            }
            else
            {
                right = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] input = {10,12,14,16,19};
        int target = 16;

        BinarySearch binarySearch = new BinarySearch();
        System.out.println("output " +binarySearch.checkBinarySearch(input,target));
    }
}
