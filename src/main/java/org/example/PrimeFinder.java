package org.example;

import java.util.Scanner;

public class PrimeFinder {
    public static void primeFinder(int n){
        int i,flag=0;
        if(n==0||n==1){
            System.out.println(n+" false");
        }else{
            for(i=2;i<=9;i++){
                if(n%i==0 && n!=i){
                    System.out.println(n+" false");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  {
                System.out.println(n+" true"); }
        }
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values you want to check for prime: ");
        int numValues = sc.nextInt();

        for (int i = 0; i < numValues; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int input = sc.nextInt();
            primeFinder(input);
        }
    }
}
