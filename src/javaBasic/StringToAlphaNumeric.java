package javaBasic;
/*Can you write a name that turns input into a numero name?
a) "the programme should be written in various approaches using object oriented way ,
collection approach etc etc Write a programme to return an alphanumeric code For example
when input is india and output would be first character and last character and the number of
letters between them so for India the output should be
--> i4a diffence should be reduced when it queried for the second time
--> i3a"*/
public class StringToAlphaNumeric {
    public static void main(String[] args) {
        String input = "India";
        String out = getAlphaNumeric(input);
        System.out.println("Res ->"+ out);

    }

    public static String getAlphaNumeric(String input){
        if(input.length() == 0) return "";

        int lenth = input.length();
        StringBuilder sbInput = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        char first = input.charAt(0);
        char last = input.charAt(lenth-1);
        String s = input.substring(0,lenth-1);
        for(int i=1;i<lenth-1;i++){
        sb = sb.append(input.charAt(i));
        }
        System.out.println(sb);
        return sbInput.append(input.charAt(0)).append(sb.length()).append(input.charAt(lenth-1)).toString();
    }
}
