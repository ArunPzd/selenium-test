package com.practice.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjLogin {
	
	WebDriver driver;
	
	By account=By.id("account");
	By user=By.xpath(".//input[@id='log']");
	By pass=By.xpath(".//input[@id='pwd']");
	By login=By .xpath(".//input[@id='login']");
	
	public ObjLogin(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement signIn()
	{
		return driver.findElement(account);
	}
	public WebElement username()
	{
		return driver.findElement(user);
	}
	public WebElement password()
	{
		return driver.findElement(pass);
	}
	public WebElement login()
	{
		return driver.findElement(login);
	}

}
