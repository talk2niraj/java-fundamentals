package comparator;

import java.util.ArrayList;

public class ComparatorLambdaTest {
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111, "Jeet", "Kolkata"));
		ar.add(new Student(131, "Amit", "Bangalore"));
		ar.add(new Student(121, "Reena", "Jaipur"));

		System.out.println("Unsorted");
		ar.forEach(e->System.out.println(e));

		ar.sort((Student s1, Student s2)->(s1.getRollno() - s2.getRollno()));
		System.out.println("\nSorted by rollno");
		ar.forEach(e->System.out.println(e));

		ar.sort((Student s1, Student s2)->(s1.getName().compareTo(s2.getName())));
		System.out.println("\nSorted by name");
		ar.forEach(e->System.out.println(e));
	}
}