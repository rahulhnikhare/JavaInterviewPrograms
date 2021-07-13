package java8Feature.functionalInterface;

@FunctionalInterface
public interface Interface1 {
	
	 void interfaceMethod1();
	 
	 public static void statMethod() {
		 System.out.println("STAT Method of Interface1");
		 
		 
	 }

	 default void defaultMethod() {
		 Interface1.statMethod();
		 System.out.println("defaultMethod Method of Interface1");
	 }

}
