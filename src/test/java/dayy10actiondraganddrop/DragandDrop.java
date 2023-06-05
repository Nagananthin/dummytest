package dayy10actiondraganddrop;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
					
		        System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
			  
				
				WebDriver wd=new ChromeDriver();
				//  launch website
				wd.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				String title= wd.getTitle();
				System.out.println(title);
				
				// Actions is a inbuild class
				
				Actions a=new Actions(wd);
				 List<WebElement> drag=wd.findElements(By.xpath("/html/body/div[3]/div[2]/div/div"));
				 List<WebElement> drop=wd.findElements(By.xpath("/html/body/div[3]/div[3]/div"));

			
		      // to print the each text
		         for(WebElement e:drag) {
		        System.out.println(e.getText());
		         
				
		//need o validate anyone of webelement use condition
		         
		         if(e.getText().equals("Rome"))
		         {
		        	 for(WebElement r:drop) {
		        	 if(r.getText().equals("Italy"))
		         {
                         a.dragAndDrop(e, r).build().perform();
		        		 break; // break will use for throw popup else popup will getclosed
		         }
		         }}
		         if(e.getText().equals("Washington"))
		         {
		        	 for(WebElement r:drop) {
		        	 if(r.getText().equals("United States"))
		         {
                         a.dragAndDrop(e, r).build().perform();
		        		 break; // break will use for throw popup else popup will getclosed
		         }
		         }}
	}

	}}
