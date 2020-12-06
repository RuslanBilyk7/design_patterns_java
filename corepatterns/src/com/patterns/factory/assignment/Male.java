package com.patterns.factory.assignment;

public class Male implements Person {

	@Override
	public void wish(final String wish) {
		System.out.println("I wish a male " + wish);
	}
}
