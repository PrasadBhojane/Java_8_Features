package com.java8learning.example;

import java.util.ArrayList;
import java.util.function.BiFunction;

class EmployeeData1 {
	int eno;
	String name;

	public EmployeeData1(int eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}
}

public class LearnBiFunctionI {

	public static void main(String[] args) {
		ArrayList<EmployeeData1> l = new ArrayList<EmployeeData1>();
//		BiFunction<Input1, Input2, Return>
		BiFunction<Integer, String, EmployeeData1> f = (eno, name) -> new EmployeeData1(eno, name);
		l.add(f.apply(100, "Durga"));
		l.add(f.apply(200, "Prasad"));
		l.add(f.apply(300, "Amir"));
		l.add(f.apply(400, "Vishan"));
		
		for(EmployeeData1 e:l) {
			System.out.println("Employee number : "+e.eno);
			System.out.println("Employee name : "+e.name);
			System.out.println();
		}
	}
}

//BiFunction
//durga vid no.8
