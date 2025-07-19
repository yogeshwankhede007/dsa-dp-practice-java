package org.Dsa_code.Arrays;

public class ReverseArrayWithTemp {

    public void revArray(int[] arr){
        int n = arr.length;
        int [] temp = new int[n];

        for(int i = 0; i<n; i++){
            temp[i] =  arr[n-i-1];
        }
    }

    public static void main(String[] args) {
    }
}
