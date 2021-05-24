package javaBasic.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TimesCharacterAppears {

	public static void main(String[] args) {
		TimesCharacterAppears appears = new TimesCharacterAppears();
		appears.countCharacter("I am Indian");
	}
	
	public void countCharacter(String inputStr) {
		
		Map<Character, Integer> numCharMap  = new HashMap<Character, Integer>();
		
		for(int i=0; i<inputStr.length(); i++) {
			char stringCharacter = inputStr.charAt(i);
			
			if(stringCharacter == ' '){
				continue;
			}
			// // If that character is already there in the map
            // then increase the value by 1
			if(numCharMap.containsKey(stringCharacter)){
				numCharMap.put(stringCharacter, numCharMap.get(stringCharacter)+1);
			} else {
				numCharMap.put(stringCharacter, 1);
			}
			
		}
		
		// Display entries in Map
		Set<Map.Entry<Character, Integer>>  entriesSet = numCharMap.entrySet();
		for(Map.Entry<Character, Integer> m : entriesSet) {
			System.out.println("Character: "+ m.getKey() + " Count: "+ m.getValue());
		}
	}
}
