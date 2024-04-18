package com.example.CoverMate;

public class Customer {
	String name;
	Integer age;
	Insurance insurance;
	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	public void setDetails(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void insurancePremium() {
		System.out.println("Hi, "+this.name+" You have a "+this.insurance.getInsuranceName()+" insurance premium of "+this.insurance.getInsurancePremium());
	}
	
}
