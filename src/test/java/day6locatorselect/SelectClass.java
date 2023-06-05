package day6locatorselect;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   // handle this dropdown webelment going to use select class
		
		// this is only for dropdown.so only coming under webelsemt not webelements
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
	  
		
		WebDriver wd=new ChromeDriver();
		//  launch website
		wd.get("https://www.saucedemo.com/");
		String title= wd.getTitle();
		System.out.println(title);
		//selectclass - which is used only for handling dropdown webelement
		
		WebElement uname=wd.findElement(By.cssSelector("input[placeholder='Username']"));
		 //here tagname as input.this user name took from inspect placeholder
        WebElement pwd=wd.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
        WebElement login=wd.findElement(By.cssSelector("input[value=\"Login\"]"));
        uname.sendKeys("standard_user");
        pwd.sendKeys("secret_sauce");
        login.click();
        
        // creating dropdown webelemnt
        WebElement dropdown=wd.findElement(By.cssSelector("select[data-test=\"product_sort_container\"]"));
        //using select class
         //https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/Select.html
        Select s=new Select(dropdown);
     //   s.selectByIndex(1); // will select z to a
//        
//        System.out.println(s.getAllSelectedOptions());
//        System.out.println(s.getOptions().get(0));
        
        // using list to print dropsown elemts by suing selct class
        
        //Thread.sleep(5000);
         List<WebElement> a=s.getOptions();
         
         for(WebElement e:a) {
        System.out.println(e.getText());
         Thread.sleep(1000);
        
        System.out.println("****************");
     
        }
     
       
       // have lot of selct methods. mainly using these 3
       
       // if we try to print again will trow  org.openqa.selenium.StaleElementReferenceException
        // at the time any one we can select
       
     s.selectByIndex(0);  // it will select a to z
      // s.selectByValue("lohi");
    //   s.selectByVisibleText("Price (high to low)");
     //  s.deselectByIndex(0);
      //  s.getFirstSelectedOption();
        
       
         
        Thread.sleep(1000);
        System.out.println(s.isMultiple()); // not choosing multiple ..at the time only one option choosed
         
        System.out.println(s.getFirstSelectedOption().getText());
        System.out.println(s.getOptions().get(1).getText());
                 
        System.out.println(s.hashCode());
       // s.deselectByIndex(0); // cant use for dropdown.if we can select one or more option(chekc box) ther can use.
   
	}

}    
