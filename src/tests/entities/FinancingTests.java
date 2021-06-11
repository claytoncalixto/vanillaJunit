package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {

	@Test
	public void valueEntryShouldBetterAndEqualTwentyPercentTotalAmount() {
		
		Financing fnc = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 0.20 * 100000.0;
		double result = fnc.entry();
		Assertions.assertEquals(expectedValue, result);
	}

	@Test
	public void valueQuotaShouldBeEightyPercentAboutDifferenceEntryDividedPerNumberMonts() {
		
		Financing fnc = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 1000.0;
		double result = fnc.quote();
		Assertions.assertEquals(expectedValue, result);
	}
	
	@Test
	public void constructorShouldSetValueValidData() {
		
		Financing fnc = new Financing(100000.0, 2000.0, 80);	
		Assertions.assertEquals(100000.0, fnc.getTotalAmount());
		Assertions.assertEquals(2000.0, fnc.getIncome());
		Assertions.assertEquals(80, fnc.getMonths());
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentsExceptionWhenInvalidddData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fnc = new Financing(100000.0, 2000.0, 79);
		});
	}
	

	@Test
	public void setTotalAmountShouldSetValueWhenValidData() {		
			
			Financing fnc = new Financing(100000.0, 2000.0, 80);			
			fnc.setTotalAmount(90000.0);
			Assertions.assertEquals(90000.0, fnc.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentsExceptionWhenInvalidddData()  {		
			
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fnc = new Financing(100000.0, 2000.0, 80);
			fnc.setTotalAmount(110000.0);
		});
	}
	
	@Test
	public void setIncometShouldSetValueWhenValidData() {		
			
			Financing fnc = new Financing(100000.0, 2000.0, 80);			
			fnc.setIncome(3000.0);
			Assertions.assertEquals(3000.0, fnc.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentsExceptionWhenInvalidddData()  {		
			
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fnc = new Financing(100000.0, 2000.0, 80);
			fnc.setIncome(1999.0);
		});
	}
	
	@Test
	public void setMonthstShouldSetValueWhenValidData() {		
			
			Financing fnc = new Financing(100000.0, 2000.0, 80);			
			fnc.setMonths(81);
			Assertions.assertEquals(81, fnc.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentsExceptionWhenInvalidddData()  {		
			
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fnc = new Financing(100000.0, 2000.0, 80);
			fnc.setMonths(79);
		});
	}
}
