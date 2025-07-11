package org.testseed.Arrays;

import java.util.Scanner;

public class InsertInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1]; // extra space for insertion

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element and position to insert
        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter position to insert (0 to " + n + "): ");
        int pos = sc.nextInt();

        if (pos < 0 || pos > n) {
            System.out.println("Invalid position.");
            sc.close();
            return;
        }

        // Shift elements right
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert
        arr[pos] = element;
        n++;

        // Display updated array
        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
