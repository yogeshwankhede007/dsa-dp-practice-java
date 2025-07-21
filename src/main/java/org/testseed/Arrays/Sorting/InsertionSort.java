package org.testseed.Arrays.Sorting;

public class InsertionSort {

    public int [] doInsertionSort(int [] input){
        int size = input.length;
        for(int i = 0; i<= size -1; i++){
            int j = i;
            while (j > 0 && input[j-1] > input[j]){

                int temp = input[j-1];
                input [j-1] = input[j];
                input[j] = temp;
                j--;
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int [] input = {1,3,4,2,5,6};

        InsertionSort sort = new InsertionSort();
       int [] sorted = sort.doInsertionSort(input);
        int finalOut = 0;
        System.out.println("Below is your sorted output ");
       for (int out : sorted) {
           System.out.print(out + " ");
       }
    }
}
