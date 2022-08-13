package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvanceLoginPage {
	
	@FindBy(xpath = "//*[@id='userid']") WebElement username;
	@FindBy(xpath = "//*[@id='password']") WebElement password;
	@FindBy(xpath = "//*[@type='submit']") WebElement loginbutton;
	@FindBy(xpath = "//*[@id='pin']") WebElement enterpin;
	

	WebDriver driver;
	
	public AdvanceLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginFunctionality(String uname,String pswd)
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		username.sendKeys(uname);
		password.sendKeys(pswd);
		loginbutton.click();
	}
	
	public void pin(String Epin)
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		enterpin.sendKeys(Epin);
		loginbutton.click();
		
	}
	

}
