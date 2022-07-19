package testCases;

import org.testng.annotations.Test;

import base.BaseTest;
import page.EnpanelmentForm;
import page.RegistrationPageAndLoginPage;
import utilities.DataUtil;

public class EnpanelmentTest extends BaseTest {
	public static RegistrationPageAndLoginPage lp = new RegistrationPageAndLoginPage();
	public static EnpanelmentForm emp = new EnpanelmentForm();

	@Test(priority = 1, dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void epanelLogin(String email, String password) throws InterruptedException {

		lp.newEnpelmentLogin(email, password);
	}

	@Test(priority = 2, dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void arnYes(String email, String mobile, String pannumber, String accountnum) throws InterruptedException {
		emp.arnYes(email, mobile, pannumber, accountnum);

	}

	@Test(priority = 3, dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void arnNo(String email, String mobile, String pannumber, String accountnum) throws InterruptedException {
		emp.arnNo(email, mobile, pannumber, accountnum);

	}

	@Test(priority = 4)
	public void editEnpanelment() throws InterruptedException {
		emp.editImpanelment();
		lp.logout();
	}

}
