package org.testseed.Arrays;

public class ReverseArrayWithTwoPointer {
    public void revArrayWithTwoPointer( int [] arr){
        int i = 0;
        int j = arr.length;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr [j];
            arr [j] = temp;
        }
        i++;
        j++;
    }
}
