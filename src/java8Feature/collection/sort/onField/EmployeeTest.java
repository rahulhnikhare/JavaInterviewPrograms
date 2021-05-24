package java8Feature.collection.sort.onField;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

import org.junit.Before;
import org.junit.Test;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class EmployeeTest {

    List<Employee> employees;
    List<EmployeeDepartment> employeeDepartment;

    @Before
    public void setup() {
        employees = new ArrayList<>();
        employees.add(new Employee(123, "Jack", "Johnson", LocalDate.of(1988, Month.APRIL, 12)));
        employees.add(new Employee(12, "Jack", "Johnson", LocalDate.of(1988, Month.APRIL, 12)));
        employees.add(new Employee(345, "Cindy", "Bower", LocalDate.of(2011, Month.DECEMBER, 15)));
        employees.add(new Employee(567, "Perry", "Node", LocalDate.of(2005, Month.JUNE, 07)));
        employees.add(new Employee(467, "Pam", "Krauss", LocalDate.of(2005, Month.JUNE, 07)));
        employees.add(new Employee(435, "Fred", "Shak", LocalDate.of(1988, Month.APRIL, 17)));
        employees.add(new Employee(678, "Ann", "Lee", LocalDate.of(2007, Month.APRIL, 12)));
        employees.add(new Employee(679, "Ann", "Keett", LocalDate.of(2007, Month.APRIL, 12)));
        employees.add(new Employee(677, "Ann", "Keetta", LocalDate.of(2007, Month.APRIL, 12)));
        employees.add(new Employee(659, "Ann", "Keettb", LocalDate.of(2007, Month.APRIL, 12)));

        employeeDepartment = new ArrayList<>();
        employeeDepartment.add(new EmployeeDepartment("CS", 10000));
        employeeDepartment.add(new EmployeeDepartment("CSE", 4000));
        employeeDepartment.add(new EmployeeDepartment("CSR", 1000));
        employeeDepartment.add(new EmployeeDepartment("CSR", 9000));
        employeeDepartment.add(new EmployeeDepartment("CST", 88000));
        employeeDepartment.add(new EmployeeDepartment("CSX", 140000));
        employeeDepartment.add(new EmployeeDepartment("CSC", 130000));
        employeeDepartment.add(new EmployeeDepartment("CSX", 145000));
        employeeDepartment.add(new EmployeeDepartment("CSC", 10000));

        System.out.println(employeeDepartment.size());
    }

    //@Test
    public void sort_by_employee_number() {
        Comparator<Employee> byFirstName = (e1, e2) -> e1.getEmployeeFirstName().compareTo(e2.getEmployeeFirstName());

        Comparator<Employee> byEmployeeNumber = (e1, e2) -> e1.getEmployeeNumber().compareTo(e2.getEmployeeNumber());

        employees.stream().sorted(byFirstName.thenComparing(byEmployeeNumber))
                .forEach(e -> System.out.println(e.toString()));
        //Both are correct
    }


    //Get   longest tenured employee'
//@Test
    public void getLongestTenuredEmployee_rev() {
        Comparator<Employee> byHireDate = (e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate());

        employees.stream().sorted(byHireDate.reversed()).forEach(System.out::println);
        System.out.println("=======================================================");
    }

    //@Test
    public void getLongestTenuredEmployee() {
        Comparator<Employee> byHireDate = (e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate());

        employees.stream().sorted(byHireDate).forEach(System.out::println);
    }

    //@Test
    public void findFirstLongestTenuredEmployee() {
        Comparator<Employee> comparator = (e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate());

        Optional<Employee> employee = employees
                .stream()
                .sorted(comparator).findFirst();

        System.out.println(employee.get());

    }

    //@Test
    public void multipleSort_by_using_Firstname_lastname() {
        Comparator<Employee> byFirstname = (e1, e2) -> e1.getEmployeeFirstName().compareTo(e2.getEmployeeFirstName());
        Comparator<Employee> byLastName = (e1, e2) -> e1.getEmployeeLastName().compareTo(e2.getEmployeeLastName());

        employees.stream().sorted(byFirstname.thenComparing(byLastName)).forEach(System.out::println);
    }

    //@Test
    public void sort_on_basis_of_FirstName_id() {

        Comparator<Employee> byFirstName = (e1, e2) -> e1.getEmployeeFirstName().compareTo(e2.getEmployeeFirstName());
        Comparator<Employee> byEmployeeNumber = (e1, e2) -> e1.getEmployeeNumber().compareTo(e2.getEmployeeNumber());
        employees.stream().sorted(byFirstName.thenComparing(byEmployeeNumber)).forEach(System.out::println);
    }

    //Get Highest salary employee by each department
    @Test
    public void get_Max_salary_per_department() {

        Map<String, EmployeeDepartment> topEmployees =
                employeeDepartment
                        .stream()
                        .collect(
                                groupingBy(
                                        e -> e.department,
                                        collectingAndThen(maxBy(comparingInt(e -> e.salary)), Optional::get)
                                )
                        );
        System.out.println(topEmployees);
    }
}
