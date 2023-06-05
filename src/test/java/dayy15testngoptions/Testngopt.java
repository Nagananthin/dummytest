package dayy15testngoptions;


import org.testng.annotations.Test;

public class Testngopt {

	@Test(invocationCount = 5,invocationTimeOut = 1000)// it uses like a for loop
	public void click()
	{
		
		System.out.println("clicked 5 times");
	}
	
}
