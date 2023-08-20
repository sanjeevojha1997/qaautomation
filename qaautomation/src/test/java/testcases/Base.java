package testcases;

import org.testng.annotations.Test;

import utils.WebDriverHelper;

public class Base {

	@Test
	public void TestCase01() {
		WebDriverHelper.setup();
	}
	
}
