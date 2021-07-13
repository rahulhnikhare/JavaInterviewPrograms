package javaBasic.staticMethods;

public class StaticMethodOveridingTest {
	
	public static void main(String[] args) {
		Parent parent = new Child();
		//Child child = (Child) new Parent();
		
		parent.diplay(); // Parent.display is static method
		parent.instanceMethod();
	}

}
