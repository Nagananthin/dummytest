package day78locatorxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
	  
		
		WebDriver wd=new ChromeDriver();
		//  launch website
		wd.get("https://www.saucedemo.com/");
		String title= wd.getTitle();
		System.out.println(title);
		// xpath example
		
		// xpath  is locator and availabl in byclass
		// some of the webpage need not have id,name,css.cant write testcase, those time going wit Xpath.

		// absolute  == starts from root --rightclick -> copy->full xpath-- /html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div
		
	    // drawback - if any new chage / webelemt added in dom structure it will get distbed. it will not work
		
		
		WebElement uname=wd.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")); //abs just example took from username

		// relative == customized.start from // it will directly search a  particular webelemnt.not starting from root.
				// max of time we are using relative xpath only
			    // writing relative xpath
				
				//function in xpath
				//using text()
				// Xpath= //tagname[text()='value']
		
				 //pwd we can use contains
       WebElement pwd=wd.findElement(By.xpath("//input[contains(@type,'password')]"));

		// if text not there can go with contains
		//  Using Contains@
		
		//  //Tagname[CONTAINS(@ATTRIBUTE, 'VALUES')]
       //Xpath=//tagname[@attribute='value']



		 WebElement login=wd.findElement(By.xpath("//input[contains(@name,'login-button')]"));
	
	        uname.sendKeys("standard_user");
	        pwd.sendKeys("secret_sauce");
	        login.click();
	        
			WebElement txt=  wd.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")); // it will retirve the text
			System.out.println(txt.getText());
			System.out.println(txt.getSize());
			
			WebElement adtocart=  wd.findElement(By.xpath("//button[contains(@name,'add-to-cart-sauce-labs-backpack')]")); // it will retirve the text
			adtocart.click();
			WebElement container=  wd.findElement(By.xpath("//div[contains(@id,'shopping_cart_container')]")); // it will retirve the text
			container.click();
			WebElement chkout=  wd.findElement(By.xpath("//button[contains(@id,'checkout')]")); // it will retirve the text
			chkout.click();

			
		//WebElement fname=wd.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input")); //abs just example took from username
		    WebElement fname=wd.findElement(By.xpath("//input[@placeholder='First Name']"));
			WebElement lname=wd.findElement(By.xpath("//input[@name='lastName']"));
		    WebElement pcode=wd.findElement(By.xpath("//input[contains(@name,'postalCode')]"));
			 WebElement cont=wd.findElement(By.xpath("//input[contains(@name,'continue')]"));
			// WebElement cancel=wd.findElement(By.xpath("//input[contains(@name,'login-button')]"));

			 fname.sendKeys("Nanthini");
		    lname.sendKeys("GK");
		     pcode.sendKeys("625009");
		    cont.click();

		    
			
//			WebElement xpath=wd.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select")); //abs just example 
//			System.out.println(xpath.getLocation());
//			System.out.println(xpath.getTagName());

	}
}