package com.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
	
	private List<Command> checks;
	
	
	public Waiter() {
		this.checks = new ArrayList<Command>();
	}
	
	public void takeOrder(Command check) {
		this.checks.add(check);
		check.execute();
	}

}
