package string;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagram {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("ogd");
        list.add("god");
        list.add("atc");

        System.out.println(solver(list));
    }

    private static ArrayList<ArrayList<String>>
    solver(ArrayList<String> list) {
        // Inner hashmap counts frequency
        // of characters in a string.
        // Outer hashmap for if same
        // frequency characters are present in
        // in a string then it will add it to
        // the arraylist.
        HashMap<HashMap<Character, Integer>,
                ArrayList<String> >
                map = new HashMap<HashMap<Character, Integer>,
                ArrayList<String> >();

        for(String str : list){
            HashMap<Character, Integer> inMap =
                    new HashMap<Character, Integer>();
            for(int i=0;i<str.length();i++){
                if(inMap.containsKey(str.charAt(i))){
                    int count = inMap.get(str.charAt(i));
                    inMap.put(str.charAt(i),count++);
                }
                else {
                    inMap.put(str.charAt(i), 1);
                }
            }
            // If the same frequency of characters
            // are already present then add that
            // string into that arraylist otherwise
            // created a new arraylist and add that string

            if(map.containsKey(inMap)){
                map.get(inMap).add(str);
            }else {
                ArrayList<String> tempList = new ArrayList<String>();
                tempList.add(str);
                map.put(inMap,tempList);
            }
        }
        // Stores the result in a arraylist
        ArrayList<ArrayList<String> >
                result = new ArrayList<>();
        for (HashMap<Character, Integer>
                temp : map.keySet())
            result.add(map.get(temp));
        return result;
    }
}
