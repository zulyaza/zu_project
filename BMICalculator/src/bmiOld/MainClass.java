package bmiOld;

import java.util.Scanner;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������� ��� ��� � ��");
		double weight = scan.nextDouble();
		
		System.out.println("������� ��� ���� � �");
		double growth = scan.nextDouble();
		
		System.out.println("������� ��� ���: man ��� woman");
		String sex = scan.next();
		
		
		Man man = new Man(weight,growth, sex);
		System.out.println("��� ������� ��� = " + man.weight);
		
		Calculate calc = new Calculate();
		double bmi = calc.GetBMI(man.weight, man.growth);
		System.out.println("��� ��� = " + bmi);
		
		Recommendation rec = new Recommendation();
		String res = rec.GetResult(bmi, man.sex);
		System.out.println(res);
		
		double ideal = calc.IdealWeight(man.growth, man.sex);
		System.out.println("��� ��������� ��� = " + ideal);
		
		rec.Reccomendation(res);
		
		scan.close();

	}

}
