package utility;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {
	
	static TakesScreenshot ts;
	public static String capture(WebDriver driver,String capturename) throws IOException
	{
		 ts = (TakesScreenshot)driver;
		
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 
		 String path ="C:\\Users\\DIPRAJ\\eclipse-workspace\\BankingProjectZerodhaApp\\screenshots"+capturename+".png";
		
		File destination = new File(path);
		
		FileHandler.copy(source, destination);
		
		return path;
	}
}	



        
        
       
		
	

	



