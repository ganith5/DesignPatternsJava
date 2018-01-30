package com.patterns.command;

public class Check implements Command{
	
	private Cook cook;
	
	private int tableNumber;
	
	public Check(final Cook cook) {
		this.cook = cook;
	}
	
	public void setTableNumber(int number) {
		this.tableNumber = number;
	}
	
	public int getTableNumber() {
		return tableNumber;
	}
	
	@Override
	public void execute() {
		
		cook.cook();
	}

}
