package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111, "Jeet", "Kolkata"));
		ar.add(new Student(131, "Amit", "Bangalore"));
		ar.add(new Student(121, "Reena", "Jaipur"));

		System.out.println("Unsorted");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar, new RollComparator());
		System.out.println("\nSorted by rollno");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar, new NameComparator());
		System.out.println("\nSorted by name");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		
	}
}