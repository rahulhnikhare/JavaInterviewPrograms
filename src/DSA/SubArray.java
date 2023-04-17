/*
package DSA;

import java.util.HashMap;
import java.util.Map;

// Find longest Subarray of EQUAL 1 and Zero's
public class SubArray {
    public static void main(String[] args) {
        int [] arr = {1,0,1,1,1,0,0};
        //int
    }

    public static int equalSubArray(int[] arr){
        int currentSum = 0;

        //approach
        //Convert all Zero to -1
        //Store each sum in HM
        //if the sum found, increase lenght+1;

        for(int i=0;i<arr.length;i++){
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }
        int maxLenght =0;
        int end =0;
        Map<Integer,Integer> map = new HashMap();


        for(int i=0;i<arr.length;i++){
            currentSum +=arr[i];
            if(currentSum == 0){
                maxLenght = i+1;
                end =i;

            }
            if(map.containsKey(currentSum)){
                maxLenght = maxLenght+1;
                end=i;
            }
            map.put(currentSum,i);
        }

    }
}
*/
