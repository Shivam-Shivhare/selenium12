package Demo34;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Singlearraydata {
	public static WebDriver driver=null;
	@BeforeMethod
	void browser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "DataPro")
	void m1(String s1)
	{
		WebElement e1=driver.findElement(By.id("APjFqb"));
		e1.sendKeys(s1);
		e1.sendKeys(Keys.ENTER);
	}
	@DataProvider(name="DataPro")
	public Object[]getData() throws IOException
	{
		String filename="C:\\Users\\admin\\OneDrive\\Documents\\pratice.xlsx";
		Object a[]=getExcelData(filename,"Sheet1");
		return a;
		
	}
	public Object[]getExcelData(String filename,String Sheetname) throws IOException
	{
		Object s1[]=null;
		FileInputStream fn=new FileInputStream(filename);
		XSSFWorkbook wb=new XSSFWorkbook(fn);
		XSSFSheet ws=wb.getSheetAt(0);
		int row=ws.getLastRowNum()+1;
		int col=ws.getRow(0).getLastCellNum();
		s1=new Object[row];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				s1[i]=ws.getRow(i).getCell(j).toString();
			}
		}
		return s1;
	}

}
