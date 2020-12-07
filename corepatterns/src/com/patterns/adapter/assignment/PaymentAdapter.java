package com.patterns.adapter.assignment;

public class PaymentAdapter {

	void pay(double rupees) {
		double dollars;
		dollars = rupees / 62;
		PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
		paymentProcessor.pay(dollars);
	}
}
