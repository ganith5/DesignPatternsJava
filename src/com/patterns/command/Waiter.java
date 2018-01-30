package com.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker of the request.
 * Initiates the execute() on the command object
 * @author Pavithra Sachidananda
 *
 */
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
