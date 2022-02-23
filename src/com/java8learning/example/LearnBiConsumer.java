package com.java8learning.example;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class EmployeeData3{
	String name;
	int salary;
	public EmployeeData3(String name,int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}

public class LearnBiConsumer {

	public static void main(String[] args) {
		ArrayList<EmployeeData3>l=new ArrayList<EmployeeData3>();
		populate(l);
		BiConsumer<EmployeeData3,Integer> c= (e,i)->e.salary=e.salary+i;
		for (EmployeeData3 e:l) {
			c.accept(e,500); //salary increment by 500.
		}
		for (EmployeeData3 e:l) {

			System.out.println("Employee name: "+e.name);
			System.out.println("Employee salary: "+e.salary);
			System.out.println();
		}
	}
	public static void populate(ArrayList<EmployeeData3>l) {
		l.add(new EmployeeData3("Durga", 1000));
		l.add(new EmployeeData3("Vishal", 2000));
		l.add(new EmployeeData3("Daya", 3000));
		l.add(new EmployeeData3("Yatish", 4000));
	}
}
//BiConsumer - perform only operations and doesn't return anything
//durga vid no.8
