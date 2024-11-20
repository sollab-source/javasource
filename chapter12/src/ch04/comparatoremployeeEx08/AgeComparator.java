package ch04.comparatoremployeeEx08;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return Integer.compare(e1.age(), e2.age());
	}
}