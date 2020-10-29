package com.nek.gigr;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCurrencyConvertJUnit {

	@Test
	public void test() {
		CurrencyConverter myCurConvtr = new CurrencyConverter();
		
		double result =  myCurConvtr.calOutPutAmt(100);
		assertEquals("136.8", result);
		fail("Not yet implemented");
	}

}
