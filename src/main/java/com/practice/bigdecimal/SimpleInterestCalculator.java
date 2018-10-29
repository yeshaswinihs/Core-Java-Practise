package com.practice.bigdecimal;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	private BigDecimal principle;
	private BigDecimal interestRate;

	public SimpleInterestCalculator(String principle, String interestRate) {
		this.interestRate = new BigDecimal(interestRate);
		this.principle = new BigDecimal(principle);
	}

	public BigDecimal calculateTotalValue(int years) {
		return principle.multiply(new BigDecimal(years)).multiply(interestRate).divide(new BigDecimal("100"));
	}

}
