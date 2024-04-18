package com.example.CoverMate;

public class TermInsurance implements Insurance {
	boolean isMarried;
	boolean hasChildren;
	boolean isSalaried;
	double insurance=5000;
	
	@Override
	public double getInsurancePremium() {
		// TODO Auto-generated method stub
		return insurance;

	}

	@Override
	public void setInsuranceDetails(boolean isMarried, boolean hasChildren, boolean isSalaried) {
		// TODO Auto-generated method stub
		double s=0;
		if(isSalaried) {
			s=s+1.5;
		}
		if(isMarried) {
			s=s+1.5;
		}
		if(hasChildren) {
			s=s+2;
		}
		
		insurance=s*insurance+insurance;

	}

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Term";

	}

}
