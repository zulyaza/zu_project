package main;

public class Calculate {
	public double CalculateBMI(double weight, double growth ){
		double bmi = weight/(growth*growth/10000);
		return bmi;
	}
	
	public double IdealWeight(double growth){
		double idealWeight = 22*(growth*growth/10000);
		return idealWeight;
	}

}
