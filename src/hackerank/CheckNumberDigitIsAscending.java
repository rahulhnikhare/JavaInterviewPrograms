package hackerank;
/*ORACLE*/
class CheckNumberDigitIsAscending {
    public static void main(String args[]) {
        /*// new Main().check(35789); // should print Ascending
        new Main().check(35787); // should print Not Ascending
        * */
        //1
       int num= 35789;
       boolean flag = false;
        
       //2
       ////Scanner scanner = new Scanner(System.in);
        
       //3
       System.out.println("Enter a number : ");
       //num = scanner.nextInt();
        
       //4
       int currentDigit = num % 10;
       num = num/10;
        
       //5
       while(num>0){
           //6
           if(currentDigit <= num % 10){
               flag = true;
               break;
           }

           currentDigit = num % 10;
           num = num/10;
       }
        
       //7
       if(flag){
           System.out.println("Digits are not in increasing order.");
       }else{
           System.out.println("Digits are in increasing order.");
       }
    }
}
