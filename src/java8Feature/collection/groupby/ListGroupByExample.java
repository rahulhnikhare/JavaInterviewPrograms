package java8Feature.collection.groupby;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListGroupByExample {
    public final static List<String> namesList =
            Arrays.asList("apple", "apple", "banana",
                    "apple", "orange", "banana", "papaya");

    public static void main(String[] args) {
        getCountsForEachName();
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
        System.out.println(result);
    }

    public static <T> Set<T> findDuplicateByFrequency(List<T> list) {

        return list.stream()
                .filter(i -> Collections.frequency(list, i) > 1)
                .collect(Collectors.toSet());

    }
}
