package executions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import driverfactorys.driverfactory;
//import driverconfig.DriverFactory;
//import driverfactorys.driverfactory;
import io.cucumber.java.After;
//import execution.After;
import io.cucumber.java.Before;




public class apphooks {
	//jojoWebDriver driver;
	driverfactory df;
	WebDriver driver;

	@Before
	public void launchBrowser() throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		
		Thread.sleep(3000);

		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\amaz.properties";
		
		System.out.println(path);

		FileInputStream fis = new FileInputStream(path);

		prop.load(fis);

		String browsername = prop.getProperty("browser");

		 df = new driverfactory();

      driver = df.initBrowsers(browsername);
	driver.manage().window().maximize();
	}


	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
