package Demo3456;

import org.testng.annotations.Test;

public class Group1231 {
	@Test(groups = "java")
	void m1()
	{
		System.out.println("m6");
	}
	@Test(groups = "c++")
	void m2()
	{
		System.out.println("m4");
	}
	@Test(groups = "c")
	void m3()
	{
		System.out.println("m5");
	}

}
