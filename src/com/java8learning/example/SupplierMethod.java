package com.java8learning.example;

import java.util.function.Supplier;

public class SupplierMethod {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp = otp + (int) (Math.random() * 10); //typecasting math.random to int type.
			}
			return otp;
		};
		System.out.println(s.get());
	}
}
//supplier interface
//durga vid no.8