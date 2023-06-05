package dayy12webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
	  
		
		WebDriver wd=new ChromeDriver();
		//  launch website
		wd.get("https://www.toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");
		String title= wd.getTitle();
		System.out.println(title);
		
		// this table has 3 rows(one headerrow,two data rows) 3 coulms and 6 table datas
		WebElement table=wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/table"));
		List<WebElement> tableheaderrow=wd.findElements(By.xpath("/html/body/div[1]/div/div/div[2]/main/table/thead/tr"));
		System.out.println(" Header row size " + tableheaderrow.size());
		List<WebElement> tablerow=wd.findElements(By.xpath("/html/body/div[1]/div/div/div[2]/main/table/tbody/tr"));
		System.out.println(" Table row size " + tablerow.size());
		List<WebElement> tablerowdata=wd.findElements(By.xpath("/html/body/div[1]/div/div/div[2]/main/table/tbody/tr/td"));
		System.out.println(" Table row  data size " + tablerowdata.size());
		List<WebElement> tablecolumn=wd.findElements(By.xpath("/html/body/div[1]/div/div/div[2]/main/table/thead/tr/th"));
		System.out.println(" Table Coulmn size " + tablecolumn.size());
		System.out.println("********** Getting HEader Names **********");
            for( WebElement e:tablecolumn) {
            	System.out.println(e.getText()); // it will get header name
            }
            System.out.println("*************************************");
		// need to take row datas with column header
             for(int i=1;i<=tablecolumn.size();i++) {
         WebElement tableheaderdataiteration=wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/table/thead/tr/th["+i+"]"));
         System.out.println("The headername " +tableheaderdataiteration.getText());
        	WebElement tablerowiteration=wd.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/table/tbody/tr/td["+i+"]"));
              	System.out.println("The rowdata  " +tablerowiteration.getText());
            	 
             
             
	}}

}
