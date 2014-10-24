package com.example.ps;

import junit.framework.TestCase;

public class CalcUT extends TestCase {
	private int a,y=0;
	private double r;
	
	public void test(){
		CalcEngine list = new CalcEngine(10000, 7, 2.4);
		double futurval = list.getFv();
		if(futurval<=10000)
		assertFalse(true);
		
		
	}

	

	
	
}
