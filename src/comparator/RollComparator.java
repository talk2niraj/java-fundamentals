package comparator;

import java.util.Comparator;

public class RollComparator implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		return a.getRollno() - b.getRollno();
	}
}