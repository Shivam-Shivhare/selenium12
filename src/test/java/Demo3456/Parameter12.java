package Demo3456;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class Parameter12 {
	@Test
	@org.testng.annotations.Parameters({"i","j"})
	void java(int a,int b)
	{
		System.out.println(a+b);
	}

}
