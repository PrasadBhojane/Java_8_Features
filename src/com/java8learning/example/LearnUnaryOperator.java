package com.java8learning.example;

import java.util.function.IntUnaryOperator;

public class LearnUnaryOperator {

	public static void main(String[] args) {
		IntUnaryOperator f1 = i -> i + 1;
		System.out.println(f1.applyAsInt(4));

		IntUnaryOperator f2 = i -> i * i;
		System.out.println(f2.applyAsInt(4));

		System.out.println(f1.andThen(f2).applyAsInt(5)); //applyAsInt(5)--->f1= 5+1=6--->f2= 6*6=36
	}
}
//durga vid no.9