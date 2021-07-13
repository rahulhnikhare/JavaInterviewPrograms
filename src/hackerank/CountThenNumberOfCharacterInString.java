package hackerank;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountThenNumberOfCharacterInString {
    public static void main(String[] args) {
        System.out.println(test().toString());
        TreeMap<Character, Integer> map = test();
        String str = new String();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            /*System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getKey());*/
                str = str + entry.getKey().toString() + entry.getValue();
            System.out.println(entry.getKey().toString() + entry.getValue());
           // System.out.println();
        }
        System.out.println(str);
    }



    public static TreeMap<Character, Integer>  test(){
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
        String s = "phqgh";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, new Integer(val + 1));
            }
            else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
