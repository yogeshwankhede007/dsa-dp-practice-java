package org.Dsa_code.Arrays;

public class FindSecondLargestNumber {

    public void secondLargestNum(int [] input){
        int temp;
        for(int i=0;i<input.length-1; i++){
            for(int j=i+1; j<input.length; j++){
                if(input[i]<input[j]){
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        System.out.println("Second Largest Number is : "+ input[1]+ " & Largest is "+input[0]);
    }

    public static void main(String[] args) {
        int [] input = {2,4,2,4,8,9,3};
        FindSecondLargestNumber findSecondLargestNumber = new FindSecondLargestNumber();
        findSecondLargestNumber.secondLargestNum(input);
    }
}
