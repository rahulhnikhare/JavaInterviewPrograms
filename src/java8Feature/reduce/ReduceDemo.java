package java8Feature.reduce;

import java.util.Arrays;
import java.util.List;


public class ReduceDemo {
    public static void main(String[] args) {
        //Using reduce() with identity
        /*Syntax of reduce():T reduce(T identity, BinaryOperator<T> accumulator)*/
        //Finding longest String from a List of String
        List<String> countries = Arrays.asList("Germanyoooooo", "England", "China",
                "Denmark", "Brazil", "France", "Australia");


        String longestCountryName = countries.stream().reduce("",
                (c1, c2) -> c1.length() > c2.length() ? c1 : c2);

        System.out.println("Longest Country Name is " + longestCountryName);

        //Example : Calculating sum of numbers using reduce() method
        final List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int sum = numbers.stream().reduce(0,(num1,num2) -> num1+num2);

        System.out.println("Sum is " + sum);
    }
}
