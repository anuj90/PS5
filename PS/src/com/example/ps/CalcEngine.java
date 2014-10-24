package com.example.ps;

import android.widget.EditText;
import android.widget.Spinner;

public class CalcEngine {
	private double rate;
	private int years,amount;
	
	public CalcEngine(int a, int y, double r) {
		// TODO Auto-generated constructor stub
	   amount = a;
	    y = years;
	    r = rate;

	}

	public double getFv(){
		double fv = 0;
		int amount =0;
		double rate=0;
		int years =0;
		double final_value = amount * Math.pow((1 + rate), (years * 12));

		return fv;		
	}
	

}
