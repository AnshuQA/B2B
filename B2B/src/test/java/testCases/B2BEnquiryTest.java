package testCases;

import org.testng.annotations.Test;

import base.BaseTest;
import page.B2BEnquiry;
import page.RegistrationPageAndLoginPage;

public class B2BEnquiryTest extends BaseTest {

	public static B2BEnquiry enquiry = new B2BEnquiry();
	public static RegistrationPageAndLoginPage lp = new RegistrationPageAndLoginPage();

	@Test(priority = 1)
	public void leadAssigntoYusraTest() throws InterruptedException {
		lp.rachitLogin();
		enquiry.B2BenquiryBtn();
		// enquiry.leadSearch();
		// enquiry.leadReassignToYusra();(dont use beacsue geniune leads reassign)
		lp.workpointSignOut();
	}

	@Test(priority = 2)
	public void subBrokarActivityTest() throws InterruptedException {
		lp.yusraLogin();
		enquiry.B2BenquiryBtn();
		enquiry.leadSearch();

		enquiry.updateBtn();
		enquiry.recordActivityBtn();
		enquiry.call();
		enquiry.updateBtn();
		enquiry.recordActivityBtn();
		enquiry.onlineMeeting();
		enquiry.updateBtn();
		enquiry.recordActivityBtn();
		enquiry.visit();
		enquiry.updateBtn();
		enquiry.recordActivityBtn();
		enquiry.notAnswer();
		enquiry.updateBtn();
		enquiry.webinar();

	}

	@Test(priority = 3)
	public void requestforreviewTest() throws InterruptedException {

		enquiry.updateBtn();
		enquiry.requestforReview();
	}

	@Test(priority = 4)
	public void leadChangeStatusTest() throws InterruptedException {

		enquiry.updateBtn();
		enquiry.leadchangeStatus();
	}

	@Test(priority = 5)
	public void filterTest() throws InterruptedException {

		enquiry.dateFilter();
		enquiry.callFilter();
		enquiry.onlineMeetingFilter();
		enquiry.visitFilter();
		enquiry.notAnswerFilter();
		enquiry.webinarAttendFilter();
		enquiry.webinarNotAttendFilter();
		lp.logout();
	}

}
