package driverfactorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverfactory {

	
	
	
	static  WebDriver driver;

	public WebDriver initBrowsers(String browsername)
	{
		if(browsername.contains("chrome"))
		{
			 driver = new ChromeDriver();

		}
		else if (browsername.equals("firefox"))
		{
			 driver = new FirefoxDriver();
		}


		return driver;


	}

	public static WebDriver getDriver()
	{
		return driver;
	}

}
