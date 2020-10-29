package com.nek.gigr;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {
	double outputUSD;

	public double calOutPutAmt(double inputAmt) {

		outputUSD = inputAmt * 1.368;
		return outputUSD;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Currency Converter");
		CurrencyConverter cc = new CurrencyConverter();
		double inputSGD, outputUSD;
		Scanner in = new Scanner(System.in);

		System.out.println("hi, Please enter the amount in SGD to be converted to USD!");
		boolean isinputNUM = in.hasNextDouble();
		if (isinputNUM) {
			inputSGD = in.nextDouble();
			outputUSD = cc.calOutPutAmt(inputSGD);
			System.out.println("SGD " + inputSGD + " = USD " + outputUSD);
		} else {
			System.out.println("Wrong Entry, Sorry!");
		}
	}
}
