package page;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {
	
	@FindBy(xpath = "//*[@type='button']") WebElement getstarted;
	@FindBy(xpath = "(//*[@icon='search'])[2]") WebElement searchstock;
	@FindBy(xpath = "(//*[@class='eight columns text-right']//*[@type='button'])[1]") WebElement BuyButton;
	@FindBy(xpath = "(//*[@type='submit']") WebElement finalbuy;

	
	WebDriver driver;
	public DashBoardPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void searchShare(String share)
	{
		getstarted.click();
		searchstock.sendKeys(share);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	public void buyShare()
	{	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(BuyButton));
		BuyButton.click();
	}
	public void finalBuy()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(finalbuy));
		finalbuy.click();
	}

}
