package testCases;

import org.testng.annotations.Test;

import base.BaseTest;
import page.RegistrationPageAndLoginPage;
import utilities.DataUtil;

public class RegistrationTest extends BaseTest {
	public static RegistrationPageAndLoginPage rp = new RegistrationPageAndLoginPage();

	@Test(priority = 1, dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void registration(String name, String email, String mobile) throws InterruptedException {

		rp.addLreadDirectReg(name, email, mobile);

	}
}
