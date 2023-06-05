package dayy14frameworktestng;

import org.testng.annotations.*;
public class Testngclass {

	
	// help->eclipse market place->search testng and install
	// add dependency in pom .xml
	@Test(priority = 2)
	
		public void firsttestng()
		{
			System.out.println("First Code in TestNg");
		}
	@Test(priority = 1)
	public void Secondtestng()
	{
		System.out.println("Second Code in TestNg");
	}
	}
	

