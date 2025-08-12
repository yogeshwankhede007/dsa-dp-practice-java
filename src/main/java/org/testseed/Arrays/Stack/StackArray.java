package org.testseed.Arrays.Stack;


public class StackArray {

    private  int maxSize;
    private int [] stackArray;
    private int top;

    public  StackArray(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; //default value
    }

    public void push(int value){
        if(isFull()){
            System.out.println(" Stack Overflow cannot push"+ value);
        }
        else {
            stackArray[++top] = value;
            System.out.println("Pushed "+value);
        }
    }



    public int pop(){
        if(isEmpty()){
            System.out.println(" Stack Underflow cannot pop");
            return-1;
        }
        else {
            return stackArray[top--];
        }
    }

    public int peak(){
        if(isEmpty()){
            System.out.println(" Stack is empty");
            return-1;
        }
        else {
            return stackArray[top];
        }
    }

    private  boolean isEmpty(){
        return (top ==-1);
    }

    private boolean isFull() {
        return (top == maxSize-1);
    }
    private void display(){

    }
}
