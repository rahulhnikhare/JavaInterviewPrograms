package java8Feature.foreach.example;

import java.util.HashMap;
import java.util.Map;

public class ForEachDemo {
	public static void main(String[] args) {
	
	
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));		
		
	//Normal way to loop a Map.
		/*for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}*/
		
	// In Java 8, you can loop a Map with forEach + lambda expression
		
		
		
	}

}
