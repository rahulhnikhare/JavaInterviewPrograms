package recurrsion;

public class SumDigit {
    static int sum_of_digit(int n)
    {
        if (n == 0)
            return 0;
        return (n % 10 + sum_of_digit(n / 10));
    }

    // Driven Program to check above
    public static void main(String args[])
    {
        int num = 158;
        int result = sum_of_digit(num);
        if(result>10){
            result = sum_of_digit(result);
        }
        System.out.println("Sum of digits in " +
                num + " is " + result);
    }
}
