package com.java8learning.example;

import java.util.function.Function;

public class LearnFunctionI {

	public static void main(String[]args) {
		Function<String, String>f=s->s.toUpperCase();
		System.out.println(f.apply("prasad bhojane"));
	}
}
//function interface contain apply() method.
//durga vid no.7