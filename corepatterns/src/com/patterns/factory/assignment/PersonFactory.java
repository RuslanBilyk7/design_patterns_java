package com.patterns.factory.assignment;

public class PersonFactory {

	private PersonFactory() {
	}

	public static Person selectPerson(String type) {
		Person person = null;

		if (type.equals("male")) {
			person = new Male();
		}
		else if (type.equals("female")) {
			person = new Female();

		}
		return person;
	}
}
