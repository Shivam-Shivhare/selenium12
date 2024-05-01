package Demo34;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Groupsadd123 {
	@Test(groups = "java")
	void o1()
	{
		System.out.println("op");
	}
	@Test(groups = "c++")
	void o2()
	{
		System.out.println("op1");
	}
	@Test(groups = "c")
	void o3()
	{
		System.out.println("op2");
	}
	@Test(groups = "python")
	void o4()
	{
		System.out.println("op3");
	}
	@Test(groups = "php")
	void o5() {
		Assert.assertTrue(false);
	}

}
