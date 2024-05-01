package PraticeTest;

import PageObjectModel.LoginClass;

public class Test33 {
	public void openbrowser()
	{
		driver.get(url);
		lgg.info("this is a url");
		LoginClass lc=new LoginClass(driver);
		lc.userr("student");
		lgg.info("this is a username");
		lc.pass("Password123");
		lgg.info("this ia a paaword");
		lc.submit();
		lgg.info("click on submit button");
		
	}
	C:\Users\admin\eclipse-workspace\seleniumframework

}
