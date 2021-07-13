package hackerank;

interface Trimmer {
      String trim(String str);

      String rightTrim(String str);

      String leftTrim(String str); 

    }
class TrimmerImpl implements Trimmer{
 public String trim(String str){
      
     return str.replaceAll("_","");

  }
  
 public String rightTrim(String str){
   StringBuilder sb = new StringBuilder(str);
   while(sb.length()>0 && sb.charAt(sb.length()-1) == '_'){
     sb.setLength(sb.length()-1);
   }
   return sb.toString();

  }
 public String leftTrim(String str){
   StringBuilder sb = new StringBuilder(str);
   while(sb.length()>0 && sb.charAt(0)== '_'){
     sb.deleteCharAt(0);
   }
   return sb.toString();
  }

}    
class Main1  {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    TrimmerImpl tm = new TrimmerImpl();
    System.out.println(tm.trim("ab_cd"));
  }
}



/***
From Sandesh Jagdale to Everyone:  03:46 PM
String Trimmer
--------------

Implement the String `Trimmer` interface. These methods will remove one or more underscores from both sides of the String, from the end of the String and from the beginning of the String, respectively.

    interface Trimmer {
      String trim(String str);

      String rightTrim(String str);

      String leftTrim(String str); 

    }

***/
