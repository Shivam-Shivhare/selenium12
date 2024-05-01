package Demo3456;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Demo3456.AddListeners1.class)

public class Lisners123 {
	@Test
	void Success()
	{
		System.out.println("pre.SuccessfullyExecute");
	}

}
