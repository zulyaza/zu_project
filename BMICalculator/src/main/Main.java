package main;

import java.util.Scanner;


public class Main {
	
	public static double GetBMI(){
		Calculate calculate = new Calculate();
		Scanner scan = new Scanner(System.in);
		System.out.println("Âגוהטעו גאר גוס ג ךד");
		double weight = scan.nextDouble();
		
		System.out.println("Âגוהטעו גאר נמסע ג סל");
		double growth = scan.nextDouble();
		
		double iw = calculate.IdealWeight(growth);
		System.out.println("Âאר טהואכüםûי גוס = " + iw);

		
		double bmi = calculate.CalculateBMI(weight,growth);
		System.out.println("Âאר ÈÌÒ = " + bmi);
		return bmi;
	}

	public static void main(String[] args) {

		Recommendation recommend = new Recommendation();
		String rec = recommend.Recommend(GetBMI());
		System.out.println(rec);

	}

}
