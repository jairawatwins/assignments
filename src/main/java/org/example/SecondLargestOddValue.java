package org.example;

import java.util.Scanner;

public class SecondLargestOddValue {
    public int secondLargestOddValue() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many element in array: ");
        n = sc.nextInt();
        int[] array = new int[n];

        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.println("element " + (i + 1) + " :");
            array[i] = sc.nextInt();
            if (array[i] % 2 != 0 && array[i] > max) {
                if(array[i] > max){
                    secondLargest = max;
                    max = array[i];
                }
                else if(array[i] > secondLargest && array[i] != max){
                    secondLargest = array[i];
                }
            }
        }
        System.out.println("Highest odd value in array: " + secondLargest);

        return max;
    }

    public static void main(String[] args) {
        SecondLargestOddValue obj = new SecondLargestOddValue();
        obj.secondLargestOddValue();
    }
}
