package day3headlessbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Examplebrowser {
	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
		// HeadlessBrowser - Without Browser UI
		// How can we initiate Headless Browser 
	ChromeOptions options = new ChromeOptions();
//	options.setHeadless(true);  // we can use either 12th line or 13th line for setting headless
	options.addArguments("--headless=new");
	//We have to overload  chrome option in chromedriver class

	WebDriver driver = new ChromeDriver(options);
	driver.get("https://selenium.dev");

	String title= driver.getTitle();
	System.out.println(title);
	//driver.quit();
}
}