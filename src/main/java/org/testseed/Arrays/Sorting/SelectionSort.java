package org.testseed.Arrays.Sorting;

public class SelectionSort {

    public int[] doSelectionSort(int [] arr){
        int n = arr.length;

        for(int i =0; i< n-1; i++){
            int minIndx =i;
            for(int j=i+1; j<n;j++){
                if(arr[j]< arr[minIndx]){
                    minIndx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndx];
            arr[minIndx] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,5,4};

        SelectionSort ss = new SelectionSort();
        int[] out = ss.doSelectionSort(arr);
        for(int sorted :out){
            System.out.print(sorted+" ");
        }
    }
}
