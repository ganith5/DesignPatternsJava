package com.patterns.command;

public class Customer {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		Cook cook = new Cook();
		Command vegCheck = new Check(cook);
		Command pastaCheck = new Check(cook);
		waiter.takeOrder(vegCheck);
		waiter.takeOrder(pastaCheck);
	}

}
