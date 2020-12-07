package com.patterns.adapter.assignment;

import static java.lang.Math.round;


public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public void pay(final double dollars) {
		System.out.println("payment was successful " + String.format("%.2f", dollars));
	}
}
