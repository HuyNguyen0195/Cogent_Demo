package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> students= new ArrayList<>();
		students.add(new Student(111, "david", "nguyen"));
		students.add(new Student(12, "robert", "lee"));
		students.add(new Student(13, "john", "downey"));
		students.add(new Student(14, "philip", "nguyen"));
		Collections.sort(students);
		System.out.println(students);
	}
}
