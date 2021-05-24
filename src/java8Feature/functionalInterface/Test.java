package java8Feature.functionalInterface;

public class Test implements Interface1 {

	public static void main(String[] args) {

		Test test = new Test();
		//test.interfaceMethod1();
		test.defaultMethod();

	}

	@Override
	public void interfaceMethod1() {
		System.out.println("Test: interfaceMethod1");
	}
	
	 
}
