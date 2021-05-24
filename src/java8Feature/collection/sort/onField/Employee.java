package java8Feature.collection.sort.onField;

import java.time.LocalDate;


public class Employee {

    private Integer employeeNumber;
    private String employeeFirstName;
    private String employeeLastName;
    private LocalDate hireDate;
	public Employee(int i, String string, String string2, LocalDate of) {
		this.employeeNumber = i;
		this.employeeFirstName = string;
		this.employeeLastName = string2;
		this.hireDate = of;
		// TODO Auto-generated constructor stub
	}
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public String toString()
	{
	    return "Employee{" +
	            "employeeNumber=" + this.employeeNumber +
	            ", employeeFirstName='" + this.employeeFirstName + '\'' +
   	            ", employeeLastName='" + this.employeeLastName + '\'' +
   	              ", hireDate='" + this.hireDate + '\'' +
	            '}';
	}
    
}
