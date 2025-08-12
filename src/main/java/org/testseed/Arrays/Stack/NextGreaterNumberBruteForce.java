package org.testseed.Arrays.Stack;

public class NextGreaterNumberBruteForce {

    public int [] getGreater(int [] input){
        int n = input.length;
        int [] result = new int[n];
        for (int i =0; i<= n;  i++){
            result[i] = -1;
            for (int j = i+1; j<n; j++){
                if (input[j] > input[i]) {
                    result = new int[]{input[i]};
                    break;
                }
            }
        }
        return result;
    }
}
