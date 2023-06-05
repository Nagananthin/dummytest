package day2examplelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationlocatorsidandname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
	  
		
		WebDriver wd=new ChromeDriver();
		//  launch website
		wd.get("https://www.saucedemo.com/");
		// everythg said to be as web element
		// anythg can be accessible in webpage are said to be as webelement
		
		// for locating webelemnt press f12 / rightclick inspect
		// code will get highlight 
		wd.manage().window().getSize();
		String title= wd.getTitle();
		System.out.println(title);
		
		//locators - which will help to identify the web elments
		
		// ID,NAME,CLASS,LiNKTEXT,PARTIAL LINK TEXT,CSS SELETOR,XPATH,
		
		// here vaiable name and value said o be as attribute name and attribute value
		
		//how to create webelememt
		
		WebElement uname=wd.findElement(By.id("user-name")); // this user name took from inspect id/name
		WebElement pwd =wd.findElement(By.name("password"));
		WebElement login=wd.findElement(By.name("login-button"));
		// send keys is a method availble in webelemnt
		//sendkeys() is a method in Selenium that allows QAs to type content automatically into an editable field while executing any tests for forms. 
		//These fields are web elements that can be identified using locators like element id, name, class name, etc.
		uname.sendKeys("standard_user");
		pwd.sendKeys("secret_sauce");
		login.click();
		
		
		
	}

}
