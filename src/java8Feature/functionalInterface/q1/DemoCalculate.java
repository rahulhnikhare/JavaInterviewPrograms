package java8Feature.functionalInterface.q1;

public class DemoCalculate {
    public static void main(String[] args) {
        int a =8;
        int b = 9;
        Calculate calculate = (x,y)-> x*y; // Functional Interface implementation
        System.out.println(calculate.calculate(a,b));

    }
}
