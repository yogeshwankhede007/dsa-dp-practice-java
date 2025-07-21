package org.testseed.Arrays.Sorting;

public class BubbleSort {

    public int [] doSort(int [] input){
        int size = input.length;
        boolean sorted;
        for (int i = 0; i< size-1; i++){
            sorted = false;
            for (int j=0; j<size-1-i; j++){
                if(input[j] > input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                    sorted = true;
                }
            }
            if (!sorted){
                break;
            }
        }
        return input;
    }

    public static void main(String[] args) {
       int [] input = {4,6,5,1,2,3};

       BubbleSort sort = new BubbleSort();
        int[] sorted = sort.doSort(input);
        for (int out :sorted) {
            System.out.print(out+" ");
        }
    }
}
