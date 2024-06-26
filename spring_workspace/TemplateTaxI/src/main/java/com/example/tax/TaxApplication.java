package com.example.tax;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.shruhridBanthia.testingSpringdemo.Table;

@SpringBootApplication
public class TaxApplication {

	public static void main(String[] args) {
		// Take ClassPathXmlApplicationContext from applicationContext.xml file
		System.out.println("Enter the tax regime:");
		Scanner scanner = new Scanner(System.in);
		String regime = scanner.nextLine();
		System.out.println("Enter the amount:");
		Scanner scan = new Scanner(System.in);
		String amt = scan.nextLine();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Tax incomeTax = (Tax) context.getBean("incomeTax");
		Tax propertyTax = (Tax) context.getBean("propertyTax");
		int amount=Integer.parseInt(amt);  
		if(regime.equals("Income")) {
			incomeTax.setTaxableAmount(amount);
			incomeTax.calculateTaxAmount();
			System.out.println("Tax deduction amount:");
			System.out.println(incomeTax.getTaxAmount());
			incomeTax.payTax();
		}
		else {
			propertyTax.setTaxableAmount(amount);
			propertyTax.calculateTaxAmount();
			System.out.println("Tax deduction amount:");
			System.out.println(propertyTax.getTaxAmount());
			propertyTax.payTax();
		}
	}

}
