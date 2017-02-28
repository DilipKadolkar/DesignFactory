package com.training;

public class Complex {
	private static Complex cl=new Complex();
	
	private Complex(){
		System.out.println("Default constructor called");
	}

	public static Complex getInstance(){
		if (cl==null)
		 cl=new Complex();
		return cl;
	}
	public void showDetails(){
		System.out.println("Show details is called");
	}
}
