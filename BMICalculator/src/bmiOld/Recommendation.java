package bmiOld;

public class Recommendation {
	
	public  String  GetResult(double bmi, String sex) {
		String res = "";
		
		if((bmi<19 & sex.equals("woman") )|| (bmi<20 & sex.equals("man")))
			res= "�������";
		
		if((19 <= bmi & bmi <= 24 & sex.equals("woman")) || (20 <= bmi & bmi <= 25 & sex.equals("man")))
			res= "���������� ���";
		
		if((25 <= bmi & bmi <= 30 & sex.equals("woman")) || (26 <= bmi & bmi <= 30 & sex.equals("man")))
			res= "���������� ���";
		
		if(31 <= bmi & bmi <= 40 )
			res= "��������";
		
		if(40 <= bmi )
			res= "������� ��������";

		
		return res;
	}
	
	public void Reccomendation(String res){
		switch(res){
		case "�������":
			System.out.println("��� ���� ������ �������� � ������ ������� ���������� �� �����");
			break;
			
		case "���������� ���":
			System.out.println("��� ����� �������� ������� ��� ��, � ��� �� �� �������� ������� ������� ��� ����������� ������");
			break;
			
		case "���������� ���":
			System.out.println("��� ������� ���������� ���� � ������� � ������ ���������,���������� �������");
			break;
			
		case "��������":
			System.out.println("��� ���������� ��������� ����� � ������ ������-����������");
			break;
			
		case "������� ��������":
			System.out.println("���������� �������������������� � ������ � ��������� ��������������� ����� � ����� ����������");
			break;		
		}
	} 
	

}
