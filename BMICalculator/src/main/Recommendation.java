package main;

public class Recommendation {
	
	public String Recommend(double bmi){
		
		if(bmi<19)
			return "�������. ��� ���� ������ �������� � ������ ������� ���������� �� �����";
		if(19 <= bmi & bmi <= 25)
			return "���������� ���. ��� ����� �������� ������� ��� ��, � ����� �� �������� ������� ������� ��� ����������� ������";
		if(25 < bmi & bmi <= 30)
			return "���������� ���. ��� ������� ���������� ���� � ������� � ������ ���������,���������� �������";
		if(30 < bmi & bmi <= 40)
			return "��������. ��� ���������� ��������� ����� � ������ ������-����������";
		if(40 < bmi)
			return "������� ��������. ���������� �������������������� � ������ � ��������� ��������������� ����� � ����� ����������";
		else 
			return null;
				
	}
	
	

}
