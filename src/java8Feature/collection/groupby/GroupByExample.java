package java8Feature.collection.groupby;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByExample {

    // Logger logger = new com.sun.javafx.logging.Logger()

    private List<Student> studentClasses;

    @Before
    public void setUp() {

        studentClasses = new ArrayList<>();

        studentClasses.add(new Student("Kumar", 101, "Intro to Web"));
        studentClasses.add(new Student("White", 102, "Advanced Java"));
        studentClasses.add(new Student("Kumar", 101, "Intro to Cobol"));
        studentClasses.add(new Student("Sargent", 101, "Intro to Web"));
        studentClasses.add(new Student("Sargent", 102, "Advanced Web"));

    }

    @Test
    public void group_by_teacher_name() {
        //Create Map<Length_of_String,List_Of_String> from List<String>
        Map<String, List<Student>> groupByTeachers = studentClasses
                .stream().collect(
                        Collectors.groupingBy(Student::getTeacher));

        System.out.println(groupByTeachers);
        //assertEquals(1, groupByTeachers.get("White").size());
        String s1 ="HelloW";
        String s2 ="Hello";
        s2= s1+"W";
        //System.out.println(" DoubleEQual " + s2==s1); // False . Address differenet
        System.out.println("s2==s1 EqualsMethod " + s2.equals(s1)); // False .StringPool

    }

    @Test
    public void convertListToMap() {
        List<String> cards = Arrays.asList("Gisa", "MasterCard", "American Express", "Visa");

        Map<Integer, List<String>> cards2Length = cards.stream()
                .collect(
                        Collectors.groupingBy(
                                String::length,
                                Collectors.mapping(Function.identity(), Collectors.toList())

                        )
                );

        System.out.println("map: " + cards2Length);
        System.out.println("List: " + cards2Length.entrySet().stream().collect(Collectors.toList()));
        /*
         * OUTPUT map: {16=[American Express], 4=[Lisa, Visa], 10=[MasterCard]}
         * */


    }

}


