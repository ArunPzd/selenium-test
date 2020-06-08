package Practice.Practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.practice.objects.ObjLogin;
import com.practice.utilities.Utilities;

public class Login extends Utilities {
	
	
	
	@Test
	
	public void login() throws IOException
	{
		driver=initialDriver();
		driver.get(url());
		ObjLogin log=new ObjLogin(driver);
		log.signIn().click();
		log.username().sendKeys("Arun");
		log.password().sendKeys("Arun");
		log.login().click();
		
	}
	
	
	@AfterMethod
	
	public void screenShot(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			screenShot();
		}
	}
	
	

}
