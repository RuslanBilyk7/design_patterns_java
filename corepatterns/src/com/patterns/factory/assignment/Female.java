package com.patterns.factory.assignment;

public class Female implements Person{

	@Override
	public void wish(final String wish) {
		System.out.println("I wish a female"+wish);
	}
}
