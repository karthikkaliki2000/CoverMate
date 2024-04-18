package com.example.CoverMate;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CoverMateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoverMateApplication.class, args);
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("Welcome to Insurance Application");
		System.out.println("What is your name?");
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		System.out.println("What is your age?");
		int age=s.nextInt();
		Customer c=null;
		System.out.println("Which Insurance do you want?");
		System.out.println("Select 1 or 2 from below options");
		System.out.println("1-Health Insurance");
		System.out.println("2-Term Insurance");
		int ichoice=s.nextInt();
		String ins=null;
		switch(ichoice) {
		case 1:ins="Health";
		System.out.println("Are you a Drinker? Y or N");
		boolean drinker=s.next().charAt(0)=='Y'?true:false;
		System.out.println("Are you a Smoker? Y or N");
		boolean smoker=s.next().charAt(0)=='Y'?true:false;
		System.out.println("Do you have any prior health conditions? Y or N");
		boolean conditions=s.next().charAt(0)=='Y'?true:false;
	    c=(Customer)context.getBean("customerHealth");
	    c.insurance.setInsuranceDetails(drinker, smoker, conditions);
	    c.setDetails(name, age);
	    c.insurancePremium();
		break;
		case 2:ins="Term";
		System.out.println("Are you a Married? Y or N");
		boolean married=s.next().charAt(0)=='Y'?true:false;
		System.out.println("Are you a Salaried? Y or N");
		boolean salaried=s.next().charAt(0)=='Y'?true:false;
		System.out.println("Do you have childrens? Y or N");
		boolean children=s.next().charAt(0)=='Y'?true:false;
		c=(Customer)context.getBean("customerTerm");
		c.insurance.setInsuranceDetails(married, salaried, children);
		c.setDetails(name, age);
		 c.insurancePremium();
		break;
		default: System.out.println("Exiting...");
		System.exit(0);
		}
	}

}
