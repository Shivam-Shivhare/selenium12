package Demo3456;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Optional123 {
	@Test
	@org.testng.annotations.Parameters({"q","p"})
	void java(@Optional("4")int a,int b)
	{
		System.out.println(a+b);
	}

}
