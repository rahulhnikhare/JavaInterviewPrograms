package java8Feature.collection.sort.onField;

public class EmployeeDepartment {
	public String department;
    public int salary;
	public EmployeeDepartment(String department, int salary) {
		super();
		this.department = department;
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
	return "EmployeeDepartment{" +
        "department=" + this.department + '\'' +
        ", salary='" + this.salary + '\'' +'}'   ;
	}
    
    

}
