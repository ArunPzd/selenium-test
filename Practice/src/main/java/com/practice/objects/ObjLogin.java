package com.practice.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjLogin {
	
	WebDriver driver;
	
	By btnLogin=By.id("login");
	By txtUser=By.id("userName");
	By txtPass=By.id("password");
	By btnLogin2=By.id("login");
	
	public ObjLogin(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement signIn()
	{
		return driver.findElement(btnLogin);
	}
	public WebElement username()
	{
		return driver.findElement(txtUser);
	}
	public WebElement password()
	{
		return driver.findElement(txtPass);
	}
	public WebElement login()
	{
		return driver.findElement(btnLogin2);
	}

}
