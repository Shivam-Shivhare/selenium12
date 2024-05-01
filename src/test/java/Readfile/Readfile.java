package Readfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.bouncycastle.crypto.RuntimeCryptoException;

public class Readfile {

	Properties pro;
	String path="C:\\Users\\admin\\eclipse-workspace\\newPro\\src\\test\\java\\Readfile\\Data.properties";
	public Readfile() throws IOException
	{
		pro=new Properties();
		FileInputStream fn= new FileInputStream(path);
		pro.load(fn);
	}
	public String getUrl()
	{
		String s1=pro.getProperty("url");
		if(s1!=null)
		{
			return s1;
		}
		else
		{
			throw new RuntimeCryptoException("url not found");
		}
	}
	public String getUsername()
	{
		String s1=pro.getProperty("username");
		if(s1!=null)
		{
			return s1;
		}
		else
		{
			throw new RuntimeCryptoException("username not found");
		}
	}
	public String getPassword()
	{
		String s1=pro.getProperty("password");
		if(s1!=null)
		{
			return s1;
		}
		else
		{
			throw new RuntimeCryptoException("password not found");
		}
	}
	
}



	
	
	

