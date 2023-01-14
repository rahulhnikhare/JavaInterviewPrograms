package javaBasic.problemSolving;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaximumOccurredCharacter {
/*
    public static void main(String[] args) {
        String str = "aabbcccc";

        char ch =
                str.chars()
                        .mapToObj(x -> (char) x)// box to Character
                        .collect(Collectors.groupingBy(x -> x, Collectors.counting())) // collect to Map<Character, Long>
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())// find entry with largest count
                        .get()
                        .getKey();
        System.out.println(ch);

    }
*/

    public static void main(String a[]) {
        Map<Character, Integer> map = new HashMap<>();
        String input = "aabbcccc";
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }//for
        int maxOccurred = Collections.max(map.values());
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxOccurred) {
                System.out.println(entry.getKey() + " Character repeated " + maxOccurred + " times");
            }
        }//for

    }
}
