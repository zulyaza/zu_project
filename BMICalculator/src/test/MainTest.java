package test;

import static org.junit.Assert.*;
import main.Calculate;
import java.util.Scanner;


import org.junit.Test;

public class MainTest {
	Calculate calculate = new Calculate();
	
	@Test
    public void GetBMITest() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ��� ��� � ��");
		double weight = scan.nextDouble();
		System.out.println("������� ��� ���� � ��");
		double growth = scan.nextDouble();
		System.out.println("��� ��� = " + calculate.CalculateBMI(weight,growth));
    	assertEquals(19.531, calculate.CalculateBMI(weight,growth),0.001);

    }

}
