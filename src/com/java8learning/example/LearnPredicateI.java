package com.java8learning.example;

import java.util.function.Predicate;

public class LearnPredicateI {

	public static void main(String[] args) {
		String[] s = { "Nag", "Chiranjeevi", "Venkatesh", "Arjun", "Vikram", "Ranbir" };
		Predicate<String> p = s1 -> s1.length() % 2 == 0;
		for (String s1 : s) {
			if (p.test(s1)) {
				System.out.println(s1);
			}
		}
	}
}
