package javaBasic.problemSolving;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
    public static void main(String[] args) {
        int input[] = {121, 122, 134, 1221};
        List<Integer> palindromeList = isPalindrome(input);
        System.out.println(" Palindrome Number are :" + palindromeList);
    }

    public static List<Integer> isPalindrome(int input[]) {
        int length = input.length;
        List<Integer> palindromeList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int remainder, temp, sum = 0;
            temp = input[i];
            while (temp > 0) {
                remainder = temp % 10;
                sum = (sum * 10) + remainder;
                temp = temp / 10;
            }
            if (sum == input[i]) {
                palindromeList.add(input[i]);
            }
        }
        return palindromeList;
    }
}
