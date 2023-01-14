package javaBasic;

import java.util.Arrays;

public class SumOfLargest3Number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.sort(arr);
        int length = arr.length;
        int sum = arr[length - 1] +
                arr[length - 2] +
                arr[length - 3];
        System.out.println("Largest Numbers in given Array " +
                Arrays.toString(arr)
                + " is " + arr[length - 1] + "," + arr[length - 2] + "," + arr[length - 3] + ". And its Sum is " +
                sum);
    }
}
