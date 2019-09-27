import static org.junit.Assert.*;

import org.junit.Test;

public class HWtest
{

	@Test
	public void test1()
	{
		
		assertEquals("Die.testStatic()", Die.testStatic());
		Die test1 = new Die();
	}

    @Test
   
    public void test2()
{
	        assertEquals("CrookedDie1.testStatic()", CrookedDie1.testStatic());
		Die test2 = new CrookedDie1();
}

}
