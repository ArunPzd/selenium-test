package Practice.Practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.practice.objects.ObjRegister;
import com.practice.utilities.Utilities;

public class Register extends Utilities {
	
	@Test
	public void register() throws IOException
	{
		
		WebDriver driver=initialDriver();
		driver.get(url());
		System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("practicing Selenium Automation"));
		
		ObjRegister reg=new ObjRegister(driver);
		reg.firstName().sendKeys("");
		
		
	}

}
