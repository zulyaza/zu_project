package bmiOld;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.*;

public class CalculateTest1 {
	private Calculate calc;
	
	@Before
    public void initTest() {
		calc = new Calculate();
    }
 
    @After
    public void afterTest() {
        calc = null;
    }
    
    @Test
    public void testGetBMI() throws Exception {
    	assertEquals(19.921, calc.GetBMI(51,1.60),0.001);

    }
    
    @Test
    public void IdealWeight() throws Exception{
    	assertEquals(57.499, calc.IdealWeight(1.60,"woman"),0.001);
    }

}
