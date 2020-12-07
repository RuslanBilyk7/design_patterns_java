package com.patterns.adapter.assignment;

public class PaymentApp {

	void pay(double rupees) {
		PaymentAdapter paymentAdapter = new PaymentAdapter();
		paymentAdapter.pay(rupees);
	}

	public static void main(String[] args) {
		PaymentApp paymentApp = new PaymentApp();
		paymentApp.pay(200);
	}
}
