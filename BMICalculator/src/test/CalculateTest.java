package test;

import static org.junit.Assert.*;
import org.junit.Test;
import main.Calculate;
import main.Recommendation;


public class CalculateTest {
	Calculate calculate = new Calculate();
	Recommendation recommendation = new Recommendation();
	
	@Test
    public void CalculateBMITest() throws Exception {
    	assertEquals(19.531, calculate.CalculateBMI(50,160),0.001);

    }
	
	
	@Test
	public void IdealWeight(){
		assertEquals(56.32, calculate.IdealWeight(160),0.001);
	}

}
