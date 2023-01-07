package javaBasic.StringallCombination;

//Write a program to print all combination of the given String. E
// Ex – ABC: ABC, BCA, CAB, CBA, BAC, ACB
public class StringAllCombination {
    public static void main(String[] args) {
        // Get all combination
        String str = "ABC";
        int len = str.length();
        System.out.println("All the permutations of the string are: ");
        generatePermutation(str, 0, len);

    }
    //Function for generating different permutations of the string
    public static void generatePermutation(String str, int start, int end)
    {
        //Prints the permutations
        if (start == end-1) // End is Sizeof String only
            System.out.println(str);
        else
        {
            for (int i = start; i < end; i++)
            {
                //Swapping the string by fixing a character
                str = swapString(str,start,i);
                //Recursively calling function generatePermutation() for rest of the characters
                generatePermutation(str,start+1,end);
                //Backtracking and swapping the characters again.
                str = swapString(str,start,i);
            }
        }
    }

    public static String swapString(String inp, int i, int j){
        char b [] = inp.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }
}
