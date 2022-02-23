package com.java8learning.example;

import java.util.function.Consumer;

class Movie {
	String name;

	Movie(String name) {
		this.name = name;
	}
}

public class LearnConsumerI {

	public static void main(String[] args) {
		Consumer<Movie> c1 = m -> System.out.println(m.name + " ready to release");
		Consumer<Movie> c2 = m -> System.out.println(m.name + " released but flopped");
		Consumer<Movie> c3 = m -> System.out.println(m.name + " storing information in database");
		Consumer<Movie> cc=c1.andThen(c2).andThen(c3); // andThen() method is available in the Function interface also.

		Movie m = new Movie("Spider");
		//c1.accept(m);
		cc.accept(m);
	}

}
