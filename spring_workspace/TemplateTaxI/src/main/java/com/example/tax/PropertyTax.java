package com.example.tax;

public class PropertyTax implements Tax {
    /*
    1. Create the following attributes.
        a. taxableAmount (double)
        b. taxAmount (double)
        c. isTaxPayed (boolean)
    2. Make this class an implementation of Tax interface and override the interface methods.
    3. Using constructor initialize the isTaxPayed boolean false.
     */
	double taxableAmount = 0.0;
	double taxAmount = 0.0;
	boolean isTaxPayed = false;
	
	public PropertyTax(){
		this.isTaxPayed = false;
		
	}
	
	@Override
	public void setTaxableAmount(int amount) {
		taxableAmount = amount;
	}
	
	@Override
	public void calculateTaxAmount() {
		taxAmount = taxableAmount * 0.05;

	}
	
	@Override
	public double getTaxAmount() {
		return taxAmount;
	}
	
	@Override
	public String getTaxType() {
		return "property";
	}
	
	@Override
	public boolean isTaxPayed() {
		return isTaxPayed;
	}
	
	@Override
	public void payTax() {
		System.out.println("Tax is payed");
		isTaxPayed = true;
	}
}
