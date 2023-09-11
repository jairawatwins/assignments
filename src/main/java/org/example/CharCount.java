package org.example;

import java.util.Scanner;

public class CharCount {
    public static String charCount(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        }

        StringBuilder compressed = new StringBuilder();
        char currentChar = name.charAt(0);
        int count = 1;

        for (int i = 1; i < name.length(); i++) {
            char nextChar = name.charAt(i);
            if (nextChar == currentChar) {
                count++;
            } else {
                compressed.append(count).append(currentChar);
                currentChar = nextChar;
                count = 1;
            }
        }

        compressed.append(count).append(currentChar);
        return compressed.toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str= sc.nextLine();
        String compressed = charCount(str);
        System.out.println(compressed);
    }
}
