package ArrayTest;

import java.util.Arrays;

class Student implements Comparable {
	private String name;
	private double gpa;
	
	public Student(String n, double g) {
		name = n;
		gpa = g;
	}
	
	public String getName() {return name;}
	public double getGpa() {return gpa;}
	public int compareTo(Object obj) {
		Student other = (Student) obj;
		return this.name.compareTo(other.name);
	}
}

public class Test {

	public static void main(String[] args) {

		Student[] students = new Student[3];
		students[0] = new Student("Hong", 3.39);
		students[1] = new Student("Lim", 4.21);
		students[2] = new Student("Hwang", 2.19);
		
		Arrays.sort(students);
		for (Student s : students) {
			System.out.println("Name = " + s.getName() + "Gpa = " + s.getGpa());
		}

	}

}
