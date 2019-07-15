package script;

import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.BusinessFunctions;

public class TC03 extends StartBrowser{
  @Test
  public void appLoginLogout() throws Exception {
	  BusinessFunctions bFunctions = new BusinessFunctions();
	  bFunctions.navigatetoApp();
	  bFunctions.login();
	  bFunctions.logout();
  }
}
