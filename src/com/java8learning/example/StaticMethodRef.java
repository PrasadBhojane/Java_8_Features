package com.java8learning.example;

public class StaticMethodRef {
	//static method
	public static void m1() {
		for (int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args) {
		Runnable r = StaticMethodRef::m1; //double colon'::' operator // method m1() reference for STATIC method.
		Thread t = new Thread(r);
		t.start();
		for (int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}
//method ref and constructor ref are alternative to lambda expressions.
//durga vid no.10.