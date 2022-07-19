package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class EnpanelmentForm extends BaseTest {
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void arnYes(String email, String mobile, String pannumber, String accountnum) throws InterruptedException {
//Empanelment Details
		// Reset button

		int sizea = driver.findElements(By.xpath("//*[@id=\"validate-arn-id\"]/div[1]/a")).size();
		if (sizea > 0) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"validate-arn-id\"]/div[1]/a")).click();
			// Do you have ARN -Yes

			// ARN check
			Thread.sleep(3000);
			WebElement arn = driver.findElement(By.id("IsArnStatus"));
			Select yes = new Select(arn);
			yes.selectByValue("Yes");
			driver.findElement(By.id("validateArn")).sendKeys("24");
			driver.findElement(By.id("validateArnButton")).click();

			Thread.sleep(3000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)");
			driver.findElement(By.id("selectedSignFiles")).sendKeys("E:\\SeleniumCodeFile\\sign.jpg");
			driver.findElement(By.id("selectedArnFiles")).sendKeys("E:\\SeleniumCodeFile\\testPan.png");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step1\"]/div[11]/div/input")).click();

			// Basic Details
			WebElement name = driver.findElement(By.id("Name"));
			name.clear();
			name.sendKeys("Anshuman Automation Test");
			WebElement emaila = driver.findElement(By.id("PersonalEmail"));
			emaila.clear();
			emaila.sendKeys(email);
			WebElement mobilea = driver.findElement(By.id("Phone"));
			mobilea.clear();
			mobilea.sendKeys(mobile);
			Thread.sleep(3000);
			WebElement dropdown = driver.findElement(By.id("TaxStatus"));
			Select select = new Select(dropdown);
			select.selectByValue("1");
			Thread.sleep(3000);
			driver.findElement(By.id("OfficeLocation")).sendKeys(Keys.PAGE_DOWN);
			driver.findElement(By.id("DOB")).sendKeys("07/10/1996");
			driver.findElement(By.id("PanNumber")).sendKeys(pannumber);
			driver.findElement(By.id("education")).sendKeys("B Tech");
			driver.findElement(By.id("contactPersonName")).sendKeys("Test Contact Person");
			driver.findElement(By.id("ContactPersonMobile")).sendKeys("9718205589");
			driver.findElement(By.id("Occupation")).sendKeys("Private Sector");
			driver.findElement(By.id("OfficeLocation")).sendKeys("Noida");
			Thread.sleep(3000);
			WebElement OfficeSetup = driver.findElement(By.id("OfficeSetUp"));
			Select setup = new Select(OfficeSetup);
			setup.selectByValue("1");
			Thread.sleep(3000);
			WebElement InsuranceCompanyEmpanelment = driver.findElement(By.id("InsuranceCompanyEmpanelment"));
			Select empanelment = new Select(InsuranceCompanyEmpanelment);
			empanelment.selectByValue("0");
			driver.findElement(By.id("selectedPanFiles")).sendKeys("E:\\SeleniumCodeFile\\testPan.png");
			driver.findElement(By.id("selectedPhotoFiles")).sendKeys("E:\\SeleniumCodeFile\\clientPhoto.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step2\"]/div[18]/div/input[2]")).click();
			// Address
			driver.findElement(By.id("State")).sendKeys("Uttar Pradesh");
			driver.findElement(By.id("selectedAadharFrontFiles")).sendKeys("E:\\SeleniumCodeFile\\adharFront.jpeg");
			driver.findElement(By.id("selectedAadharBackFiles")).sendKeys("E:\\SeleniumCodeFile\\adharBack.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step3\"]/div[8]/div/input[2]")).click();

			// Bank Details
			driver.findElement(By.id("AccountNo")).sendKeys(accountnum);

			WebElement accountType = driver.findElement(By.id("AccountType"));
			Select saving = new Select(accountType);
			saving.selectByValue("SB");
			driver.findElement(By.id("NameAsPerBank")).sendKeys("Test Bank");
			driver.findElement(By.id("IfscCode")).sendKeys("HDFC0000001");
			Thread.sleep(4000);
			WebElement modepaymeny = driver.findElement(By.id("ModeOfPayment"));
			Select cheque = new Select(modepaymeny);
			cheque.selectByValue("CHQ");
			driver.findElement(By.id("selectedCancelCheckFiles")).sendKeys("E:\\SeleniumCodeFile\\CancelCheque.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step4\"]/div[13]/div/input[2]")).click();

			// Nominee
			driver.findElement(By.id("NomineeName")).sendKeys("Test Nominee");
			driver.findElement(By.id("NomineeRelation")).sendKeys("Test Relation");
			driver.findElement(By.id("NomineeDob")).sendKeys("10/10/1996");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step5\"]/div[5]/div/input[2]")).click();
			// Verify

			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"step7\"]/div[1]/button")).click();
			driver.findElement(By.id("empOtp")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"validateOtpPopup\"]/div/div/div[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"serverErrorPopup\"]/div/div/div/div[3]/div/button")).click();

		}

		// Verify
		int sizeb = driver.findElements(By.xpath("//*[@id=\"step7\"]/div[2]/div[2]/table/tbody/tr[5]/td/b/a")).size();
		if (sizeb > 0) {

			// Edit Basic Details button
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step7\"]/div[2]/div[2]/table/tbody/tr[5]/td/b/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"validate-arn-id\"]/div[1]/a")).click();
			// Do you have ARN -Yes
			//
			// ARN check
			Thread.sleep(3000);
			WebElement arn = driver.findElement(By.id("IsArnStatus"));
			Select yes = new Select(arn);
			yes.selectByValue("Yes");
			driver.findElement(By.id("validateArn")).sendKeys("24");
			driver.findElement(By.id("validateArnButton")).click();

			Thread.sleep(3000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)");
			driver.findElement(By.id("selectedSignFiles")).sendKeys("E:\\SeleniumCodeFile\\sign.jpg");
			driver.findElement(By.id("selectedArnFiles")).sendKeys("E:\\SeleniumCodeFile\\testPan.png");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step1\"]/div[11]/div/input")).click();

			// Basic Details
			WebElement name = driver.findElement(By.id("Name"));
			name.clear();
			name.sendKeys("Anshuman Automation Test");
			WebElement emaila = driver.findElement(By.id("PersonalEmail"));
			emaila.clear();
			emaila.sendKeys(email);
			WebElement mobile1 = driver.findElement(By.id("Phone"));
			mobile1.clear();
			mobile1.sendKeys(mobile);
			Thread.sleep(3000);
			WebElement dropdown = driver.findElement(By.id("TaxStatus"));
			Select select = new Select(dropdown);
			select.selectByValue("1");
			Thread.sleep(3000);
			driver.findElement(By.id("OfficeLocation")).sendKeys(Keys.PAGE_DOWN);
			driver.findElement(By.id("DOB")).sendKeys("07/10/1996");
			driver.findElement(By.id("PanNumber")).sendKeys(pannumber);
			driver.findElement(By.id("education")).sendKeys("B Tech");
			driver.findElement(By.id("contactPersonName")).sendKeys("Test Contact Person");
			driver.findElement(By.id("ContactPersonMobile")).sendKeys("9718205589");
			driver.findElement(By.id("Occupation")).sendKeys("Private Sector");
			driver.findElement(By.id("OfficeLocation")).sendKeys("Noida");
			Thread.sleep(3000);
			WebElement OfficeSetup = driver.findElement(By.id("OfficeSetUp"));
			Select setup = new Select(OfficeSetup);
			setup.selectByValue("1");
			Thread.sleep(3000);
			WebElement InsuranceCompanyEmpanelment = driver.findElement(By.id("InsuranceCompanyEmpanelment"));
			Select empanelment = new Select(InsuranceCompanyEmpanelment);
			empanelment.selectByValue("0");
			driver.findElement(By.id("selectedPanFiles")).sendKeys("E:\\SeleniumCodeFile\\testPan.png");
			driver.findElement(By.id("selectedPhotoFiles")).sendKeys("E:\\SeleniumCodeFile\\clientPhoto.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step2\"]/div[18]/div/input[2]")).click();
			// Address
			driver.findElement(By.id("State")).sendKeys("UttarPradesh");
			driver.findElement(By.id("selectedAadharFrontFiles")).sendKeys("E:\\SeleniumCodeFile\\adharFront.jpeg");
			driver.findElement(By.id("selectedAadharBackFiles")).sendKeys("E:\\SeleniumCodeFile\\adharBack.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step3\"]/div[8]/div/input[2]")).click();

			// Bank Details
			driver.findElement(By.id("AccountNo")).sendKeys(accountnum);

			WebElement accountType = driver.findElement(By.id("AccountType"));
			Select saving = new Select(accountType);
			saving.selectByValue("SB");
			driver.findElement(By.id("NameAsPerBank")).sendKeys("Test Bank");
			driver.findElement(By.id("IfscCode")).sendKeys("HDFC0000001");
			Thread.sleep(4000);
			WebElement modepaymeny = driver.findElement(By.id("ModeOfPayment"));
			Select cheque = new Select(modepaymeny);
			cheque.selectByValue("CHQ");
			driver.findElement(By.id("selectedCancelCheckFiles")).sendKeys("E:\\SeleniumCodeFile\\CancelCheque.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step4\"]/div[13]/div/input[2]")).click();

			// Nominee
			driver.findElement(By.id("NomineeName")).sendKeys("Test Nominee");
			driver.findElement(By.id("NomineeRelation")).sendKeys("Test Relation");
			driver.findElement(By.id("NomineeDob")).sendKeys("10/10/1996");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step5\"]/div[5]/div/input[2]")).click(); // Verify

			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"step7\"]/div[1]/button")).click();
			driver.findElement(By.id("empOtp")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"validateOtpPopup\"]/div/div/div[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"serverErrorPopup\"]/div/div/div/div[3]/div/button")).click();
		} else {
			// Do you have ARN -Yes

			// ARN check
			Thread.sleep(3000);
			WebElement arn = driver.findElement(By.id("IsArnStatus"));
			Select yes = new Select(arn);
			yes.selectByValue("Yes");
			driver.findElement(By.id("validateArn")).sendKeys("24");
			driver.findElement(By.id("validateArnButton")).click();

			Thread.sleep(3000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)");
			driver.findElement(By.id("selectedSignFiles")).sendKeys("E:\\SeleniumCodeFile\\sign.jpg");
			driver.findElement(By.id("selectedArnFiles")).sendKeys("E:\\SeleniumCodeFile\\testPan.png");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step1\"]/div[11]/div/input")).click();

			// Basic Details
			WebElement name = driver.findElement(By.id("Name"));
			name.clear();
			name.sendKeys("Anshuman Automation Test");
			WebElement email1 = driver.findElement(By.id("PersonalEmail"));
			email1.clear();
			email1.sendKeys(email);
			WebElement mobile1 = driver.findElement(By.id("Phone"));
			mobile1.clear();
			mobile1.sendKeys(mobile);
			Thread.sleep(3000);
			WebElement dropdown = driver.findElement(By.id("TaxStatus"));
			Select select = new Select(dropdown);
			select.selectByValue("1");
			Thread.sleep(3000);
			driver.findElement(By.id("OfficeLocation")).sendKeys(Keys.PAGE_DOWN);
			driver.findElement(By.id("DOB")).sendKeys("07/10/1996");
			driver.findElement(By.id("PanNumber")).sendKeys(pannumber);
			driver.findElement(By.id("education")).sendKeys("B Tech");
			driver.findElement(By.id("contactPersonName")).sendKeys("Test Contact Person");
			driver.findElement(By.id("ContactPersonMobile")).sendKeys("9718205589");
			driver.findElement(By.id("Occupation")).sendKeys("Private Sector");
			driver.findElement(By.id("OfficeLocation")).sendKeys("Noida");
			Thread.sleep(3000);
			WebElement OfficeSetup = driver.findElement(By.id("OfficeSetUp"));
			Select setup = new Select(OfficeSetup);
			setup.selectByValue("1");
			Thread.sleep(3000);
			WebElement InsuranceCompanyEmpanelment = driver.findElement(By.id("InsuranceCompanyEmpanelment"));
			Select empanelment = new Select(InsuranceCompanyEmpanelment);
			empanelment.selectByValue("0");
			driver.findElement(By.id("selectedPanFiles")).sendKeys("E:\\SeleniumCodeFile\\testPan.png");
			driver.findElement(By.id("selectedPhotoFiles")).sendKeys("E:\\SeleniumCodeFile\\clientPhoto.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step2\"]/div[18]/div/input[2]")).click();
			// Address
			driver.findElement(By.id("State")).sendKeys("Uttar Pradesh");
			driver.findElement(By.id("selectedAadharFrontFiles")).sendKeys("E:\\SeleniumCodeFile\\adharFront.jpeg");
			driver.findElement(By.id("selectedAadharBackFiles")).sendKeys("E:\\SeleniumCodeFile\\adharBack.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step3\"]/div[8]/div/input[2]")).click();

			// Bank Details
			driver.findElement(By.id("AccountNo")).sendKeys(accountnum);

			WebElement accountType = driver.findElement(By.id("AccountType"));
			Select saving = new Select(accountType);
			saving.selectByValue("SB");
			driver.findElement(By.id("NameAsPerBank")).sendKeys("Test Bank");
			driver.findElement(By.id("IfscCode")).sendKeys("HDFC0000001");
			Thread.sleep(4000);
			WebElement modepaymeny = driver.findElement(By.id("ModeOfPayment"));
			Select cheque = new Select(modepaymeny);
			cheque.selectByValue("CHQ");
			driver.findElement(By.id("selectedCancelCheckFiles")).sendKeys("E:\\SeleniumCodeFile\\CancelCheque.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step4\"]/div[13]/div/input[2]")).click();

			// Nominee
			driver.findElement(By.id("NomineeName")).sendKeys("Test Nominee");
			driver.findElement(By.id("NomineeRelation")).sendKeys("Test Relation");
			driver.findElement(By.id("NomineeDob")).sendKeys("10/10/1996");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step5\"]/div[5]/div/input[2]")).click();
			// Verify

			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"step7\"]/div[1]/button")).click();
			driver.findElement(By.id("empOtp")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"validateOtpPopup\"]/div/div/div[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"serverErrorPopup\"]/div/div/div/div[3]/div/button")).click();

		}

	}

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void arnNo(String email, String mobile, String pannumber, String accountnum) throws InterruptedException

	{
		int sizea = driver.findElements(By.xpath("//*[@id=\"validate-arn-id\"]/div[1]/a")).size();
		if (sizea > 0) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"validate-arn-id\"]/div[1]/a")).click();
			// ARN check
			Thread.sleep(3000);
			WebElement arn = driver.findElement(By.id("IsArnStatus"));
			Select yes = new Select(arn);
			yes.selectByValue("No");

			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step1\"]/div[2]/div/input")).click();

			// Basic Details
			WebElement name = driver.findElement(By.id("Name"));
			name.clear();
			name.sendKeys("Anshuman Automation Test");
			WebElement email1 = driver.findElement(By.id("PersonalEmail"));
			email1.clear();
			email1.sendKeys(email);
			WebElement mobile1 = driver.findElement(By.id("Phone"));
			mobile1.clear();
			mobile1.sendKeys(mobile);
			Thread.sleep(3000);
			WebElement dropdown = driver.findElement(By.id("TaxStatus"));
			Select select = new Select(dropdown);
			select.selectByValue("1");
			Thread.sleep(3000);
			driver.findElement(By.id("OfficeLocation")).sendKeys(Keys.PAGE_DOWN);
			driver.findElement(By.id("DOB")).sendKeys("07/10/1996");
			driver.findElement(By.id("PanNumber")).sendKeys(pannumber);
			driver.findElement(By.id("education")).sendKeys("B Tech");
			driver.findElement(By.id("contactPersonName")).sendKeys("Test Contact Person");
			driver.findElement(By.id("ContactPersonMobile")).sendKeys("9718205589");
			driver.findElement(By.id("Occupation")).sendKeys("Private Sector");
			driver.findElement(By.id("OfficeLocation")).sendKeys("Noida");
			Thread.sleep(3000);
			WebElement OfficeSetup = driver.findElement(By.id("OfficeSetUp"));
			Select setup = new Select(OfficeSetup);
			setup.selectByValue("1");
			Thread.sleep(3000);
			WebElement InsuranceCompanyEmpanelment = driver.findElement(By.id("InsuranceCompanyEmpanelment"));
			Select empanelment = new Select(InsuranceCompanyEmpanelment);
			empanelment.selectByValue("0");
			driver.findElement(By.id("selectedPanFiles")).sendKeys("E:\\SeleniumCodeFile\\testPan.png");
			driver.findElement(By.id("selectedPhotoFiles")).sendKeys("E:\\SeleniumCodeFile\\clientPhoto.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step2\"]/div[18]/div/input[2]")).click();
			// Address
			driver.findElement(By.id("Address")).sendKeys("A-22, Block A, Sector 4, Noida, Uttar Pradesh 201301");
			driver.findElement(By.id("City")).sendKeys("Noida");
			driver.findElement(By.id("State")).sendKeys("UttarPradesh");
			driver.findElement(By.id("pinCode")).sendKeys("201301");
			driver.findElement(By.id("selectedAadharFrontFiles")).sendKeys("E:\\SeleniumCodeFile\\adharFront.jpeg");
			driver.findElement(By.id("selectedAadharBackFiles")).sendKeys("E:\\SeleniumCodeFile\\adharBack.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step3\"]/div[8]/div/input[2]")).click();

			// Bank Details
			driver.findElement(By.id("AccountNo")).sendKeys(accountnum);

			WebElement accountType = driver.findElement(By.id("AccountType"));
			Select saving = new Select(accountType);
			saving.selectByValue("SB");
			driver.findElement(By.id("NameAsPerBank")).sendKeys("Test Bank");
			driver.findElement(By.id("IfscCode")).sendKeys("HDFC0000001");
			Thread.sleep(4000);
			WebElement modepaymeny = driver.findElement(By.id("ModeOfPayment"));
			Select cheque = new Select(modepaymeny);
			cheque.selectByValue("CHQ");
			driver.findElement(By.id("selectedCancelCheckFiles")).sendKeys("E:\\SeleniumCodeFile\\CancelCheque.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step4\"]/div[13]/div/input[2]")).click();

			// Nominee
			driver.findElement(By.id("NomineeName")).sendKeys("Test Nominee");
			driver.findElement(By.id("NomineeRelation")).sendKeys("Test Relation");
			driver.findElement(By.id("NomineeDob")).sendKeys("10/10/1996");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step5\"]/div[5]/div/input[2]")).click();
			// Verify

			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"step7\"]/div[1]/button")).click();
			driver.findElement(By.id("empOtp")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"validateOtpPopup\"]/div/div/div[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"serverErrorPopup\"]/div/div/div/div[3]/div/button")).click();
		}
		// Verify
		int sizeb = driver.findElements(By.xpath("//*[@id=\"step7\"]/div[2]/div[2]/table/tbody/tr[5]/td/b/a")).size();
		if (sizeb > 0) {

			// Edit Basic Details button
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step7\"]/div[2]/div[2]/table/tbody/tr[5]/td/b/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"validate-arn-id\"]/div[1]/a")).click();
			// ARN check
			Thread.sleep(3000);
			WebElement arn = driver.findElement(By.id("IsArnStatus"));
			Select yes = new Select(arn);
			yes.selectByValue("No");

			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step1\"]/div[2]/div/input")).click();

			// Basic Details
			WebElement name = driver.findElement(By.id("Name"));
			name.clear();
			name.sendKeys("Anshuman Automation Test");
			WebElement email1 = driver.findElement(By.id("PersonalEmail"));
			email1.clear();
			email1.sendKeys(email);
			WebElement mobile1 = driver.findElement(By.id("Phone"));
			mobile1.clear();
			mobile1.sendKeys(mobile);
			Thread.sleep(3000);
			WebElement dropdown = driver.findElement(By.id("TaxStatus"));
			Select select = new Select(dropdown);
			select.selectByValue("1");
			Thread.sleep(3000);
			driver.findElement(By.id("OfficeLocation")).sendKeys(Keys.PAGE_DOWN);
			driver.findElement(By.id("DOB")).sendKeys("07/10/1996");
			driver.findElement(By.id("PanNumber")).sendKeys(pannumber);
			driver.findElement(By.id("education")).sendKeys("B Tech");
			driver.findElement(By.id("contactPersonName")).sendKeys("Test Contact Person");
			driver.findElement(By.id("ContactPersonMobile")).sendKeys("9718205589");
			driver.findElement(By.id("Occupation")).sendKeys("Private Sector");
			driver.findElement(By.id("OfficeLocation")).sendKeys("Noida");
			Thread.sleep(3000);
			WebElement OfficeSetup = driver.findElement(By.id("OfficeSetUp"));
			Select setup = new Select(OfficeSetup);
			setup.selectByValue("1");
			Thread.sleep(3000);
			WebElement InsuranceCompanyEmpanelment = driver.findElement(By.id("InsuranceCompanyEmpanelment"));
			Select empanelment = new Select(InsuranceCompanyEmpanelment);
			empanelment.selectByValue("0");
			driver.findElement(By.id("selectedPanFiles")).sendKeys("E:\\SeleniumCodeFile\\testPan.png");
			driver.findElement(By.id("selectedPhotoFiles")).sendKeys("E:\\SeleniumCodeFile\\clientPhoto.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step2\"]/div[18]/div/input[2]")).click();
			// Address
			driver.findElement(By.id("Address")).sendKeys("A-22, Block A, Sector 4, Noida, Uttar Pradesh 201301");
			driver.findElement(By.id("City")).sendKeys("Noida");
			driver.findElement(By.id("State")).sendKeys("UttarPradesh");
			driver.findElement(By.id("pinCode")).sendKeys("201301");
			driver.findElement(By.id("selectedAadharFrontFiles")).sendKeys("E:\\SeleniumCodeFile\\adharFront.jpeg");
			driver.findElement(By.id("selectedAadharBackFiles")).sendKeys("E:\\SeleniumCodeFile\\adharBack.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step3\"]/div[8]/div/input[2]")).click();

			// Bank Details
			driver.findElement(By.id("AccountNo")).sendKeys(accountnum);

			WebElement accountType = driver.findElement(By.id("AccountType"));
			Select saving = new Select(accountType);
			saving.selectByValue("SB");
			driver.findElement(By.id("NameAsPerBank")).sendKeys("Test Bank");
			driver.findElement(By.id("IfscCode")).sendKeys("HDFC0000001");
			Thread.sleep(4000);
			WebElement modepaymeny = driver.findElement(By.id("ModeOfPayment"));
			Select cheque = new Select(modepaymeny);
			cheque.selectByValue("CHQ");
			driver.findElement(By.id("selectedCancelCheckFiles")).sendKeys("E:\\SeleniumCodeFile\\CancelCheque.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step4\"]/div[13]/div/input[2]")).click();

			// Nominee
			driver.findElement(By.id("NomineeName")).sendKeys("Test Nominee");
			driver.findElement(By.id("NomineeRelation")).sendKeys("Test Relation");
			driver.findElement(By.id("NomineeDob")).sendKeys("10/10/1996");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step5\"]/div[5]/div/input[2]")).click();
			// Verify

			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"step7\"]/div[1]/button")).click();
			driver.findElement(By.id("empOtp")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"validateOtpPopup\"]/div/div/div[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"serverErrorPopup\"]/div/div/div/div[3]/div/button")).click();
		} else {
			// ARN check
			Thread.sleep(3000);
			WebElement arn = driver.findElement(By.id("IsArnStatus"));
			Select yes = new Select(arn);
			yes.selectByValue("No");

			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step1\"]/div[2]/div/input")).click();

			// Basic Details
			WebElement name = driver.findElement(By.id("Name"));
			name.clear();
			name.sendKeys("Anshuman Automation Test");
			WebElement email1 = driver.findElement(By.id("PersonalEmail"));
			email1.clear();
			email1.sendKeys(email);
			WebElement mobile1 = driver.findElement(By.id("Phone"));
			mobile1.clear();
			mobile1.sendKeys(mobile);
			Thread.sleep(3000);
			WebElement dropdown = driver.findElement(By.id("TaxStatus"));
			Select select = new Select(dropdown);
			select.selectByValue("1");
			Thread.sleep(3000);
			driver.findElement(By.id("OfficeLocation")).sendKeys(Keys.PAGE_DOWN);
			driver.findElement(By.id("DOB")).sendKeys("07/10/1996");
			driver.findElement(By.id("PanNumber")).sendKeys(pannumber);
			driver.findElement(By.id("education")).sendKeys("B Tech");
			driver.findElement(By.id("contactPersonName")).sendKeys("Test Contact Person");
			driver.findElement(By.id("ContactPersonMobile")).sendKeys("9718205589");
			driver.findElement(By.id("Occupation")).sendKeys("Private Sector");
			driver.findElement(By.id("OfficeLocation")).sendKeys("Noida");
			Thread.sleep(3000);
			WebElement OfficeSetup = driver.findElement(By.id("OfficeSetUp"));
			Select setup = new Select(OfficeSetup);
			setup.selectByValue("1");
			Thread.sleep(3000);
			WebElement InsuranceCompanyEmpanelment = driver.findElement(By.id("InsuranceCompanyEmpanelment"));
			Select empanelment = new Select(InsuranceCompanyEmpanelment);
			empanelment.selectByValue("0");
			driver.findElement(By.id("selectedPanFiles")).sendKeys("E:\\SeleniumCodeFile\\testPan.png");
			driver.findElement(By.id("selectedPhotoFiles")).sendKeys("E:\\SeleniumCodeFile\\clientPhoto.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step2\"]/div[18]/div/input[2]")).click();
			// Address
			driver.findElement(By.id("Address")).sendKeys("A-22, Block A, Sector 4, Noida, Uttar Pradesh 201301");
			driver.findElement(By.id("City")).sendKeys("Noida");
			driver.findElement(By.id("State")).sendKeys("UttarPradesh");
			driver.findElement(By.id("pinCode")).sendKeys("201301");
			driver.findElement(By.id("selectedAadharFrontFiles")).sendKeys("E:\\SeleniumCodeFile\\adharFront.jpeg");
			driver.findElement(By.id("selectedAadharBackFiles")).sendKeys("E:\\SeleniumCodeFile\\adharBack.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step3\"]/div[8]/div/input[2]")).click();

			// Bank Details
			driver.findElement(By.id("AccountNo")).sendKeys(accountnum);

			WebElement accountType = driver.findElement(By.id("AccountType"));
			Select saving = new Select(accountType);
			saving.selectByValue("SB");
			driver.findElement(By.id("NameAsPerBank")).sendKeys("Test Bank");
			driver.findElement(By.id("IfscCode")).sendKeys("HDFC0000001");
			Thread.sleep(4000);
			WebElement modepaymeny = driver.findElement(By.id("ModeOfPayment"));
			Select cheque = new Select(modepaymeny);
			cheque.selectByValue("CHQ");
			driver.findElement(By.id("selectedCancelCheckFiles")).sendKeys("E:\\SeleniumCodeFile\\CancelCheque.jpeg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step4\"]/div[13]/div/input[2]")).click();

			// Nominee
			driver.findElement(By.id("NomineeName")).sendKeys("Test Nominee");
			driver.findElement(By.id("NomineeRelation")).sendKeys("Test Relation");
			driver.findElement(By.id("NomineeDob")).sendKeys("10/10/1996");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"step5\"]/div[5]/div/input[2]")).click();
			// Verify

			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"step7\"]/div[1]/button")).click();
			driver.findElement(By.id("empOtp")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"validateOtpPopup\"]/div/div/div[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"serverErrorPopup\"]/div/div/div/div[3]/div/button")).click();
		}
	}

	public void editImpanelment() throws InterruptedException {
		// Edit Basic Details

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"step7\"]/div[2]/div[2]/table/tbody/tr[5]/td/b/a")).click();
		WebElement name = driver.findElement(By.id("Name"));
		name.clear();
		name.sendKeys("Anshuman Automation Test1");
		WebElement email = driver.findElement(By.id("PersonalEmail"));
		email.clear();
		email.sendKeys("testb2bautomation1@gmail.com");
		WebElement mobile = driver.findElement(By.id("Phone"));
		mobile.clear();
		mobile.sendKeys("8000000000");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-homepage-layout/ng-component/div[1]/div/div[2]/div/div[3]/div[2]/div/div/div[18]/div/input"))
				.click();
		Thread.sleep(5000);
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(800,0)");
		String comp = "testb2bautomation1@gmail.com";
		String comp1 = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue(comp1.contains(comp));

		// Edit Bank Details
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"step7\"]/div[2]/div[2]/table/tbody/tr[15]/td/b/a")).click();
		WebElement bank = driver.findElement(By.id("NameAsPerBank"));
		bank.clear();
		bank.sendKeys("Test Bank1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"step4\"]/div[13]/div/input")).click();
		Thread.sleep(3000);
		// JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-900)");

	}

}
