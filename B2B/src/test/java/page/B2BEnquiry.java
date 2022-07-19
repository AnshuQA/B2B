package page;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;

public class B2BEnquiry extends BaseTest {
	public void B2BenquiryBtn() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://workpoint.fincart.com/b2b/enquiry");
	}

	public void leadSearch() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("ClientSearch")).sendKeys("Anshuman");
		Actions actions1 = new Actions(driver);
		Thread.sleep(3000);
		actions1.sendKeys(Keys.ARROW_DOWN);
		actions1.sendKeys(Keys.ENTER);
		actions1.build().perform();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
	}

	public void leadReassignToYusra() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[contains(text(),'Update')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("re-assign")).click();
		WebElement assign = driver.findElement(By.id("assigneeEmpCode"));
		Select select = new Select(assign);
		select.selectByVisibleText("Yusra Wahab");
		Thread.sleep(3000);
		driver.findElement(By.id("assignreason")).sendKeys("This is testing id please egnore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='reassignLead']//input[@value='SAVE']")).click();
		Thread.sleep(5000);
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.TAB);
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform();

	}

	public void updateBtn() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//b[contains(text(),'Update')]")).click();
	}

	public void recordActivityBtn() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("record-activity")).click();
	}

	public void call() throws InterruptedException {
		Thread.sleep(3000);
		Date dt = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.DATE, 0);
		dt = calendar.getTime();
		String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(dt);

// this buttone may be unique
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		actions.sendKeys(tommorowsDate);
		Thread.sleep(3000);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("04:00AM");
		actions.build().perform();
		driver.findElement(By.id("recordactivityreason")).sendKeys("call not picked");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		Thread.sleep(5000);
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform();

	}

	public void onlineMeeting() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("ONLINE MEETING")).click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		Date dt = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.DATE, 0);
		dt = calendar.getTime();
		String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(dt);

// this buttone may be unique
		Actions actions = new Actions(driver);

		actions.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		actions.sendKeys(tommorowsDate);
		Thread.sleep(3000);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("04:00AM");
		actions.build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("recordactivityreason")).sendKeys("Online meeting Already done");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		Thread.sleep(5000);
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform();
	}

	public void visit() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("VISIT")).click();
		Thread.sleep(3000);
		Date dt = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.DATE, 0);
		dt = calendar.getTime();
		String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(dt);

// this buttone may be unique
		Actions actions = new Actions(driver);

		actions.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		actions.sendKeys(tommorowsDate);
		Thread.sleep(3000);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("04:00AM");
		actions.build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("recordactivityreason")).sendKeys("Testing Visit Done");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		Thread.sleep(5000);
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform();

	}

	public void notAnswer() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("NOT ANSWERED")).click();
		Thread.sleep(3000);
		Date dt = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.DATE, 0);
		dt = calendar.getTime();
		String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(dt);
		// this buttone may be unique
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		actions.sendKeys(tommorowsDate);
		Thread.sleep(3000);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("04:00AM");
		actions.build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("recordactivityreason")).sendKeys("Testing NOT ANSWERED Done");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		Thread.sleep(5000);
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform();
	}

	public void webinar() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("record-webinar-activity")).click();
		int sizea = driver.findElements(By.id("webinarStatus")).size();
		if (sizea > 0) {
			WebElement assign = driver.findElement(By.id("webinarStatus"));
			Select select = new Select(assign);
			select.selectByVisibleText("No");
			Thread.sleep(5000);
			driver.findElement(
					By.xpath("//form[@id='recordWebinarActivityStatus']//textarea[@id='recordactivityreason']"))
					.sendKeys("Webinar Attend Not attend");
			driver.findElement(By.xpath("//form[@id='recordWebinarActivityStatus']//input[@value='SAVE']")).click();
			Thread.sleep(5000);
			Actions actions2 = new Actions(driver);
			actions2.sendKeys(Keys.TAB);
			Thread.sleep(3000);
			actions2.sendKeys(Keys.ENTER);
			actions2.build().perform();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//b[contains(text(),'Update')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("record-webinar-activity")).click();

			select.selectByVisibleText("Yes");
			Thread.sleep(3000);
			driver.findElement(By.id("WebinarAttendDate")).sendKeys("07/01/2022 04:57 PM");
			actions2.sendKeys(Keys.ENTER);
			actions2.build().perform();

			Thread.sleep(5000);
			driver.findElement(
					By.xpath("//form[@id='recordWebinarActivityStatus']//textarea[@id='recordactivityreason']"))
					.sendKeys("Webinar Attend Not attend");
			driver.findElement(By.xpath("//form[@id='recordWebinarActivityStatus']//input[@value='SAVE']")).click();
			Thread.sleep(5000);

			actions2.sendKeys(Keys.TAB);
			Thread.sleep(3000);
			actions2.sendKeys(Keys.ENTER);
			actions2.build().perform();
		} else {
			System.out.println("Already attend the webinar.");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"recordWebinarActivityStatus\"]/div/div/button")).click();
		}
	}

	public void requestforReview() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("request-for-review")).click();
		driver.findElement(By.id("reviewreason")).sendKeys("This is testing request for review");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"requestForReviewStatus\"]/div[2]/input")).click();
		Thread.sleep(3000);
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform();

	}

	public void leadchangeStatus() throws InterruptedException {
		int sizea = driver.findElements(By.id("FOLLOWUP")).size();
		if (sizea > 0) {
			Thread.sleep(3000);
			driver.findElement(By.id("FOLLOWUP")).click();
			driver.findElement(By.id("reason")).sendKeys("i want to reassign this leads to followup");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"LeadChangeStatus\"]/div[2]/input")).click();
			Thread.sleep(3000);
			if (driver.findElement(By.xpath("//*[@id=\"serverErrorPopup\"]/div/div/div/div[3]/div/button"))
					.isDisplayed()) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"serverErrorPopup\"]/div/div/div/div[3]/div/button")).click();
				driver.navigate().refresh();
			} else {
				Actions actions2 = new Actions(driver);
				actions2.sendKeys(Keys.TAB);
				Thread.sleep(3000);
				actions2.sendKeys(Keys.ENTER);
				actions2.build().perform();
			}
		}
// Lead search
		driver.navigate().refresh();
		Thread.sleep(8000);
		driver.findElement(By.id("ClientSearch")).sendKeys("Anshuman");
		Actions actions1 = new Actions(driver);
		Thread.sleep(3000);
		actions1.sendKeys(Keys.ARROW_DOWN);
		actions1.sendKeys(Keys.ENTER);
		actions1.build().perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/input[1]"))
				.click();
// Update
		Thread.sleep(12000);
		driver.findElement(By.xpath("//b[contains(text(),'Update')]")).click();
//OnHold	
		int sizeb = driver.findElements(By.id("ONHOLD")).size();
		if (sizeb > 0) {
			Thread.sleep(3000);
			driver.findElement(By.id("ONHOLD")).click();
			driver.findElement(By.id("reason")).sendKeys("i want to reassign this leads to ONHOLD");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"LeadChangeStatus\"]/div[2]/input")).click();
			Thread.sleep(3000);
			if (driver.findElement(By.xpath("//*[@id=\"serverErrorPopup\"]/div/div/div/div[3]/div/button"))
					.isDisplayed()) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"serverErrorPopup\"]/div/div/div/div[3]/div/button")).click();
				driver.navigate().refresh();
			} else {
				Actions actions2 = new Actions(driver);
				actions2.sendKeys(Keys.TAB);
				Thread.sleep(3000);
				actions2.sendKeys(Keys.ENTER);
				actions2.build().perform();
			}
		}
// Lead search
		driver.navigate().refresh();
		Thread.sleep(8000);
		driver.findElement(By.id("ClientSearch")).sendKeys("Anshuman");
		// Actions actions1 = new Actions(driver);
		Thread.sleep(3000);
		actions1.sendKeys(Keys.ARROW_DOWN);
		actions1.sendKeys(Keys.ENTER);
		actions1.build().perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/input[1]"))
				.click();
// Update
		Thread.sleep(12000);
		driver.findElement(By.xpath("//b[contains(text(),'Update')]")).click();
//Dead	
		int sizec = driver.findElements(By.id("DEAD")).size();
		if (sizec > 0) {
			Thread.sleep(3000);
			driver.findElement(By.id("DEAD")).click();
			driver.findElement(By.id("reason")).sendKeys("i want to reassign this leads to DEAD");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"LeadChangeStatus\"]/div[2]/input")).click();
			Thread.sleep(3000);
			if (driver.findElement(By.xpath("//*[@id=\"serverErrorPopup\"]/div/div/div/div[3]/div/button"))
					.isDisplayed()) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"serverErrorPopup\"]/div/div/div/div[3]/div/button")).click();
				driver.navigate().refresh();
			} else {
				Actions actions2 = new Actions(driver);
				actions2.sendKeys(Keys.TAB);
				Thread.sleep(3000);
				actions2.sendKeys(Keys.ENTER);
				actions2.build().perform();
			}
		}

		// Lead search
		driver.navigate().refresh();
		Thread.sleep(8000);
		driver.findElement(By.id("ClientSearch")).sendKeys("Anshuman");
		// Actions actions1 = new Actions(driver);
		Thread.sleep(3000);
		actions1.sendKeys(Keys.ARROW_DOWN);
		actions1.sendKeys(Keys.ENTER);
		actions1.build().perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-workpoint-layout[1]/div[1]/div[1]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/input[1]"))
				.click();
		// Update
		Thread.sleep(12000);
		driver.findElement(By.xpath("//b[contains(text(),'Update')]")).click();
		// Assigned
		int sized = driver.findElements(By.id("ASSIGNED")).size();
		if (sized > 0) {
			Thread.sleep(3000);
			driver.findElement(By.id("ASSIGNED")).click();
			driver.findElement(By.id("reason")).sendKeys("i want to reassign this leads to ONHOLD");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"LeadChangeStatus\"]/div[2]/input")).click();
			Thread.sleep(3000);
			if (driver.findElement(By.xpath("//*[@id=\"serverErrorPopup\"]/div/div/div/div[3]/div/button"))
					.isDisplayed()) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"serverErrorPopup\"]/div/div/div/div[3]/div/button")).click();
				driver.navigate().refresh();
			} else {
				Actions actions2 = new Actions(driver);
				actions2.sendKeys(Keys.TAB);
				Thread.sleep(3000);
				actions2.sendKeys(Keys.ENTER);
				actions2.build().perform();
				Thread.sleep(3000);
				driver.navigate().refresh();

			}
		}
	}

	public void dateFilter() throws InterruptedException {

		Thread.sleep(12000);

		SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY");
		Date dt = new Date();
		Calendar cl = Calendar.getInstance();
		cl.setTime(dt);
		;
		cl.add(Calendar.DAY_OF_YEAR, -15);
		dt = cl.getTime();
		String str = df.format(dt);
		System.out.println("the date today is " + str);
		WebElement date = driver.findElement(By.id("FromDate"));
		date.clear();
		date.sendKeys(str);
		Thread.sleep(3000);
		driver.findElement(By.id("ToDate")).click();
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"DynamicUserViewPanel\"]/div/div[1]/div[2]/ng-component/div[1]/div[1]/div/div/div[2]/div[7]/input"))
				.click();
		Thread.sleep(6000);
		WebElement leads = driver.findElement(
				By.xpath("//*[@id=\"DynamicUserViewPanel\"]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/h2"));
		System.out.println(leads.getText());
		Thread.sleep(10000);
		driver.navigate().refresh();

	}

	public void callFilter() throws InterruptedException {
		WebElement assign = driver.findElement(By.xpath("//select[@name='ActivityType']"));
		Select select = new Select(assign);
		select.selectByVisibleText("CALL");

		Thread.sleep(20000);
		WebElement leads = driver.findElement(
				By.xpath("//*[@id=\"DynamicUserViewPanel\"]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/h2"));
		System.out.println("Total Call Lead" + leads.getText());
		driver.navigate().refresh();
	}

	public void onlineMeetingFilter() throws InterruptedException {
		WebElement assign = driver.findElement(By.xpath("//select[@name='ActivityType']"));
		Select select1 = new Select(assign);
		select1.selectByVisibleText("ONLINE MEETING");

		Thread.sleep(20000);
		WebElement leads = driver.findElement(
				By.xpath("//*[@id=\"DynamicUserViewPanel\"]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/h2"));
		System.out.println("Total ONLINE MEETING Lead" + leads.getText());
		driver.navigate().refresh();
	}

	public void visitFilter() throws InterruptedException {
		WebElement assign = driver.findElement(By.xpath("//select[@name='ActivityType']"));
		Select select2 = new Select(assign);
		select2.selectByVisibleText("VISIT");

		Thread.sleep(20000);
		WebElement leads = driver.findElement(
				By.xpath("//*[@id=\"DynamicUserViewPanel\"]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/h2"));
		System.out.println("Total  VISIT Lead" + leads.getText());
		driver.navigate().refresh();
	}

	public void notAnswerFilter() throws InterruptedException {
		WebElement assign = driver.findElement(By.xpath("//select[@name='ActivityType']"));
		Select select3 = new Select(assign);
		select3.selectByVisibleText("NOT ANSWERED");

		Thread.sleep(20000);
		WebElement leads = driver.findElement(
				By.xpath("//*[@id=\"DynamicUserViewPanel\"]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/h2"));
		System.out.println("Total  NOT ANSWERED Lead" + leads.getText());
		driver.navigate().refresh();
	}

	public void webinarAttendFilter() throws InterruptedException {
		WebElement assign = driver.findElement(By.xpath("//select[@name='WebinarStatus']"));
		Select select = new Select(assign);
		select.selectByVisibleText("Attend");
		Thread.sleep(20000);
		WebElement leads = driver.findElement(
				By.xpath("//*[@id=\"DynamicUserViewPanel\"]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/h2"));
		System.out.println("Total Attend Lead" + leads.getText());
		driver.navigate().refresh();
	}

	public void webinarNotAttendFilter() throws InterruptedException {
		WebElement assign = driver.findElement(By.xpath("//select[@name='WebinarStatus']"));
		Select select1 = new Select(assign);
		select1.selectByVisibleText("Not Attend");

		Thread.sleep(20000);
		WebElement leads = driver.findElement(
				By.xpath("//*[@id=\"DynamicUserViewPanel\"]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/h2"));
		System.out.println("Total Not Attend Lead" + leads.getText());
		Thread.sleep(5000);
		// driver.navigate().refresh();
	}

}
