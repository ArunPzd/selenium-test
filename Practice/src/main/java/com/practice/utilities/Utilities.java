package com.practice.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utilities {
	public WebDriver driver;
	Properties prop=new Properties();
	

	public WebDriver initialDriver() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Arun Prasad\\eclipse-workspace\\Practice\\src\\main\\java\\com\\practice\\utilities\\config.properties");
		prop.load(fis);
		String browsern=prop.getProperty("browser");
		if(browsern.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", prop.getProperty("cpath"));
			driver=new ChromeDriver();
		}
		else if(browsern.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", prop.getProperty("fpath"));
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid browser name");
		}
		return driver;
	}
	public String url()
	{
		return prop.getProperty("url");
	}
	public void screenShot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:/Selenium/SelScreen/error.png"+ ""));
		
	}
	
	

}
