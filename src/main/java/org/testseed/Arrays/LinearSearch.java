package org.testseed.Arrays;

public class LinearSearch {

    public int linearSearch(int [] arr, int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return  i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] input = {10,22,23,34,23};
        int target = 22;
        LinearSearch linearSearch = new LinearSearch();
        int out = linearSearch.linearSearch(input, target);
        System.out.println("output :"+out);
    }
}
