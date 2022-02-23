package com.java8learning.example;

import java.util.function.Function;

class LearnFunctionI2 {

	public static void main(String[] args) {
		
//		Function<Input, Return>
		Function<Integer, Integer> f1 = i -> 2 * i;
		Function<Integer, Integer> f2 = i -> i * i * i;
		
		System.out.println(f1.andThen(f2).apply(3)); //first f1 will be applied and then f2.
		
		System.out.println(f1.compose(f2).apply(3)); //first f2 will be applied and then f1.
	}
}
/*
 * you can also take--
 * f1.andThen(f2).andThen(f3).apply(i) ____i = any integer
 * durga vid no.7
 */