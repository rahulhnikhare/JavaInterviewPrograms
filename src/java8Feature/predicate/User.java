package java8Feature.predicate;

public class User {
	
	String first_name, last_name,city,adress;
	double salary;
	int age;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
	    return "first Name : " + first_name 
	    		+ ", Last Name :" + last_name
	    		+ ", City :" + city
	    		+ ", Address :" + adress
	    		+ ", Salary :" + salary
	    		+ ", Age :" + age ;
	 }

}
