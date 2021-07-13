package java8Feature.collection.groupby;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountsForEachNameGroupByExample {
    public final static List<String> namesList =
            Arrays.asList("apple", "apple", "banana",
                    "apple", "orange", "banana", "papaya");

    public static void main(String[] args) {
        getCountsForEachName();
        findDuplicateByFrequency();
    }

    public static void getCountsForEachName() {

        Map<String, Long> result =
                namesList.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Function.identity(),
                                        Collectors.counting()
                                )
                        );
        System.out.println("getCountsForEachName -> " + result);//{papaya=1, orange=1, banana=2, apple=3}
        System.out.println("===============================");
        System.out.println("===============================");

    }

    public static void findDuplicateByFrequency() {
        /*Find elements which are duplicates more than 1*/
        Set result = namesList.stream()
                //.filter(i -> Collections.frequency(namesList, i) > 1)
                .collect(Collectors.toSet());
        System.out.println("findDuplicateByFrequency-> " + result);

    }
}
