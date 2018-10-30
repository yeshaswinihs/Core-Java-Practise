package com.practice.exceptions;

public class ThrowingExceptionRunner {

	public static void main(String[] args) {
		Amount dollar = new Amount("USD", 10);
		Amount euro = new Amount("EUR", 20);
		try {
			dollar.add(euro);
		} catch (CurrenciesDoNoMatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(dollar);
	}
}

class CurrenciesDoNoMatchException extends Exception {

	public CurrenciesDoNoMatchException(String msg) {
		super(msg);
	}

}
