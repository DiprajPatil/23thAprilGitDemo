package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.AdvanceLoginPage;
import page.DashBoardPage;


public class BaseTest {
	
	public static WebDriver driver;
	
	public AdvanceLoginPage lpa;
	public DashBoardPage db;

	@BeforeSuite
	public void browserRun()
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
	
		options.addArguments("--start-maximized");
	
//		options.addArguments("--incognito");
		
//		options.addArguments("--headless");
		
		driver = new ChromeDriver(options);
				
		driver.get("https://kite.zerodha.com/");
		
	}
	
	@BeforeClass
	public void createObject()
	{
		lpa = new AdvanceLoginPage(driver);
		db = new DashBoardPage(driver);
	}

}
