package javaBasic;

import java.util.Arrays;

public class LongestPrefixFromString {
    public static void main(String[] args) {
        String[] input = {"clap", "club", "clue"};
        //String[] input = {"tiger", "flower", "flow"};
        String longestPrefix = findLongestPrefix(input);
        longestPrefix = longestPrefix.length() > 0 ? longestPrefix : "NONE";
        System.out.println("For given Array " + Arrays.asList(input) + " ,longest Prefix is " + longestPrefix);
    }

    public static String findLongestPrefix(String[] inputStr) {
        StringBuilder stringBuilder = new StringBuilder();
        int inputLength = inputStr.length;
        // Sorting will help to arrange on basis of Charater
        Arrays.sort(inputStr);
        //Get first String in character Array
        char[] first = inputStr[0].toCharArray();
        //Get Last String in character Array
        char[] last = inputStr[inputStr.length - 1].toCharArray();
        //Start Comparing
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) break;
            stringBuilder.append(first[i]);
        }
        return stringBuilder.toString();
    }
}
