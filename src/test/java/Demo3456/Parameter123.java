package Demo3456;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter123 {
	@Test
	@Parameters({"x","y"})
	void python(int a,int b)
	{
		System.out.println(a+b);
	}

}
