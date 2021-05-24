package java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapVs {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Test1", 22);
        Employee e2 = new Employee(2,"Sest2", 23);
        Employee e3 = new Employee(3,"Aest3", 24);
        Employee e4 = new Employee(4,"Best4", 25);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);

/*you can convert a List  to Map*/
        Map<Integer,Employee> mapData =
                employeeList.stream()
                .collect(Collectors.toMap(Employee::getId,employee-> employee));

/*Print Map*/
        mapData.forEach((K,V)->{                 // mapofmaps entries
                System.out.println(K+" "+ V.toString());       // print key and value of inner Hashmap
            });
    }
}
