package org.example;

import java.util.Scanner;

public class HighestOddValue {
    public int highestOddValue() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many element in array: ");
        n = sc.nextInt();
        int[] array = new int[n];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.println("element " + (i + 1) + " :");
            array[i] = sc.nextInt();
            if (array[i] % 2 != 0 && array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Highest odd value: " + max);

        return max;
    }

    public static void main(String[] args) {
        HighestOddValue obj = new HighestOddValue();
        obj.highestOddValue();
    }
}
