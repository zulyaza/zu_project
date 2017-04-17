package test;


import org.junit.*;
import static org.junit.Assert.*;
import main.Calculate;
import main.Recommendation;
import main.Main;

import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

public class RecommendationTest {
	Recommendation recommend = new Recommendation();
	
	@Test
    public void ReccomendTest() throws Exception {
		String s1 = recommend.Recommend(18);
    	assertEquals("�������. ��� ���� ������ �������� � ������ ������� ���������� �� �����", s1);
    	
    	String s2 = recommend.Recommend(19);
    	assertEquals("���������� ���. ��� ����� �������� ������� ��� ��, � ����� �� �������� ������� ������� ��� ����������� ������", s2);
    	
    	String s3 = recommend.Recommend(30);
    	assertEquals("���������� ���. ��� ������� ���������� ���� � ������� � ������ ���������,���������� �������", s3);
    	
    	String s4 = recommend.Recommend(40);
    	assertEquals("��������. ��� ���������� ��������� ����� � ������ ������-����������", s4);
    	
    	String s5 = recommend.Recommend(41);
    	assertEquals("������� ��������. ���������� �������������������� � ������ � ��������� ��������������� ����� � ����� ����������", s5);

    }

}
