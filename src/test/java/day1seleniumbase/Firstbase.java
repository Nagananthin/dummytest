package day1seleniumbase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Firstbase {
	
	public static void main(String args[])
	
	// setting system properties for chrome browser ..this crome driver is in the location
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
	  // webdriver is a interface
	// creating refernce for chromedriver
		WebDriver wd=new ChromeDriver();  // chrome is a default browser
		// to launch webdriver using below method
		wd.get("https://www.google.com/");
		wd.manage().window().maximize();
		wd.manage().window().minimize();
	//	wd.getTitle();
		wd.manage().window().fullscreen();
	//	wd.close();  // close current tab
	//	wd.quit();  // close entire screen /all tabs
		String title= wd.getTitle();
		System.out.println(title);
		
	
	}
	

}
