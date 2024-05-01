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

public class Single1 {
	WebDriver driver;
	@BeforeMethod
	void browser() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "data11")
	void m1(String s1)
	{
		WebElement e1=driver.findElement(By.id("APjFqb"));
		e1.sendKeys(s1);
		e1.sendKeys(Keys.ENTER);
	}
	@DataProvider(name="data11")
	public Object[]getdata() throws IOException
	{
		String file="C:\\Users\\admin\\OneDrive\\Documents\\Datapro1.xlsx";
		Object []a=getExcelData(file,"sheet");
		return a;
	}
	public Object[]getExcelData(String file,String sheet) throws IOException
	{
		Object s1[]=null;
		FileInputStream fn=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fn);
		XSSFSheet ws=wb.getSheetAt(0);
		int row=ws.getLastRowNum()+1;
		int col=ws.getRow(0).getLastCellNum();
		s1=new Object[row];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				s1[i]=ws.getRow(i).getCell(j).toString();
			}
		}
		return s1;
		
	}

}
