package com.patterns.factory.assignment;

public class PersonChoosing {

	public Person selectGuy(String sex) {
		Person p = PersonFactory.selectPerson(sex);
		p.wish("car");
		return p;
	}
}
