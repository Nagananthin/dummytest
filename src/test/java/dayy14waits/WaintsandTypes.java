package dayy14waits;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaintsandTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
		  
			
			WebDriver wd=new ChromeDriver();
			//  launch website
			wd.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			String title= wd.getTitle();
			System.out.println(title);
			
	// waits 
			
			// 1.implicit --> act as thread.sleep. it is for page 10 sec it will wait for 10 sec
			// 2. explicit -- > it will used for web element
			//declaring implicit
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//declaring explicit
			WebDriverWait wait=new WebDriverWait(wd, Duration.ofSeconds(30));
			
			
			// Actions is a inbuild class
			
			Actions a=new Actions(wd);
			WebElement rclk=wd.findElement(By.xpath("//span[text()='right click me']"));
			System.out.println(rclk.getText());
					
			rclk.click();
			
			//using explicit wait
			
			wait.until(ExpectedConditions.visibilityOf(rclk));
			
			a.contextClick(rclk).build().perform();
			
			List<WebElement> l=wd.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
	         // using findelements becz edit,cut,copy all are coming under webelemts.
	      // to print the each text
	         for(WebElement e:l) {
	        System.out.println(e.getText());
	        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	        
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
	         wait.until(ExpectedConditions.alertIsPresent());
	         System.out.println(wd.switchTo().alert().getText());

	         wd.switchTo().alert().accept();
	         //getting alert option which located
	       // System.out.println(wd.switchTo().alert().getText()); 
		
			
			
	}

}
