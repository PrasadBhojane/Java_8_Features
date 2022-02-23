package com.java8learning.example;

import java.sql.Date;
import java.util.function.Supplier;

public class TemplateDate {

	public static void main(String[] args) {
		Supplier<Date> s = () -> new Date(0);//check why it is require to pass int type argument 0
		System.out.println(s.get());
	}
}
//durga vid no.8