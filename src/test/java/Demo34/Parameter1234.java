package Demo34;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1234 {
	@Test
	@Parameters({"o","p"})
	void sel(int a,int b)
	{
		System.out.println(a+b);
	}

}
