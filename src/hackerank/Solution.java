package hackerank;

import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        if (s.length() == 0 || s == null) {
            return s;
        }
        Stack<String> strStack = new Stack<String>();
        Stack<Integer> numStack = new Stack<Integer>();
        StringBuilder res = new StringBuilder();
        int idx = 0;
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                int num = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    num = num * 10 + (s.charAt(idx) - '0');
                    idx++;
                }
                numStack.push(num);
            } else if (s.charAt(idx) == '[') {
                strStack.push(res.toString());
                res = new StringBuilder("");
                idx++;
            } else if (s.charAt(idx) == ']') {
                StringBuilder temp = new
                              StringBuilder(strStack.pop());
                int repeatTimes = numStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp;
                idx++;
            } else {
                res.append(s.charAt(idx++));
            }
        }
        return res.toString();
    }
}
//Character.isDigit() is a good way to check if it’s number or char
//convert string to integer: from left to right, current total * 10 + current digit
