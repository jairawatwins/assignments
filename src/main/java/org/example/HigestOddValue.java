package org.example;

public class HigestOddValue {
    public int highestOddValue() {
        int[] arr = {82, 7, 8, 9, 23, 56, 39, 13};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        return 0;
    }

    public static void main(String[] args) {
        HigestOddValue obj = new HigestOddValue();
        obj.highestOddValue();
    }
}
