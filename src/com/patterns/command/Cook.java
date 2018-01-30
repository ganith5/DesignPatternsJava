package com.patterns.command;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Receives the request and executes the command
 * @author Pavithra Sachidananda
 *
 */
public class Cook {
	
	private final AtomicInteger counter = new AtomicInteger();
	
	public Cook() {
		
	}
	
	public void cook() {
		System.out.println("Prepared the check " + counter.incrementAndGet());
	}

}
