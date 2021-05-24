package javaBasic.problemSolving;

public class CharToInt {
    public static void main(String[] args) {

        // create char variables
        char a = '5';
        char b = '9';

        // convert char variables to int
        // Use getNumericValue()
        int num1 = Character.getNumericValue(a);
        int num2 = Character.getNumericValue(b);

        // print the numeric value of characters
        System.out.println(num1);    // 5
        System.out.println(num2);    // 9//
 /*****************************************************************/

    //Example 4: char to int by subtracting with '0'
        // create char variables
        char a2 = '9';
        char b2 = '3';

        // convert char variables to int
        // by subtracting with char 0
        int num21 = a - '0';
        int num22 = b - '0';

        // print numeric value
        System.out.println(num1);    // 9
        System.out.println(num2);    // 3

    }
}
