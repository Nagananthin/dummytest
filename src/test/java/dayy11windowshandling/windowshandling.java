package dayy11windowshandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {

	public static void main(String[] args) throws InterruptedException {
		
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
        login.click();
		/*
		 * without windows handling
		 * 
		 * WebElement twit =wd.findElement(By.linkText("Twitter")); twit.click();
		 * 
		 * WebElement face =wd.findElement(By.partialLinkText("Face")); face.click();
		 * 
		 *  wd.close(); // swag labs will get close but tab would be on open only
		 */
	/*
	 * Steps to execute: Get the handle of the parent window using the command:
	 * String parentWindowHandle = driver.getWindowHandle(); Print the window handle
	 * of the parent window. Find the element on the web page using an ID which is
	 * an element locator. Open multiple child windows. Iterate through child
	 * windows.
	 */
		//        // windows hanlding -- handling the web pages / new tab /tabs which is opened by the browser

		String parentwindow = wd.getWindowHandle(); // get the parent window swag labs
		
		
//		getWindowHandle() – for retrieving the window id of the currently focused window.
//		getWindowHandles() – for retrieving the window ids of multiple opened windows.
//		switchTo() – helps us in switching.
		
		// getting all wondows 
		 WebElement twit =wd.findElement(By.linkText("Twitter"));
		 twit.click();
		  
		 WebElement face =wd.findElement(By.partialLinkText("Face"));
		 face.click();
		 
//		 WebElement link =wd.findElement(By.partialLinkText("Link"));
//		 link.click();
		Set<String>  allwindow =wd.getWindowHandles(); // set wont allow duplicates and cant get index from set
		
		// getting index for the windows need to use list
		
		
		List<String> childwindow= new ArrayList<String>(allwindow);
		for(String e:childwindow) {
			System.out.println(e);
		}
		System.out.println("**********************");
		String curwindow = childwindow.get(2); //wokrs like FILO (stack firstinlastout)
		System.out.println(childwindow.get(0));
		System.out.println(childwindow.get(1));
		System.out.println(childwindow.get(2));
		
		System.out.println("**********************");
		System.out.println("current window:" +childwindow.indexOf(curwindow));
		System.out.println("parent window:"+childwindow.indexOf(parentwindow));
		Thread.sleep(5000);
		wd.switchTo().window(curwindow);
		
       Thread.sleep(5000);
		wd.close();
		wd.switchTo().window(parentwindow);
	//	wd.close();
		
}
}