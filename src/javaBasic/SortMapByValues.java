package javaBasic;

import java.util.*;

public class SortMapByValues {
    public static void main(String[] args) {
        HashMap<String, Integer> mapData = new HashMap();
        mapData.put("B", 1);
        mapData.put("A", 12);
        mapData.put("C", 13);
        mapData.put("D", 16);
        mapData.put("E", 99);
        List<Map.Entry<String, Integer>> entryList =
                new ArrayList<>(mapData.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        entryList.forEach(System.out::println);
    }
}

