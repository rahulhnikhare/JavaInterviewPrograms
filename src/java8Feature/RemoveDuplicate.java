package java8Feature;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Test1", 22);
        Employee e2 = new Employee(2, "Sest2", 23);
        Employee e3 = new Employee(3, "Aest3", 24);
        Employee e4 = new Employee(4, "Best4", 25);
        Employee e5 = new Employee(1, "Test1", 22);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        Comparator<Employee> byName = (e11, e22) -> e1.getName().compareTo(e2.getName());


        /*Solution 1*/
        Set<Employee> uniqueList = employeeList.stream()
                .collect(Collectors.toCollection(
                        () -> new TreeSet<>(Comparator.comparing(Employee::getId))
                ));
        uniqueList.stream()
                .forEach(e -> System.out.println("uniqueList->" + e.toString()));
        System.out.println(" ======================================================================= ");

        /*Solution 2*/
        Set<String> namesAlreadySeen = new HashSet<>();
        Set<Integer> idAlreadySeen = new HashSet<>();

        //employeeList.removeIf(p -> !namesAlreadySeen.add(p.getName()));

        employeeList.removeIf(p -> !idAlreadySeen.add(p.getId()));

        employeeList.stream().forEach(e -> System.out.println("EMP LIST-> " + e.toString()));

        System.out.println(" ======================================================================= ");

        /*Remove Dupicate Number*/
        Integer[] arr = new Integer[]{100, 24, 13, 44, 114, 200, 40, 112, 100};

        List<Integer> integerList =
                Arrays.asList(arr)
                        .stream()
                        .distinct() // Removed duplicates
                        .collect(Collectors.toList());

        integerList.stream().sorted().forEach(System.out::println);// Sort Integer List. Same can be applied to String List

        Arrays.asList("John", "Mark", "Robert", "Lucas", "Brandon")
                .stream()
                .sorted().forEach(System.out::println);

    }
}
