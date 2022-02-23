package com.java8learning.example;

import java.util.function.BiPredicate;

public class LearnBiPredicate {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> p= (a,b)->(a+b) %2==0;
		System.out.println(p.test(10, 20));
		System.out.println(p.test(35, 20));
	}
}

//BiPredicate
//durga vid no.8