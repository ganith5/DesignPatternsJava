package com.patterns.command;

/**
 * Command interface. Executes the action that the invoker initiates
 * The pattern solves the below problems :
 * 1) Coupling the invoker and receiver should be avoided. That is, hard-wired requests should be avoided
 * 2) It should be possible to configure the invoker with a request. Hard-wriring a request with a 
 * invoker at compile time does not allow the flexibility to handle different types of requests.
 * 
 * Applications of command patterns :
 * 1) Thread Pool -  The command objects implement the java.lang.Runnable interface and 
 * are added to the thread pool, where they are executed. Each of these objects might have a 
 * addTask() method where the job is defined
 * 
 * 2) Undo and Redo operations
 * Add the operations performed by the user to a queue and perform 
 * inversive of a command when undo is called
 * @author Pavithra Sachidananda
 *
 */
public interface Command {
	
	public void execute();

}
