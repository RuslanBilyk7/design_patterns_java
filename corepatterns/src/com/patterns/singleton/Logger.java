package com.patterns.singleton;

import java.io.Serializable;


public class Logger implements Serializable, Cloneable {

	private static volatile Logger instance;

	private Logger() {
	}

	public static Logger getInstance() {
		if (instance == null) {
			synchronized (DateUtil.class) {
				if (instance == null) {
					instance = new Logger();
				}
			}
		}
		return instance;
	}

	void log(String message) {
		System.out.println(message);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
