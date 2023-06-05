package day78locatorxpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();// maximize the window
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.xpath("//input[contains(@id,'user-name')]"));
		username.sendKeys("problem_user");
		WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		WebElement saucebacklab = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		saucebacklab.click();
		WebElement backtoproducts = driver.findElement(By.xpath("//button[contains(@data-test,'back-to-products')]"));
		backtoproducts.click();
		
		WebElement Addtocart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		Addtocart.click();
		WebElement shoppingbucket = driver.findElement(By.xpath("//a[@class='shopping_cart_link']/child::span"));
		shoppingbucket.click();
		WebElement checkout = driver.findElement(By.xpath("//button[text()='Checkout']"));
		checkout.click();
		
		WebElement fname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		WebElement lnam=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		WebElement	pcode=driver.findElement(By.xpath("//input[contains(@name,'postalCode')]"));

fname.click();
		 fname.sendKeys("Nanthini");;
		 Thread.sleep(5000);
		 lnam.click();
		 lnam.clear();
	     lnam.sendKeys("GK");
	     Thread.sleep(5000);
	     pcode.sendKeys("625009");
	     
//		 WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
//		 Continue.click();
		
		}

}

