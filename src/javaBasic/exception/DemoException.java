package javaBasic.exception;

public class DemoException {

	public static void main(String[] args) {
		
		DemoException demoException = new DemoException();
		System.out.println("NORMAL VALUE PASSED :" +demoException.returnValue(1));
		System.out.println("EXCEPTION Occured : " + demoException.returnValue(0));

	}
	
	
	public int returnValue(int x) {
		
		try {
			
			int y = 1/x;
			return 1;
			
			
		}
		catch(Exception e) {
			return 2;
		}
		finally {
			return 3;
		}
	}
}
