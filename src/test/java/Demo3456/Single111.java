package Demo3456;

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

public class Single111 {
	public WebDriver driver;
	@BeforeMethod
	void Browser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	@Test(dataProvider = "dataExcel")
	void hello(String s1,String s2)
	{
		WebElement q1=driver.findElement(By.id("APjFqb"));
		q1.sendKeys(s1+s2);
		q1.sendKeys(Keys.ENTER);
	}
	@DataProvider(name="dataExcel")
	public Object[][]searchData() throws Exception
	{
		
	
	String filename="C:\\Users\\admin\\OneDrive\\Documents\\Datapro1.xlsx";
	Object s[][] = getExceldata(filename,"Sheet1");
	return s;
	}
	 
	
	public String[][]getExceldata(String filename,String sheetno) throws IOException
	{
		String [][]data=null;
		FileInputStream fn=new FileInputStream(filename);
		XSSFWorkbook wb=new XSSFWorkbook(fn);
		XSSFSheet ws=wb.getSheet(sheetno);
		int row=ws.getLastRowNum()+1;
		int col=ws.getRow(0).getLastCellNum();
		data=new String[row-1][col];
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				data[i-1][j]=ws.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
	

}