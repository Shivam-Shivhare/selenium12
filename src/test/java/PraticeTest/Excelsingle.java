package PraticeTest;

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

public class Excelsingle {

	public WebDriver driver;
	@BeforeMethod
	void m23()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();	
	}
	@Test(dataProvider = "data1")
	void a1(String s1)
	{
		WebElement e1=driver.findElement(By.id("APjFqb"));
		e1.sendKeys(s1);
		e1.sendKeys(Keys.ENTER);
	}
	@DataProvider(name = "data1")
	public Object[] getdata() throws Exception
	{
		//String file="C:\\Users\\admin\\OneDrive\\Documents\\pratice.xlsx";
		Object a[]=new Object[2];
		a[0]="java";
		a[1]="flipkart";
		return a;
	}
	public Object[]  getExcelData(String file,String Sheetno) throws Exception
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
			for(int j=0;j<col;j++)
			{
				s1[i]=ws.getRow(i).getCell(j).toString();
			}
		}
		return s1;
	}
	}
	
	
	
	


