package script;

import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.BusinessFunctions;

public class TC04 extends StartBrowser {
	@Test
	public void captureErrorMessage() throws Exception {
	BusinessFunctions bFunctions = new BusinessFunctions();
	bFunctions.navigatetoApp();
	bFunctions.login();
	}
}

