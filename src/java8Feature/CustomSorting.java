package java8Feature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSorting {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Test1", 32);
        Employee e2 = new Employee(2,"Sest2", 23);
        Employee e3 = new Employee(3,"Aest3", 44);
        Employee e4 = new Employee(4,"Best4", 25);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
// Solution 1
        List<Employee> sortedList = employeeList.stream()
                .sorted((o1, o2) -> {
                    if(o1.getAge() == o2.getAge())
                        return o1.getName().compareTo(o2.getName());
                    else if(o1.getAge() > o2.getAge())
                        return 1;
                    else return -1;
                })
                .collect(Collectors.toList());

        //sortedList.forEach(System.out::println);

        // Solution 2
        List<Employee> employeeListSorted =
        employeeList
                .stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed()) // Descending Order
                .collect(Collectors.toList());

        employeeListSorted.forEach(System.out::println);

    }
}
