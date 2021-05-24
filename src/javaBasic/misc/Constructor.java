package javaBasic.misc;

public class Constructor {

	static String str;
	
	public void Constructor() {
		System.out.println("HELLO");
		str= "Hellowrolf";
	}
	public static void main(String[] args) {
		Constructor c = new Constructor();
		System.out.println(str);
	}
}
