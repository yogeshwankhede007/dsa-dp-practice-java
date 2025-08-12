package org.testseed.Arrays.Queues;

public class LinerQueue {

    private final int[] queue;
    private int front,rear;
    private final int maxSize;

    public LinerQueue(int size){
        maxSize = size;
        queue = new int[size];
        front = rear = -1;
    }

    public boolean isFull(){
        return  rear == maxSize-1;
    }
    public boolean isEmpty(){
        return  front == -1;
    }

    public  void  enqueue(int data){
        if (isFull()){
            System.out.println("Queue overflow");
            return;
        }
        rear = rear+1;
        queue[rear] = data;
        if (front == -1){
            front =0;
        }
    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue Underflow");
            return -1;
        }
        int ele = queue[front];
        if (front == rear){
            front = rear = -1;
        }
        else
            front = front+1;
        return ele;
    }

    public int frontVal(){
        if (isEmpty()){
            System.out.println("Its Empty");
            return -1;
        }
        return queue[front];
    }

    public int rareVal(){
        if (isEmpty()){
            System.out.println("Its Empty");
            return -1;
        }
        return queue[rear];
    }

    public void displayVal() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
