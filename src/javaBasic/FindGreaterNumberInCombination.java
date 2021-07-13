package javaBasic;

import java.util.*;
class FindGreaterNumberInCombination {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    int num = 123;
  // expect: input 123
  //out-> 132
//Smallest comibnation ans grater from given number

// I have to 1 ,2,3 .Divide this in array
//
String s1 = String.valueOf(num);
int numLength = s1.length();
int []intArr = new int[s1.length()];

for(int i=0;i<s1.length(); i++){
  intArr[i] = s1.charAt(i)-'0';
  //System.out.print("Arr"+intArr[i]);
}
  Arrays.sort(intArr); // Sorted array
  
  int num0 = intArr[0];
  //Generate number
  for(int i = numLength-1; i>0;i-- ){
    num0 = num0*10 + intArr[i];

    System.out.println("ArrIn -> "+num0);


  }
//System.out.print("Arr -> "+num0);

  }
}
