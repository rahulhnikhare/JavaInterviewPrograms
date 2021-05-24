package java8Feature.predicate;

import java.util.function.Predicate;

public class UserPredicate {

	public static Predicate<User> getMatchedFirstNameList(String requestString) {
		 return p->
		 p.getFirst_name().equalsIgnoreCase(requestString);
		
	}
}
