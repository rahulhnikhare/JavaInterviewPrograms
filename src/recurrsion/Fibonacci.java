package recurrsion;

public class Fibonacci {
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
    public static void main(String[] args) {
        System.out.print("Fibo -> ");
        for(int i=0;i<=50;i++){
            System.out.print( getFibonacci(i) +" ");
        }
    }

    public  static double getFibonacci(double input) {
        if(input==0){
            return 0;
        }
        if (input==1 || input==2) return 1;
        return getFibonacci(input-2)+getFibonacci(input-1) ;
    }
}
