package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import listeners.TestNGListeners;
import utility.ReadPropertiesFiles;

public class DashBoardTest extends TestNGListeners{
	
	@Test (priority = 3)
	public void dashboard() throws IOException
	{
		test.info("searching the shares");
		db.searchShare(ReadPropertiesFiles.readConfigData("share"));
	}
	
	@Test (priority = 4)
	public void validateShare()
	{
		test.info("Placing the order");
		db.buyShare();
	}
	
//	@Test (priority = 5)
//	public void lastbuy()
//	{
//		db.buyShare();
//	}

}
