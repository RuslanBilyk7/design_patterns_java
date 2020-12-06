package com.bharath.patterns.singleton;

public class LoggetTest {

	public static void main(String[] args) {

		Logger logger = Logger.getInstance();
		logger.log("Message");
	}
}
