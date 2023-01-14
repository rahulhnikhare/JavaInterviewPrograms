package javaBasic;

import java.util.Stack;

/*
* Traverse the string from left to right.
If we encounter the open/left parenthesis, then we will push it to the Stack data structure due to its Last In First Out (LIFO) property.
If we encounter any of the close/right parentheses, we will check it with the top of the stack. If it is the correct corresponding open/left parenthesis, we will move further, else we will return false.
At last, for valid string, the stack should be empty because all the left parentheses should have matched with the right ones.
* */
public class ValidParenthesis {
    public static void main(String[] args) {
        String input = "()(";
        String result = isValid(input) == true ? "Valid" : " not Valid";
        System.out.println("Given Input " + input + " is " + result);
    }

    public static boolean isValid(String s) {
        // Stack to store left symbols
        Stack<Character> leftSymbols = new Stack<>();
        // Loop for each character of the string
        for (char c : s.toCharArray()) {
            // If left symbol is encountered
            if (c == '(' || c == '{' || c == '[') {
                leftSymbols.push(c);
            }
            // If right symbol is encountered
            else if (c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
                leftSymbols.pop();
            } else if (c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
                leftSymbols.pop();
            } else if (c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
                leftSymbols.pop();
            }
            // If none of the valid symbols is encountered
            else {
                return false;
            }
        }
        return leftSymbols.isEmpty();
    }
}
