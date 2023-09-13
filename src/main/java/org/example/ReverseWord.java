package org.example;

import java.util.Scanner;

public class ReverseWord {
    public void reverseWord(){
        String sentence = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence you want to reverse ");
        String input = sc.nextLine();
        char result;

            for (int i = 0; i < input.length(); i++) {
               result =  input.charAt(i);
                sentence = result + sentence;
                if (input.charAt(i) == ' ') {
                    System.out.print(sentence);
                    sentence = "";
                }
            }
    }
    public static void main(String[] args) {
        ReverseWord obj = new ReverseWord();
        obj.reverseWord();
    }
}
