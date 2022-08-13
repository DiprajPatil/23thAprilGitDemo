package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import listeners.TestNGListeners;
import utility.ReadPropertiesFiles;

public class AdvanceLoginTest extends TestNGListeners {
	
	@Test (priority = 1)
	public void login() throws IOException
	{
		test.info("Entering credentials");
		lpa.loginFunctionality(ReadPropertiesFiles.readConfigData("username"),ReadPropertiesFiles.readConfigData("password"));
		test.info("Entered creds are: "+ReadPropertiesFiles.readConfigData("username")+" "+ReadPropertiesFiles.readConfigData("password"));
	}
	
	@Test (priority = 2)
	public void enterpin() throws IOException
	{
		lpa.pin(ReadPropertiesFiles.readConfigData("Epin"));
		test.info("Entered pin");

	}

}
