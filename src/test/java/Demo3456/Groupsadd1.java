package Demo3456;

import org.testng.annotations.Test;

public class Groupsadd1  {
	@Test(priority = 1)
	void m1()
	{
		System.out.println("m1");
	}
	@Test(priority =2)
	void m2()
	{
		System.out.println("m2");
	}
	@Test
	void m3()
	{
		System.out.println("m3");
	}
	
	

}
