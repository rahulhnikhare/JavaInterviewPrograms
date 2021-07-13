package patternMatcher;

import java.util.*;
import java.util.stream.Collectors;

/*
* Given a dictionary of words where each word follows CamelCase notation,
print all words in the dictionary that match with a given pattern consisting
of uppercase characters only.

Example 1:
----------
Input: N=8
Dictionary=["Hi","Hello","HelloWorld",
"HiTech","HiGeek","HiTechWorld",
"HiTechCity","HiTechLab"]
Pattern="HA"
Output: No match found

Example 2:
----------
Input: N=3
Dictionary={"FanOfMarvel","FanOfTony","IronManTonyStark"}
Pattern="IMT"
Output: IronManTonyStark
* */
public class MatchPatternInString {
    public static void main(String[] args) {
        //final List<String> dictionary = Arrays.asList("FanOfMarvel", "FanOfTony", "IronManTonyStark");
        final List<String> dictionary = Arrays.asList("Hi","Hello","HelloWorld","HiTech","HiGeek","HiTechWorld","HiTechCity","HiTechLab");
        final String patterToCheck = "HG";
        //if Input =IronManTonyStark then Output: IronManTonyStark

        List<HashMap<String, String>> mapList = new ArrayList<>();
        HashMap<String, String> hmInput = new HashMap<>();
        for (String input : dictionary) {
            hmInput = stringPatternMatcher(input);
            mapList.add( hmInput);
        }
        //System.out.println(mapList);

        HashMap<String, String> hashMap = concatenateMap(mapList);

        String hmOutput = hashMap.get(patterToCheck);
        if(hmOutput != null && !hmOutput.isEmpty()){
            System.out.println("For pattern "+patterToCheck + " matched found "+ hmOutput);
        } else{
            System.out.println("No match found");
        }

    }

    public static HashMap<String, String> stringPatternMatcher(String dictionaryInput) {

        HashMap<String, String> hashMap = new HashMap<>();

        char[] charArray = dictionaryInput.toCharArray();
        String keyString = new String();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                keyString = keyString+ charArray[i];
                hashMap.put(keyString, dictionaryInput);
            }
        }
        return hashMap;
    }
    public static HashMap<String, String> concatenateMap(List<HashMap<String, String>> mapList){
        HashMap<String, String> map = new HashMap<>();

        for(int i = 0; i < mapList.size(); ++i){
            HashMap<String, String> mapIn = mapList.get(i);
            //Map merged to one . Without overriding the value for same key
            //https://howtodoinjava.com/java/collections/hashmap/merge-two-hashmaps/#:~:text=Merge%20two%20hashmaps%20%E2%80%93%20ignore%20duplicate,does%20not%20allow%20duplicate%20keys.
            mapIn.forEach(
                    (key, value) ->map.merge(key, value,(v1,v2)->v1.equalsIgnoreCase(v2)?v1: v1+","+v2)
            );
        }
        return map;
    }
}
