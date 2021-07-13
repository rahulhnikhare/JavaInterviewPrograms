package javaBasic.overriding_parent_child;

public class Main {
	public static void main(String[] args) {

		Parent p1 = new Parent();
		p1.display(); // Im am PARENT DISPLAY


		Parent p2 = new Child();
		p2.display(); // Im am CHILD display


		Child c1 = new Child();
		c1.display(); //Im am CHILD display


		// Compiletime Asked for TYPECASTING . Runtime Exception: overriding_parent_child.Parent cannot be cast to overriding_parent_child.Child
		Child c2 = (Child) new Parent();
//		c2.display();


	}
}

