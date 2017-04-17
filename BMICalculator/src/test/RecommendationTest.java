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
    	assertEquals("Недовес. Вам надо больше питаться и делать силовые упражнения на массу", s1);
    	
    	String s2 = recommend.Recommend(19);
    	assertEquals("Нормальный вес. Вам можно оставить питание тем же, а также не помешают занятия спортом для поддержания фигуры", s2);
    	
    	String s3 = recommend.Recommend(30);
    	assertEquals("Избыточный вес. Вам следует ограничить себя в питании и больше двигаться,заниматься спротом", s3);
    	
    	String s4 = recommend.Recommend(40);
    	assertEquals("Ожирение. Вам необходимо подобрать диету и делать кардио-упражнения", s4);
    	
    	String s5 = recommend.Recommend(41);
    	assertEquals("Тяжелое ожирение. Необходимо проконсультироваться с врачом и подобрать соответствующую диету и режим тренировок", s5);

    }

}
