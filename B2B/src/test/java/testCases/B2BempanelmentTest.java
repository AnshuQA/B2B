package testCases;

import org.testng.annotations.Test;

import base.BaseTest;
import page.B2BEnquiry;
import page.B2Bempanelment;
import page.RegistrationPageAndLoginPage;

public class B2BempanelmentTest extends BaseTest {
	public static RegistrationPageAndLoginPage lp = new RegistrationPageAndLoginPage();
	public static B2Bempanelment enp = new B2Bempanelment();
	public static B2BEnquiry enq = new B2BEnquiry();

	@Test(priority = 1)
	public void recordActivityTest() throws InterruptedException {
		lp.himanshiLogin();
		enp.enpanelmentBtn();
		enq.leadSearch();
		enp.updateBtn();
		enp.recordActivityBtn();
		enp.nismRegistration();
		enp.updateBtn();
		enp.recordActivityBtn();
		enp.nismExamTranning();
		enp.updateBtn();
		enp.recordActivityBtn();
		enp.nismExam();
		enp.updateBtn();
		enp.recordActivityBtn();
		enp.nismExamClear();
	}

	@Test(priority = 2)
	public void basicTranningTest() throws InterruptedException {
		enp.updateBtn();
		enp.basicTranning();
	}

	@Test(priority = 3)
	public void filterTest() throws InterruptedException {
		enp.dateWiseFilter();
		enp.arnWiseFilter();
		enp.nismWiseFilter();
		enp.stagesWiseFilter();
		enp.statusWiseFilter();
		lp.logout();
	}

}
