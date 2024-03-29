package javaBasic;

import java.math.BigInteger;

public class SumLargestNumber {
    public static void main(String[] args) {

        //Integer.MAX_VALUE
        String input1
                = "12";
        String input2
                = "789";

        // Convert the string input to BigInteger
        BigInteger a
                = new BigInteger(input1);
        BigInteger b
                = new BigInteger(input2);
        // Using add() method
        BigInteger sum = a.add(b);

        // Display the result in BigInteger
        System.out.println("The sum of\n"
                + a + " \nand\n" + b + " "
                + "\nis\n" + sum + "\n");
        String sumStr = findSum(input1, input2);
        System.out.println(sumStr);

    }

    static String findSum(String str1, String str2) {
        // Before proceeding further, make sure length
        // of str2 is larger.
        if (str1.length() > str2.length()) {
            String t = str1;
            str1 = str2;
            str2 = t;
        }

        // Take an empty String for storing result
        String str = "";

        // Calculate length of both String
        int n1 = str1.length(), n2 = str2.length();

        // Reverse both of Strings
        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();

        int carry = 0;
        for (int i = 0; i < n1; i++) {
            // Do school mathematics, compute sum of
            // current digits and carry
            int sum = ((int) (str1.charAt(i) - '0') +
                    (int) (str2.charAt(i) - '0') + carry);
            str += (char) (sum % 10 + '0');

            // Calculate carry for next step
            carry = sum / 10;
        }

        // Add remaining digits of larger number
        for (int i = n1; i < n2; i++) {
            int sum = ((int) (str2.charAt(i) - '0') + carry);
            str += (char) (sum % 10 + '0');
            carry = sum / 10;
        }

        // Add remaining carry
        if (carry > 0)
            str += (char) (carry + '0');

        // reverse resultant String
        str = new StringBuilder(str).reverse().toString();

        return str;
    }
}
