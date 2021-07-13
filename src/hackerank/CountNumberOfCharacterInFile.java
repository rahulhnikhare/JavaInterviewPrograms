package hackerank;

import java.io.File;
import java.io.FileInputStream;
public class CountNumberOfCharacterInFile {
   public static void main(String args[]) throws Exception{

      int count =0;
      File file = new File("data");
      FileInputStream fis = new FileInputStream(file);
      byte[] bytesArray = new byte[(int)file.length()];
      fis.read(bytesArray);
      String s = new String(bytesArray);
      String [] data = s.split(" ");
      for (int i=0; i<data.length; i++) {
         count++;
      }
      System.out.println("Number of characters in the given file are " +count);
   }
}
