package com.practice.exceptions;

public class Amount {

	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;

	}

	public void add(Amount that) {

		if (!this.currency.equalsIgnoreCase(that.currency)) {
			throw new CurrenciesDoNoMatchException("Currencies do not match..");
		}

		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return "Amount [currency=" + currency + ", amount=" + amount + "]";
	}

}
