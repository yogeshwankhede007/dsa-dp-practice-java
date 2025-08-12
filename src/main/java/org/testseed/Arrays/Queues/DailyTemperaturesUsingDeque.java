package org.testseed.Arrays.Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperaturesUsingDeque {

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        Deque<Integer> deQ = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            while(!deQ.isEmpty() && temperatures[i] > temperatures[deQ.peek()]){
                int preIndex = deQ.pop();
                result[preIndex] = i - preIndex;
            }
            deQ.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] dailyTemps = {28,27,28,29,32,36,38};
        DailyTemperaturesUsingDeque dailyTemperaturesUsingDeque = new DailyTemperaturesUsingDeque();
        int[] res = dailyTemperaturesUsingDeque.dailyTemperatures(dailyTemps);
        for (int finalRes : res){
            System.out.print(finalRes+" ");
        }

    }
}
