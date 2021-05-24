package javaBasic.problemSolving;

import java.util.Arrays;

public class CharString {

    public static void main(String[] args) {
        //Example 1: Convert char to String
        char ch = 'c';
        String st = Character.toString(ch);
        // Alternatively
        // st = String.valueOf(ch);
        System.out.println("The string is: " + st);
/***********************************************************/
        //Example 2: Convert char array to String
        char[] ch1 = {'a', 'e', 'i', 'o', 'u'};

        String st1 = String.valueOf(ch1);
        String st2 = new String(ch1);

        System.out.println(st1);
        System.out.println(st2);
        /*Output
        aeiou
        aeiou
        */
/***********************************************************/
        //Example 3: Convert String to char array
        String st3 = "This is great";

        char[] chars = st3.toCharArray();
        System.out.println(Arrays.toString(chars));
        //Output: [T, h, i, s,  , i, s,  , g, r, e, a, t]
    }
}
