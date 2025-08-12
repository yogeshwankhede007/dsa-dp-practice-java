package org.testseed.Arrays.Sorting;

public class QuickSort {

    public int doPartition(int[] input, int low, int high) {
        int pivot = input[low];
        int i = low, j = high;

        while (i < j) {
            while (i <= high && input[i] <= pivot) i++;
            while (j >= low && input[j] > pivot) j--;

            if (i < j) {
                int tmp = input[i];
                input[i] = input[j];
                input[j] = tmp;
            }
        }

        // Place pivot in correct spot at j
        input[low] = input[j];
        input[j] = pivot;

        return j;
    }

    public void quickSort(int [] input, int low, int high){
        if(low < high){
            int pIndex = doPartition(input,low,high);
            quickSort(input,low,pIndex-1);
            quickSort(input,pIndex+1,high);
        }
    }

    public static void main(String[] args) {
        int [] input = {1,2,3,4,5,6,7,8,9,0};
        int size = input.length;

        System.out.println("Before Sort");
        for (int in : input){
            System.out.print(in+" ");
        }
        System.out.println();
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(input,0,size-1);
        System.out.println("After Sort");
        for (int j : input) {
            System.out.print(j + " ");
        }
    }
}
