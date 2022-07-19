package page;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.BaseTest;

public class B2Bempanelment extends BaseTest {

	public void enpanelmentBtn() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://workpoint.fincart.com/b2b/empanelment");
	}

	public void updateBtn() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("//b[normalize-space()='Update']")).click();
	}

	public void recordActivityBtn() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.id("record-activity")).click();
	}

	public void nismRegistration() throws InterruptedException {

		WebElement assign = driver.findElement(By.id("webinarStatus"));
		Select select = new Select(assign);
		select.selectByVisibleText("Yes");
		Thread.sleep(3000);
		Date dt = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.DATE, 0);
		dt = calendar.getTime();
		String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(dt);
		System.out.println(tommorowsDate);
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
		driver.findElement(By.id("recordactivityreason")).sendKeys("Testing NISM REGISTRATION Yes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		Thread.sleep(5000);
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform();

		// NO
//Update		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//b[normalize-space()='Update']")).click();
//Record Activity
		Thread.sleep(3000);
		driver.findElement(By.id("record-activity")).click();

		// NISM REGISTRATION
		assign = driver.findElement(By.id("webinarStatus"));
		Select select1 = new Select(assign);
		select1.selectByVisibleText("No");
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.findElement(By.id("recordactivityreason")).sendKeys("Testing NISM REGISTRATION Yes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		Thread.sleep(5000);
		actions2.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform();

	}

	public void nismExamTranning() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("NISM TRAINING")).click();
		WebElement assign = driver.findElement(By.id("webinarStatus"));
		Select select = new Select(assign);
		select.selectByVisibleText("Yes");
		Thread.sleep(3000);
		Date dt = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.DATE, 0);
		dt = calendar.getTime();
		String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(dt);
		System.out.println(tommorowsDate);
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
		driver.findElement(By.id("recordactivityreason")).sendKeys("Testing NISM TRAINING Yes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		Thread.sleep(5000);
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform(); // NO //Update
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[normalize-space()='Update']")).click();

		// Record activity
		Thread.sleep(3000);
		driver.findElement(By.id("record-activity")).click();
		// NISM REGISTRATION
		Thread.sleep(3000);
		driver.findElement(By.id("NISM TRAINING")).click();
		assign = driver.findElement(By.id("webinarStatus"));
		Select select1 = new Select(assign);
		select1.selectByVisibleText("No");
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.findElement(By.id("recordactivityreason")).sendKeys("Testing NISM TRAINING No");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		Thread.sleep(5000);
		actions2.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform();

	}

	public void nismExam() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.id("NISM EXAM")).click();
		WebElement assign = driver.findElement(By.id("webinarStatus"));
		Select select = new Select(assign);
		select.selectByVisibleText("Yes");
		Thread.sleep(3000);
		Date dt = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.DATE, 0);
		dt = calendar.getTime();
		String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(dt);
		System.out.println(tommorowsDate);
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
		driver.findElement(By.id("recordactivityreason")).sendKeys("Testing NISM EXAM Yes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		Thread.sleep(5000);
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform(); // NO //Update
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[normalize-space()='Update']")).click();
		// Record activity
		Thread.sleep(3000);
		driver.findElement(By.id("record-activity")).click(); // NISM REGISTRATION
		Thread.sleep(3000);
		driver.findElement(By.id("NISM EXAM")).click();
		assign = driver.findElement(By.id("webinarStatus"));
		Select select1 = new Select(assign);
		select1.selectByVisibleText("No");

		Thread.sleep(3000);
		driver.findElement(By.id("recordactivityreason")).sendKeys("Testing NISM EXAM No");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		Thread.sleep(5000); // Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform();

	}

	public void nismExamClear() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[normalize-space()='NISM EXAM CLEAR']")).click();
		WebElement assign = driver.findElement(By.id("webinarStatus"));
		Select select = new Select(assign);
		select.selectByVisibleText("Yes");
		Thread.sleep(3000);
		Date dt = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.DATE, 0);
		dt = calendar.getTime();
		String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(dt);
		System.out.println(tommorowsDate);
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
		driver.findElement(By.id("recordactivityreason")).sendKeys("Testing NISM EXAM CLEAR Yes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		Thread.sleep(5000);
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform();
		// NO //Update
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[normalize-space()='Update']")).click(); //
		// Record activity
		Thread.sleep(3000);
		driver.findElement(By.id("record-activity")).click();
		// NISM REGISTRATION
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[normalize-space()='NISM EXAM CLEAR']")).click();
		assign = driver.findElement(By.id("webinarStatus"));
		Select select1 = new Select(assign);
		select1.selectByVisibleText("No");

		Thread.sleep(3000);
		driver.findElement(By.id("recordactivityreason")).sendKeys("Testing NISM EXAM CLEAR No");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		Thread.sleep(5000);

		actions2.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform();
	}

	public void basicTranning() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("record-webinar-activity")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordWebinarActivityStatus']//select[@id='webinarStatus']")).click();
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ENTER);
		Date dt = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.DATE, 0);
		dt = calendar.getTime();
		String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(dt);
		System.out.println(tommorowsDate); // this buttone may be unique //
		// Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		actions.sendKeys(tommorowsDate);
		Thread.sleep(3000);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("04:00AM");
		actions.build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordWebinarActivityStatus']//textarea[@id='recordactivityreason']"))
				.sendKeys("Testing basic tranning Yes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordWebinarActivityStatus']//input[@value='SAVE']")).click();
		Thread.sleep(5000);
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		actions2.sendKeys(Keys.ENTER);

		actions2.build().perform();

		// NO //Update

		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[normalize-space()='Update']")).click();

		Thread.sleep(3000);
		driver.findElement(By.id("record-webinar-activity")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordWebinarActivityStatus']//select[@id='webinarStatus']")).click();
		// Actions actions = new Actions(driver);

		actions.sendKeys(Keys.ARROW_DOWN);

		actions.sendKeys(Keys.ARROW_DOWN);

		actions.sendKeys(Keys.ENTER);
		actions.build().perform();

		driver.findElement(By.xpath("//form[@id='recordWebinarActivityStatus']//textarea[@id='recordactivityreason']"))
				.sendKeys("Testing basic tranning No");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='recordWebinarActivityStatus']//input[@value='SAVE']")).click();
		Thread.sleep(5000);
		// Actions actions2 = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
		Thread.sleep(4000);
		driver.navigate().refresh();

	}

	public void dateWiseFilter() throws InterruptedException {
		Thread.sleep(15000);

		SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY");
		Date dt = new Date();
		Calendar cl = Calendar.getInstance();
		cl.setTime(dt);
		;
		cl.add(Calendar.DAY_OF_YEAR, -30);
		dt = cl.getTime();
		String str = df.format(dt);
		;
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
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(6000);
		WebElement leads = driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		System.out.println("Last 1 Month Total Leads" + leads.getText());
		driver.navigate().refresh();

	}

	public void arnWiseFilter() throws InterruptedException {

		driver.findElement(By.id("ArnNO")).sendKeys("788");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(5000);
		String email = "Email: testb2b9jun22@gmail.com";
		String arn = "ARN No.:ARN-788";
		String bodyName = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue(bodyName.contains(arn));
		Assert.assertTrue(bodyName.contains(email));
		driver.navigate().refresh();
	}

	public void nismWiseFilter() throws InterruptedException {

		WebElement assign = driver.findElement(By.xpath("//select[@name='ActivityType']"));
		Select select = new Select(assign);
		select.selectByVisibleText("Register");
		Thread.sleep(6000);
		WebElement leads = driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		System.out.println("NISM Register Total count" + leads.getText());
		// Not Register
		Thread.sleep(4000);
		assign = driver.findElement(By.xpath("//select[@name='ActivityType']"));
		select = new Select(assign);
		select.selectByVisibleText("Not Register");
		Thread.sleep(10000);
		leads = driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		System.out.println("NISM Not Register Total count" + leads.getText());

	}

	public void stagesWiseFilter() throws InterruptedException {

		WebElement assign = driver.findElement(By.xpath("//select[@name='StageType']"));
		Select select = new Select(assign);
		select.selectByVisibleText("NISM EXAM");
		Thread.sleep(10000);
		WebElement leads = driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		System.out.println("NISM EXAM Total count" + leads.getText()); // ARN HOLDER
		Thread.sleep(4000);
		assign = driver.findElement(By.xpath("//select[@name='StageType']"));
		select = new Select(assign);
		select.selectByVisibleText("ARN HOLDER");
		Thread.sleep(10000);
		leads = driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		System.out.println("ARN HOLDER Total count" + leads.getText());
		// CODE GENERATED
		Thread.sleep(4000);
		assign = driver.findElement(By.xpath("//select[@name='StageType']"));
		select = new Select(assign);
		select.selectByVisibleText("CODE GENERATED");
		Thread.sleep(10000);
		leads = driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		System.out.println("CODE GENERATED Total count" + leads.getText());
		driver.navigate().refresh();

	}

	public void statusWiseFilter() throws InterruptedException {
		WebElement assign = driver.findElement(By.xpath("//select[@name='Status']"));
		Select select = new Select(assign);
		select.selectByVisibleText("Reject");
		Thread.sleep(10000);
		WebElement leads = driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		System.out.println("Reject Total count" + leads.getText());
		// Move Back To Pending
		Thread.sleep(4000);
		assign = driver.findElement(By.xpath("//select[@name='Status']"));
		select = new Select(assign);
		select.selectByVisibleText("Move Back To Pending");
		Thread.sleep(10000);
		leads = driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		System.out.println("Move Back To Pending Total count" + leads.getText());
		// Approve
		Thread.sleep(4000);
		assign = driver.findElement(By.xpath("//select[@name='Status']"));
		select = new Select(assign);
		select.selectByVisibleText("Approve");
		Thread.sleep(10000);
		leads = driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		System.out.println("Approve Total count" + leads.getText());
		driver.navigate().refresh();
// In Review
		Thread.sleep(4000);
		assign = driver.findElement(By.xpath("//select[@name='Status']"));
		select = new Select(assign);
		select.selectByVisibleText("In Review");
		Thread.sleep(10000);
		leads = driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		System.out.println("In Review Total count" + leads.getText());
		driver.navigate().refresh();

	}
}
