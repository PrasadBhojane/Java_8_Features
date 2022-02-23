package com.java8learning.example;

import java.util.ArrayList;
import java.util.Collections;

class Employee {

	String name;
	int eno;
	public Employee(String name, int eno) {
		super();
		this.name = name;
		this.eno = eno;
	}
	public String toString() {
		return eno+":"+name;
	}	
}

public class EmployeeData{
	public static void main(String[]args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Durga", 12548));
		l.add(new Employee("Vijay", 12354));
		l.add(new Employee("Yatish", 25484));
		l.add(new Employee("Daya", 57896));
		l.add(new Employee("Mustafa", 41256));
		l.add(new Employee("Vishal", 78452));
		System.out.println(l);
		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(l);
	}
}

//Durga vid no.4 on java 8 features
