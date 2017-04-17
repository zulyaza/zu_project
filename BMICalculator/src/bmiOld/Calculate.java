package bmiOld;

public class Calculate {
	
	public double GetBMI(double weight, double growth){
		double bmi = weight/(growth*growth);
		return bmi;
	}
	
	public double IdealWeight(double growth, String sex){
		double ideal = 0;

		if (sex.equals("woman"))
				ideal = (growth * 100 - 110) * 1.15;
		
		if (sex.equals("man"))
			ideal = (growth * 100 - 100) * 1.15;
				
		return ideal;
	}
	
	

}
