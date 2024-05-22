package com.example.Cinemaxify;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CinemaxifyApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Cinemaxify Application");
		while (true) {
			System.out.println("Please select the member you want the plan for:");
			System.out.println("1. Self\n2. Spouse");
			String userType = "";
			int userChoice = scanner.nextInt();
			scanner.nextLine();
			switch (userChoice) {
				case 1 -> userType = "self";
				case 2 -> userType = "spouse";
				case 3 -> {
					System.out.println("Exiting...");
					return;
				}
				default -> {
					System.out.println("Invalid choice.");
					return;
				}
			}

			/**
			     a. Print the below message into console:

			    	Please select your plan:
			    	1. Normal
			    	2. Premium

			 **/
			System.out.println("Please select your plan:");
			System.out.println("1. Normal\n2. Premium");
			int planChoice = scanner.nextInt();
			scanner.nextLine();
			String myPlan = "";
			switch (planChoice) {
				case 1 -> {
					myPlan = "Normal";
					// b. Set myPlan according to the planChoice.
				}
				case 2 ->{
					myPlan = "Premium";
					// c. Set myPlan according to the planChoice.
				}
				default -> {
					// d. Print "invalid choice" and return.
					System.out.println("invalid choice");
					return;
				}
			}
		/**  e. Pick the user bean using context.getBean() and use 'userType' + 'planChoice'
		        in combination to call the required bean.                                 **/

			User user = (User) context.getBean(userType+myPlan);
			System.out.println("Please enter your name:");
			String name = scanner.nextLine();
			System.out.println("Please enter your age:");
			int age = scanner.nextInt();
			System.out.println("Please enter your contact:");
			Long contact = scanner.nextLong();
			System.out.println(" ");
			scanner.nextLine();
			System.out.println("Please enter your address:");
			String address = scanner.nextLine();
			
			
			user.setUserDetails(name,age,contact,address);
			user.getUserDetails();
			System.out.println("You have selected a "+user.getUserPlan().getPlanName()+"plan for "+userType);
			
			System.out.println("Do you want to purchase plan for someone else?");
			System.out.println("1. Yes\n2. No");
			
		

			/**

			 f. Input details for selected user

			 g. Take input for User details i.e. name , age, address etc.

			 h. Set the above fetched details into the user by using appropriate method.

			 i. Lastly print the following message into console

			     Do you want to purchase plan for someone else
			     1. Yes
			     2. No

			**/

			int input = scanner.nextInt();
			if (input == 2) break;
		}

	}

}
