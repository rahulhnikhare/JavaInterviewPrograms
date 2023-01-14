import java.math.BigInteger;

public class Demo {
    public static void main(String[] args) {
        Float testFloat = 123.22f;
        System.out.println(testFloat);
        //Integer.MAX_VALUE
        String input1
                = "5454564684456454684646454545";
        String input2
                = "4256456484464684864864864864";

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


    }
}
