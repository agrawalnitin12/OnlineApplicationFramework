package script;

import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.BusinessFunctions;


public class TC01 extends StartBrowser{
  @Test
  public void applicationLaunch() {
	  BusinessFunctions bFunctions = new BusinessFunctions();
	  bFunctions.navigatetoApp();
  }
}
