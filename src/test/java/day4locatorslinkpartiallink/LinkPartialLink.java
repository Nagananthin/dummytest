package day4locatorslinkpartiallink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPartialLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
	  
		
		WebDriver wd=new ChromeDriver();
		//  launch website
		wd.get("https://www.saucedemo.com/");
		String title= wd.getTitle();
		System.out.println(title);
        String logintitle = wd.getCurrentUrl();
		
		System.out.println(logintitle);

		WebElement uname=wd.findElement(By.id("user-name")); // this user name took from inspect id/name
		WebElement pwd =wd.findElement(By.name("password"));
		WebElement login=wd.findElement(By.name("login-button"));
		uname.sendKeys("standard_user");
		pwd.sendKeys("secret_sauce");
		login.click();
		 // this is link text
		// Link Text  -   in //a href tag name u can find ur text in between
				// > symbo and < symbol 
				
		// Partial Link Text  -  half of ur link text 
		WebElement twit =wd.findElement(By.linkText("Twitter"));
		twit.click();
		 // this is partial link test
		// exactly we have to give half of link text name.else throw error
		// tried //WebElement twitt =wd.findElement(By.partialLinkText("twitr"));
		WebElement twitt =wd.findElement(By.partialLinkText("Twitt"));
		twitt.click();

		if(title.equals(logintitle))

		{
			
			System.out.println("Failed to logged in");
			
		}
		else
			{
			System.out.println("successfully logged in");

			}
			
		}
	}


