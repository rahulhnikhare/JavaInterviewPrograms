package java8Feature.collection.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class SortListOfStringAlphabetically {

	public static void main(String[] args) {
		List <String> cities = Arrays.asList("Milam", "london", "India","Switzerland","germany","Russia");
		System.out.println("LIST::"+ cities);
		
		// Sort case Sensitive
		cities.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println("CASE_INSENSITIVE_ORDER::"+ cities);
		
		cities.sort(Comparator.naturalOrder());
		System.out.println("naturalOrder::"+ cities);


		cities.sort(Comparator.reverseOrder());
		System.out.println("reverseOrder::"+ cities);


	}

}
