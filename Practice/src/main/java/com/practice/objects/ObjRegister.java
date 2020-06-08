package com.practice.objects;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjRegister {
	
	WebDriver driver;
	
	By fname=By.name("firstname");
	By lname=By.name("lastname");
	By sex=By.xpath(".//input[@name='sex']");
	By exp=By.xpath(".//input[contains(@id,'exp')]");
	By date=By.id("datepicker");
	By pro=By.xpath(".//input[]@name='profession'");
	By upload=By.id("photo");
	By continents = By.id("continents");
	By commands=By.id("selenium_commands");
	
	public ObjRegister(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement firstName()
	{
		return driver.findElement(fname);
	}
	public WebElement lastName()
	{
		return driver.findElement(lname);
	}
	public ArrayList<WebElement> sex()
	{
		return (ArrayList<WebElement>) driver.findElement(sex);
	}
	public WebElement upload()
	{
		return driver.findElement(upload);
	}
	public ArrayList<WebElement> experience()
	{
		return (ArrayList<WebElement>) driver.findElements(exp);
	}
	public WebElement date()
	{
		return driver.findElement(date);
	}
	public LinkedList<WebElement> profession()
	{
		return (LinkedList<WebElement>) driver.findElements(pro);
	}
	public WebElement continents()
	{
		return driver.findElement(continents);
	}
	public WebElement commands()
	{
		return driver.findElement(commands);
	}

}
