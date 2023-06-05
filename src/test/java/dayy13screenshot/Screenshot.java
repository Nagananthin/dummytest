package dayy13screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
	  
		
		WebDriver wd=new ChromeDriver();
		//  launch website
		wd.get("https://www.saucedemo.com/");
		String title= wd.getTitle();
		System.out.println(title);
		
		
		WebElement uname=wd.findElement(By.cssSelector("input[placeholder='Username']"));
		 //here tagname as input.this user name took from inspect placeholder
        WebElement pwd=wd.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
        WebElement login=wd.findElement(By.cssSelector("input[value=\"Login\"]"));
        uname.sendKeys("standard_user");
        pwd.sendKeys("secret_sauce");
        TakesScreenshot ts=(TakesScreenshot)wd;
        File source1=ts.getScreenshotAs(OutputType.FILE)	;
        login.click();
        
        // screenshot is the biggest evidence for testers to send their bug/error to the developrs
        
        //how to take
        //TakesScreenshot is a interface
       
        //which have to take -->source where have to save--> destination
        
        File source=ts.getScreenshotAs(OutputType.FILE)	;
        File destination=new File("C:\\Users\\krish\\eclipse-workspace\\Selenium\\target\\ss.png");
        try {
			FileHandler.copy(source1, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        		}

}
