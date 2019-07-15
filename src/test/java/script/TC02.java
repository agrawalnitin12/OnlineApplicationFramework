package script;

import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.BusinessFunctions;

public class TC02 extends StartBrowser{
  @Test
  public void elementExistenece() throws Exception {
	  BusinessFunctions bFunctions = new BusinessFunctions();
	  bFunctions.navigatetoApp();
	  bFunctions.elementExistence();
  }
}
