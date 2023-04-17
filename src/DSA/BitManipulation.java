package DSA;
//https://www.geeksforgeeks.org/find-two-non-repeating-elements-in-an-array-of-repeating-elements/
public class BitManipulation {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 7, 9, 11, 2, 3, 11 };
        int n = arr.length;
        uniqueNumber(arr,n);

    }
    public static void uniqueNumber(int[] arr, int length){
        int sum =0;
        for(int i =0;i<length;i++){
            sum = sum^arr[i];
            System.out.println("SUm->"+sum);
        }
        sum = sum &(-sum);
        int sum1 =0;
        int sum2 =0;

        for(int i =0;i<length;i++){
            if((arr[i]&sum) >0){// even;
                sum1 = sum1^arr[i];
            }
            else {
                sum2=sum2^arr[i];
            }
        }
        System.out.println(sum1+"::"+sum2);
        }
}
