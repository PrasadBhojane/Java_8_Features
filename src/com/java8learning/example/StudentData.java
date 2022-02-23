package com.java8learning.example;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}

public class StudentData {
	public static void main(String[] args) {
		Function<Student, String> f = s -> {
			int marks = s.marks;
			String grade = "";
			if (marks >= 80)
				grade = "A[Distinction]";
			else if (marks >= 60)
				grade = "B[First Class]";
			else if (marks >= 50)
				grade = "B[First Class]";
			else if (marks >= 35)
				grade = "B[First Class]";
			else
				grade = "E[Failed]";
			return grade;
		};
		Predicate<Student> p = s -> s.marks >= 60;
		
		Consumer<Student> c=s1->{
			System.out.println("Student name: " + s1.name);
			System.out.println("Student marks: " + s1.marks);
			System.out.println("Student grade: " + f.apply(s1)); //function interface contain apply() method
			System.out.println();
		};

		Student[] s = { new Student("Durga", 100), new Student("Pushpa", 65), new Student("Deva", 55),
				new Student("Daitya", 45), new Student("Danav", 25), };
		
		for (Student s1 : s) {
			
			if (p.test(s1)) { //predicate interface test() method.
				c.accept(s1); //consumer interface accept() method.				
			}
		}

	}
}


//Predicate+Consumer+
//durga vid no.7