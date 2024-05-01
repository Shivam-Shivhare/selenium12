package Demo3456;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	@DataProvider(name="datatoday23")
	public Integer[] Datatody()
	{
		Integer[]a=new Integer[3];
		a[0]=8;
		a[1]=9;
		a[2]=4;
		return a;
		
	}
	@Test(dataProvider="datatoday23")
	void java(int a)
	{
		System.out.println(a);
	}

}
