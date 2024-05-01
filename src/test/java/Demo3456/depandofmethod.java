package Demo3456;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class depandofmethod {
	@Test(dependsOnMethods= {"python"})
	void java()
	{
		System.out.println("java1");
	}
	@Test
	void selenium()
	{
		System.out.println("seleniun1");
	}
	@Test
	void automation()
	{
		System.out.println("automation1");
	}
	@Test
	void python()
	{
		Assert.assertTrue(false);
	}
	
		@Test
		void ruby()
		{
			System.out.println("ruby1");
	}
	

}
