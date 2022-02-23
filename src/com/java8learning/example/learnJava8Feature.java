package com.java8learning.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class MyComparator implements Comparator<Integer>{
//	
//	public int compare (Integer I1, Integer I2) {
//		
//		return (I1<I2)?-1:(I1>I2)?+1:0; // java 8 feature 
//		
//		if(I1<I2) {
//			return -1;
//		}
//		else if (I1>I2) {
//			return +1;
//		}
//		else {
//			return 0;
//		}
//	}
//}

public class learnJava8Feature {

	public static void main(String[]args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(90);
		l.add(60);
		System.out.println(l);
		
		Comparator<Integer> c= (I1,I2)->(I1<I2)?+1:(I1>I2)?-1:0; // java 8 feature 
		
		Collections.sort(l,c);
		System.out.println(l);
	}
}
