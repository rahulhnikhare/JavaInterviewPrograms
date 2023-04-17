package DSA;

public class Palindrome {
    public static void main(String[] args) {
        //String input = "abba";
        String input = "racecar";

        System.out.println(isPalindrome(input,0,input.length()-1));
    }
    public static boolean isPalindrome(String input, int L, int R){

        if(L>=R){
            return true;
        }
        if(input.charAt(L) != input.charAt(R)){
            return false;
        }
        return isPalindrome(input, L+1,R-1);
    }
}
