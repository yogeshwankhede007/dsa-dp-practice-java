package org.testseed.Arrays;

public class DailyTemperaturesBruteForce {

    public int[] getDailyTemp(int[] temps){
        int n = temps.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if(temps[j] > temps[i]){
                    res[i]= j-i;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] dailyTemps = {28,27,28,29,32,36,38};
        DailyTemperaturesBruteForce dtbf = new DailyTemperaturesBruteForce();
        int[] results = dtbf.getDailyTemp(dailyTemps);
        for (int diff : results){
            System.out.print(diff+" ");
        }
    }
}
