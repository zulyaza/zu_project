package main;

import java.util.Scanner;


public class Main {
	
	public static double GetBMI(){
		Calculate calculate = new Calculate();
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ��� ��� � ��");
		double weight = scan.nextDouble();
		
		System.out.println("������� ��� ���� � ��");
		double growth = scan.nextDouble();
		
		double iw = calculate.IdealWeight(growth);
		System.out.println("��� ��������� ��� = " + iw);

		
		double bmi = calculate.CalculateBMI(weight,growth);
		System.out.println("��� ��� = " + bmi);
		return bmi;
	}

	public static void main(String[] args) {

		Recommendation recommend = new Recommendation();
		String rec = recommend.Recommend(GetBMI());
		System.out.println(rec);

	}

}
