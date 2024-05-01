package Demo3456;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2d {
	@DataProvider(name="datatoday")
	public Integer[][] datatody()
	{
		Integer [][]a=new Integer[2][2];
		a[0][0]=22;
		a[0][1]=12;
		a[1][0]=2;
		a[1][1]=11;
		return a;
		
	}
	@Test(dataProvider="datatoday")
	void java(int a,int b)
	{
		System.out.println(a+b);
	}

}
