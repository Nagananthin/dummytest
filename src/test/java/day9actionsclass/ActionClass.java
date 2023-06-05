package day9actionsclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
	  
		
		WebDriver wd=new ChromeDriver();
		//  launch website
		wd.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		String title= wd.getTitle();
		System.out.println(title);
		
		// Actions is a inbuild class
		
		Actions a=new Actions(wd);
		WebElement rclk=wd.findElement(By.xpath("//span[text()='right click me']"));
		System.out.println(rclk.getText());
		rclk.click();
//		Double clik -- > to perform double click of the web element				
//		Context Click --> to perform right click of the web element				
//		click and hold --> to perform action of the web element without using mouse				
//		click -- > to perform the current mouse location		
		
		a.contextClick(rclk).build().perform();
		
		// whenever do some action need to perform build() and perform () methods
		//her using class locator and using the way to find the list of elemts(li/span)
      List<WebElement> l=wd.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
         // using findelements becz edit,cut,copy all are coming under webelemts.
      // to print the each text
         for(WebElement e:l) {
        System.out.println(e.getText());
         Thread.sleep(1000);
        
        System.out.println("****************");
         
		
//need o validate anyone of webelement use condition
         
         //if(e.getText().equals("Cut"))
        	 // it will print till cut
        	 if(e.getText().equals("Delete"))
         {
        	 e.click();
        	 break; // break will use for throw popup else popup will getclosed
         }
         }
          //to click alert options
         //switch to used to chage the locator alert
         System.out.println(wd.switchTo().alert().getText());

         wd.switchTo().alert().accept();
         //getting alert option which located
       // System.out.println(wd.switchTo().alert().getText()); 


	}
}


