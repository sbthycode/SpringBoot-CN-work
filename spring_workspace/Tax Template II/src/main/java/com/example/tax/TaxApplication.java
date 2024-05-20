package com.example.tax;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class TaxApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Tax Payment Application");
		while (true) {
			System.out.println("Please select which tax you want to pay: \n1. Income \n2. Property\n3. Exit");
			int userChoice = scanner.nextInt();
			String taxChoice = "";
			switch (userChoice) {
				case 1 -> {
					// Set the taxChoice string as the Income tax bean id.
				}
				case 2 -> {
					// Set the taxChoice string as the Property tax bean id.
				}
				case 3 -> {
					// Print the message "Exiting..." and return.
				}
				default -> {
					// Print the message "Invalid choice" and return.
				}
			}
			// Pick the tax bean using context.getBean() method using taxChoice string.
			Tax tax = ;
			System.out.println(tax.getTaxType());
		}
	}

}
