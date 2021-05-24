package java8Feature.collection.groupby;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class GroupByExample {
	
	// Logger logger = new com.sun.javafx.logging.Logger()

	private List<Student> studentClasses;
	@Before
	public void setUp() {

	    studentClasses = new ArrayList<>();

	    studentClasses.add(new Student("Kumar", 101, "Intro to Web"));
	    studentClasses.add(new Student("White", 102, "Advanced Java"));
	    studentClasses.add(new Student("Kumar", 101, "Intro to Cobol"));
	    studentClasses.add(new Student("Sargent", 101, "Intro to Web"));
	    studentClasses.add(new Student("Sargent", 102, "Advanced Web"));

	}
	
	@Test
	public void group_by_teacher_name() {

	    Map<String, List<Student>> groupByTeachers = studentClasses
	            .stream().collect(
	                    Collectors.groupingBy(Student::getTeacher));

System.out.println(groupByTeachers);
	    assertEquals(1, groupByTeachers.get("White").size());
	}

/*	@Test
	public void group_by_Level(){

		Map<Double,List<Student>> groupByLevel =
				studentClasses.stream()
				.collect(
						Collectors.groupingBy(Student::getLevel));
		System.out.println(groupByLevel);
		assertEquals(2, groupByLevel.get(102).size());
	}*/

}
