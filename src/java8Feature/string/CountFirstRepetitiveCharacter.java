package java8Feature.string;
/*LOGIC MONITOR*/

import com.sun.xml.internal.ws.util.ASCIIUtility;

class CountFirstRepetitiveCharacter
{ 
    static final int NO_OF_CHARS = 256; 
    static char count[] = new char[NO_OF_CHARS]; 
      
    /* calculate count of characters  
       in the passed string */
     private static void getCharCountArray(String str)
     {
         for (int i = 0; i < str.length();  i++) {
             count[str.charAt(i)]++; // VERY IMPORTANT***** ++

             System.out.println("str.charAt(i) = " + str.charAt(i));
         }
         System.out.println("count.length = " + count.length);



     } 
       
    /* The method returns index of first non-repeating 
       character in a string. If all characters are repeating  
       then returns -1 */
    static String firstNonRepeating(String str)
    { 
        getCharCountArray(str);

        /*Print count here*/
        System.out.println("count.length = " + count.length);
        
        int index = -1, i; 
       
        for (i = 0; i < str.length();  i++) 
        { 
            if (count[str.charAt(i)] == 1)  // Count array form with number of repeat character
            { 
                index = i; 
                break; 
            }    
        }
       
        return index == -1 ? " Repeating/empty String":Character.toString(str.charAt(index));
    }
  
    // Driver method 
    public static void main (String[] args) 
    { 
        String str = "iamrahulnikhare";
        //String str = "Go hang a salami, I'm a lasagna hog!";
        String index =  firstNonRepeating(str);
          
        System.out.println(index);
    } 
} 
