package com.java8learning.example;

import java.util.function.Predicate;

public class LearnPredicateJoinI3 {

	public static void main(String[]args) {
		int[] x = {0,5,10,15,20,25,30,35};
		Predicate<Integer> p1 = i-> i%2==0;
		Predicate<Integer> p2 = i-> i>10;
		//and(), or(), negate()
		System.out.println("The number which are even & greater than 10 are:");
		for (int x1:x) {
			//if (p1.negate().test(x1)) { //negate() this will print number which are not even
			if (p1.or(p2).test(x1)) {  //and(), or()
				System.out.println(x1);
			}
		}
	}
}
//Predicate joining
//Predicate method contains test() method.
//durga vid no.6
