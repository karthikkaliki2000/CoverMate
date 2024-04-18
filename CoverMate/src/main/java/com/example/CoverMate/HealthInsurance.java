package com.example.CoverMate;

public class HealthInsurance implements Insurance {
	boolean isSmoker;
	boolean isDrinker;
	boolean previousConditions;
	double insurance=10000;
	@Override
	public double getInsurancePremium() {
		// TODO Auto-generated method stub
		return insurance;
	}

	@Override
	public void setInsuranceDetails(boolean isSmoker, boolean isDrinker, boolean previousConditions) {
		// TODO Auto-generated method stub
		double s=0;
		if(isSmoker) {
			s=s+1.5;
		}
		if(isDrinker) {
			s=s+1.5;
		}
		if(previousConditions) {
			s=s+2;
		}
		insurance=insurance*s+insurance;
	}

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Health";

	}

}
