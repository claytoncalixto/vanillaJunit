package tests.factory;

import entities.Financing;

public class FinancingFactory {
	
	public static Financing createInvalidFinancing(double totalAmount, double income, int months) {
		return new Financing(100000.0, 2000.0, 20);
	}
	
	public static Financing createValidFinancing(double totalAmount, double income, int months) {
		return new Financing(100000.0, 2000.0, 80);
	}


}
