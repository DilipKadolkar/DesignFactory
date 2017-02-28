package com.training;

import com.training.interfaces.Bank;

public class Test {

	public static void main(String[] args) {

		Bank hdfc =new HDFC();
		System.out.println(hdfc.getBankName());
		Bank axis =new AXIS();
		System.out.println(axis.getBankName());
		
//		Complex cl1 = Complex.getInstance();
//		cl1.showDetails();
//		Complex cl2 = Complex.getInstance();
//		cl2.showDetails();
//
//		if (cl1 == cl2) {
//			System.out.println("Both instances are same");
//		}
	}
}
