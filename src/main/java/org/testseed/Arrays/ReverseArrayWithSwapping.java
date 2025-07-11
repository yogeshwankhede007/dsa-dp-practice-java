package org.testseed.Arrays;

public class ReverseArrayWithSwapping {
    public void revArrayWithSwap(int [] arr){
        int n = arr.length;
        for(int i =0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
        }
    }
}
