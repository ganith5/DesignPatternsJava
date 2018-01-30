package com.patterns.command;

/**
 * Implementation of the command interface.
 * The class holds reference to the "command receiver" or the class that
 * actually performs the job
 * @author Pavithra Sachidananda
 *
 */

public class Check implements Command{
	
	private Cook cook;
	
	
	public Check(final Cook cook) {
		this.cook = cook;
	}
	
	
	@Override
	public void execute() {
		
		cook.cook();
	}

}
