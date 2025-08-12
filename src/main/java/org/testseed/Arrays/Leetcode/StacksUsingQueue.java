package org.testseed.Arrays.Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class StacksUsingQueue {
    Queue <Integer> queue;

    public StacksUsingQueue(){
        queue = new LinkedList<>();
    }

    public void push(int x){
        int size = queue.size();
        queue.add(x);
        while (size --> 0){
            queue.add(queue.poll());
        }
    }

    public int pop(){
        return queue.remove();
    }

    public int top(){
        return queue.peek();
    }

    public boolean empty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) {

    }

}
