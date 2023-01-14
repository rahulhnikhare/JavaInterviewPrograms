package javaBasic;

public class LongestCommonSubString {
    public static void main(String[] args) {
        char str1[] = "abcdef".toCharArray();
        char str2[] = "zcdemf".toCharArray();
        System.out.println("Longest Substring in given String is " + longestCommonSubstring(str1, str2));
    }

    public static String longestCommonSubstring(char str1[], char str2[]) {
        int T[][] = new int[str1.length + 1][str2.length + 1];
        StringBuilder stringBuilder = new StringBuilder();
        int max = 0;
        for (int i = 1; i <= str1.length; i++) {
            for (int j = 1; j <= str2.length; j++) {
                if (str1[i - 1] == str2[j - 1]) {
                    T[i][j] = T[i - 1][j - 1] + 1;
                    if (max < T[i][j]) {
                        max = T[i][j];
                        //System.out.println(str1[max+1]+"::"+str2[max]);
                        stringBuilder.append(str2[max]);
                    }
                }
            }
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }
}
