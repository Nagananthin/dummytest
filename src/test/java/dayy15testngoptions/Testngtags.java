package dayy15testngoptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngtags {

// groping
	
	WebDriver wd=new ChromeDriver();
	WebElement login;
	
	@BeforeTest
	
	public void setproperty()
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
	  
	}
   @BeforeMethod
	public void openbrowser()
	{
	//  launch website
	wd.get("https://www.saucedemo.com/");
	String title= wd.getTitle();
	System.out.println(title);
    String logintitle = wd.getCurrentUrl();
	System.out.println(logintitle);
	}
   
   @Test
	
  	public void getdetail()
  	{
	   wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement uname=wd.findElement(By.id("user-name")); // this user name took from inspect id/name
	WebElement pwd =wd.findElement(By.name("password"));
	login=wd.findElement(By.name("login-button"));
	uname.sendKeys("standard_user");
	pwd.sendKeys("secret_sauce");
		
  	}
   
   @AfterMethod
	
  	public void login()
  	{
	login.click();
	wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
   
   @AfterTest
	
  	public void successlogin()
  	{
	   System.out.println("Successfully loggedin");
	   wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	   
}
   @AfterClass
   
   public void close()
 	{
	   wd.close();
	   System.out.println("Successfully Closed");
	   
	 
	   
}
}