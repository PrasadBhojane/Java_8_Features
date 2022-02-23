package com.java8learning.example;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee1 {
	String name;
	int salary;
	
	Employee1 (String name, int salary){
		this.name=name;
		this.salary=salary;
	}
}
public class LearnPredicateI2{
	public static void main(String[]args) {
		ArrayList<Employee1> l = new ArrayList<Employee1>();
		l.add(new Employee1("Durga", 1000));
		l.add(new Employee1("Vishal", 2000));
		l.add(new Employee1("Sagar", 3000));
		l.add(new Employee1("Vijay", 4000));
		l.add(new Employee1("Yatish", 5000));
		l.add(new Employee1("Rohan", 6000));
		
		Predicate<Employee1> p = e -> e.salary>3000;
		for(Employee1 e1:l) {
			if(p.test(e1)) {
				System.out.println(e1.name+":"+e1.salary);
			}
		}
		System.out.println("Employees listed above have salary more than 3000.");
	}
}

//durga vid no.6
