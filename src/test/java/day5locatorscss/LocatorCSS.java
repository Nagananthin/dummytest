package day5locatorscss;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LocatorCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
	  
		
		WebDriver wd=new ChromeDriver();
		//  launch website
		wd.get("https://www.saucedemo.com/");
		String title= wd.getTitle();
		System.out.println(title);
		//The CSS Selector combines an element selector and a selector value that can identify particular elements on a web page
		//CSS selectors can locate web elements without ID, class, or Name
		// creating css sletor
		// tagname[attribute name= attribute value]
		WebElement uname=wd.findElement(By.cssSelector("input[placeholder='Username']"));
				 //here tagname as input.this user name took from inspect placeholder
		WebElement pwd=wd.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
		WebElement login=wd.findElement(By.cssSelector("input[value=\"Login\"]"));
		uname.sendKeys("standard_user");
		pwd.sendKeys("secret_sauce");
		login.click();


	}

}
