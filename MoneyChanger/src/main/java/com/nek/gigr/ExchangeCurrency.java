package com.nek.gigr;

import java.math.BigDecimal;

public class ExchangeCurrency extends Currency {

	BigDecimal exchangeRate = new BigDecimal(0);
	BigDecimal exchangedAmount = new BigDecimal(0);
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public BigDecimal getExchangeRate(Currency targetCurrency) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal getExchangedAmount(Currency targetCurrency) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
