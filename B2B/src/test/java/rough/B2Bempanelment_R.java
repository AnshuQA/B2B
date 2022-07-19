package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B2Bempanelment_R {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://workpoint.fincart.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[1]/input"))
				.sendKeys("himanshi.pal@fincart.com");
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[2]/input"))
				.sendKeys("Fincart@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
//B2B Enquery
		Thread.sleep(5000);
		driver.get("https://workpoint.fincart.com/b2b/empanelment");
		/*
		 * //Lead search Thread.sleep(9000);
		 * driver.findElement(By.id("ClientSearch")).sendKeys("Anshuman"); Actions
		 * actions1 = new Actions(driver); Thread.sleep(3000);
		 * actions1.sendKeys(Keys.ARROW_DOWN); actions1.sendKeys(Keys.ENTER);
		 * actions1.build().perform();
		 * driver.findElement(By.xpath("//input[@value='Search']")).click(); //Update
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//b[normalize-space()='Update']")).click();
		 */
// Record activity		
		/*
		 * Thread.sleep(3000); driver.findElement(By.id("record-activity")).click();
		 */
//NISM REGISTRATION
		/*
		 * WebElement assign = driver.findElement(By.id("webinarStatus")); Select select
		 * = new Select(assign); select.selectByVisibleText("Yes"); Thread.sleep(3000);
		 * Date dt = new Date(); Calendar calendar = Calendar.getInstance();
		 * calendar.setTime(dt); calendar.add(Calendar.DATE, 0); dt =
		 * calendar.getTime(); String tommorowsDate = new
		 * SimpleDateFormat("MM/dd/yyyy").format(dt); System.out.println(tommorowsDate);
		 * // this buttone may be unique Actions actions = new Actions(driver);
		 * actions.sendKeys(Keys.TAB); Thread.sleep(5000);
		 * actions.sendKeys(tommorowsDate); Thread.sleep(3000);
		 * actions.sendKeys(Keys.TAB); actions.sendKeys("04:00AM");
		 * actions.build().perform(); Thread.sleep(3000);
		 * driver.findElement(By.id("recordactivityreason")).
		 * sendKeys("Testing NISM REGISTRATION Yes"); Thread.sleep(3000);
		 * driver.findElement(By.xpath(
		 * "//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		 * Thread.sleep(5000); Actions actions2 = new Actions(driver);
		 * actions2.sendKeys(Keys.TAB); Thread.sleep(3000);
		 * actions2.sendKeys(Keys.ENTER); actions2.build().perform(); //NO //Update
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//b[normalize-space()='Update']")).click(); //
		 * Record activity Thread.sleep(3000);
		 * driver.findElement(By.id("record-activity")).click(); //NISM REGISTRATION
		 * assign = driver.findElement(By.id("webinarStatus")); Select select1 = new
		 * Select(assign); select1.selectByVisibleText("No"); Thread.sleep(3000);
		 * 
		 * Thread.sleep(3000); driver.findElement(By.id("recordactivityreason")).
		 * sendKeys("Testing NISM REGISTRATION Yes"); Thread.sleep(3000);
		 * driver.findElement(By.xpath(
		 * "//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		 * Thread.sleep(5000); // Actions actions2 = new Actions(driver);
		 * actions2.sendKeys(Keys.TAB); Thread.sleep(3000);
		 * actions2.sendKeys(Keys.ENTER); actions2.build().perform();
		 */
//NISM TRAINING	
		/*
		 * Thread.sleep(3000); driver.findElement(By.id("NISM TRAINING")).click();
		 * WebElement assign = driver.findElement(By.id("webinarStatus")); Select select
		 * = new Select(assign); select.selectByVisibleText("Yes"); Thread.sleep(3000);
		 * Date dt = new Date(); Calendar calendar = Calendar.getInstance();
		 * calendar.setTime(dt); calendar.add(Calendar.DATE, 0); dt =
		 * calendar.getTime(); String tommorowsDate = new
		 * SimpleDateFormat("MM/dd/yyyy").format(dt); System.out.println(tommorowsDate);
		 * // this buttone may be unique Actions actions = new Actions(driver);
		 * actions.sendKeys(Keys.TAB); Thread.sleep(5000);
		 * actions.sendKeys(tommorowsDate); Thread.sleep(3000);
		 * actions.sendKeys(Keys.TAB); actions.sendKeys("04:00AM");
		 * actions.build().perform(); Thread.sleep(3000);
		 * driver.findElement(By.id("recordactivityreason")).
		 * sendKeys("Testing NISM TRAINING Yes"); Thread.sleep(3000);
		 * driver.findElement(By.xpath(
		 * "//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		 * Thread.sleep(5000); Actions actions2 = new Actions(driver);
		 * actions2.sendKeys(Keys.TAB); Thread.sleep(3000);
		 * actions2.sendKeys(Keys.ENTER); actions2.build().perform(); //NO //Update
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//b[normalize-space()='Update']")).click(); //
		 * Record activity Thread.sleep(3000);
		 * driver.findElement(By.id("record-activity")).click(); //NISM REGISTRATION
		 * Thread.sleep(3000); driver.findElement(By.id("NISM TRAINING")).click();
		 * assign = driver.findElement(By.id("webinarStatus")); Select select1 = new
		 * Select(assign); select1.selectByVisibleText("No"); Thread.sleep(3000);
		 * 
		 * Thread.sleep(3000); driver.findElement(By.id("recordactivityreason")).
		 * sendKeys("Testing NISM TRAINING No"); Thread.sleep(3000);
		 * driver.findElement(By.xpath(
		 * "//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		 * Thread.sleep(5000); // Actions actions2 = new Actions(driver);
		 * actions2.sendKeys(Keys.TAB); Thread.sleep(3000);
		 * actions2.sendKeys(Keys.ENTER); actions2.build().perform();
		 */
//NISM EXAM

		/*
		 * Thread.sleep(3000); driver.findElement(By.id("NISM EXAM")).click();
		 * WebElement assign = driver.findElement(By.id("webinarStatus")); Select select
		 * = new Select(assign); select.selectByVisibleText("Yes"); Thread.sleep(3000);
		 * Date dt = new Date(); Calendar calendar = Calendar.getInstance();
		 * calendar.setTime(dt); calendar.add(Calendar.DATE, 0); dt =
		 * calendar.getTime(); String tommorowsDate = new
		 * SimpleDateFormat("MM/dd/yyyy").format(dt); System.out.println(tommorowsDate);
		 * // this buttone may be unique Actions actions = new Actions(driver);
		 * actions.sendKeys(Keys.TAB); Thread.sleep(5000);
		 * actions.sendKeys(tommorowsDate); Thread.sleep(3000);
		 * actions.sendKeys(Keys.TAB); actions.sendKeys("04:00AM");
		 * actions.build().perform(); Thread.sleep(3000);
		 * driver.findElement(By.id("recordactivityreason")).
		 * sendKeys("Testing NISM EXAM Yes"); Thread.sleep(3000);
		 * driver.findElement(By.xpath(
		 * "//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		 * Thread.sleep(5000); Actions actions2 = new Actions(driver);
		 * actions2.sendKeys(Keys.TAB); Thread.sleep(3000);
		 * actions2.sendKeys(Keys.ENTER); actions2.build().perform(); // NO //Update
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//b[normalize-space()='Update']")).click(); //
		 * // Record activity Thread.sleep(3000);
		 * driver.findElement(By.id("record-activity")).click(); // NISM REGISTRATION
		 * Thread.sleep(3000); driver.findElement(By.id("NISM EXAM")).click(); assign =
		 * driver.findElement(By.id("webinarStatus")); Select select1 = new
		 * Select(assign); select1.selectByVisibleText("No");
		 * 
		 * Thread.sleep(3000); driver.findElement(By.id("recordactivityreason")).
		 * sendKeys("Testing NISM EXAM No"); Thread.sleep(3000);
		 * driver.findElement(By.xpath(
		 * "//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		 * Thread.sleep(5000); // Actions actions2 = new Actions(driver);
		 * actions2.sendKeys(Keys.TAB); Thread.sleep(3000);
		 * actions2.sendKeys(Keys.ENTER); actions2.build().perform();
		 */
//NISM EXAM Clear
		/*
		 * Thread.sleep(5000);
		 * driver.findElement(By.xpath("//label[normalize-space()='NISM EXAM CLEAR']")).
		 * click(); WebElement assign = driver.findElement(By.id("webinarStatus"));
		 * Select select = new Select(assign); select.selectByVisibleText("Yes");
		 * Thread.sleep(3000); Date dt = new Date(); Calendar calendar =
		 * Calendar.getInstance(); calendar.setTime(dt); calendar.add(Calendar.DATE, 0);
		 * dt = calendar.getTime(); String tommorowsDate = new
		 * SimpleDateFormat("MM/dd/yyyy").format(dt); System.out.println(tommorowsDate);
		 * // this buttone may be unique Actions actions = new Actions(driver);
		 * actions.sendKeys(Keys.TAB); Thread.sleep(5000);
		 * actions.sendKeys(tommorowsDate); Thread.sleep(3000);
		 * actions.sendKeys(Keys.TAB); actions.sendKeys("04:00AM");
		 * actions.build().perform(); Thread.sleep(3000);
		 * driver.findElement(By.id("recordactivityreason")).
		 * sendKeys("Testing NISM EXAM CLEAR Yes"); Thread.sleep(3000);
		 * driver.findElement(By.xpath(
		 * "//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		 * Thread.sleep(5000); Actions actions2 = new Actions(driver);
		 * actions2.sendKeys(Keys.TAB); Thread.sleep(3000);
		 * actions2.sendKeys(Keys.ENTER); actions2.build().perform(); // NO //Update
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//b[normalize-space()='Update']")).click(); //
		 * // Record activity Thread.sleep(3000);
		 * driver.findElement(By.id("record-activity")).click(); // NISM REGISTRATION
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//label[normalize-space()='NISM EXAM CLEAR']")).
		 * click(); assign = driver.findElement(By.id("webinarStatus")); Select select1
		 * = new Select(assign); select1.selectByVisibleText("No");
		 * 
		 * Thread.sleep(3000); driver.findElement(By.id("recordactivityreason")).
		 * sendKeys("Testing NISM EXAM CLEAR No"); Thread.sleep(3000);
		 * driver.findElement(By.xpath(
		 * "//form[@id='recordActivityStatus']//input[@value='SAVE']")).click();
		 * Thread.sleep(5000); // Actions actions2 = new Actions(driver);
		 * actions2.sendKeys(Keys.TAB); Thread.sleep(3000);
		 * actions2.sendKeys(Keys.ENTER); actions2.build().perform();
		 */
//********************************Basic Tranning *****************************************************

		/*
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("record-webinar-activity")).click();
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "//form[@id='recordWebinarActivityStatus']//select[@id='webinarStatus']")).
		 * click(); Actions actions = new Actions(driver);
		 * actions.sendKeys(Keys.ARROW_DOWN); actions.sendKeys(Keys.ENTER); Date dt =
		 * new Date(); Calendar calendar = Calendar.getInstance(); calendar.setTime(dt);
		 * calendar.add(Calendar.DATE, 0); dt = calendar.getTime(); String tommorowsDate
		 * = new SimpleDateFormat("MM/dd/yyyy").format(dt);
		 * System.out.println(tommorowsDate); // this buttone may be unique // //
		 * Actions actions = new Actions(driver); actions.sendKeys(Keys.TAB);
		 * Thread.sleep(5000); actions.sendKeys(tommorowsDate); Thread.sleep(3000);
		 * actions.sendKeys(Keys.TAB); actions.sendKeys("04:00AM");
		 * actions.build().perform(); Thread.sleep(3000); driver.findElement(By.xpath(
		 * "//form[@id='recordWebinarActivityStatus']//textarea[@id='recordactivityreason']"
		 * )) .sendKeys("Testing basic tranning Yes"); Thread.sleep(3000);
		 * driver.findElement(By.xpath(
		 * "//form[@id='recordWebinarActivityStatus']//input[@value='SAVE']")).click();
		 * Thread.sleep(5000); Actions actions2 = new Actions(driver);
		 * actions2.sendKeys(Keys.TAB); Thread.sleep(3000);
		 * actions2.sendKeys(Keys.ENTER);
		 * 
		 * actions2.build().perform();
		 * 
		 * // NO //Update
		 * 
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//b[normalize-space()='Update']")).click();
		 * 
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("record-webinar-activity")).click();
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "//form[@id='recordWebinarActivityStatus']//select[@id='webinarStatus']")).
		 * click(); // Actions actions = new Actions(driver);
		 * 
		 * actions.sendKeys(Keys.ARROW_DOWN);
		 * 
		 * actions.sendKeys(Keys.ARROW_DOWN);
		 * 
		 * actions.sendKeys(Keys.ENTER); actions.build().perform();
		 * 
		 * driver.findElement(By.xpath(
		 * "//form[@id='recordWebinarActivityStatus']//textarea[@id='recordactivityreason']"
		 * )) .sendKeys("Testing basic tranning No"); Thread.sleep(3000);
		 * driver.findElement(By.xpath(
		 * "//form[@id='recordWebinarActivityStatus']//input[@value='SAVE']")).click();
		 * Thread.sleep(5000); // Actions actions2 = new Actions(driver);
		 * actions.sendKeys(Keys.TAB); Thread.sleep(3000); actions.sendKeys(Keys.ENTER);
		 * actions.build().perform();
		 */
//*********************************************Search Filter*****************************
//Date Filter

		Thread.sleep(15000);
		/*
		 * SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY"); Date dt = new
		 * Date(); Calendar cl = Calendar.getInstance(); cl.setTime(dt); ;
		 * cl.add(Calendar.DAY_OF_YEAR, -30); dt = cl.getTime(); String str =
		 * df.format(dt); ; WebElement date = driver.findElement(By.id("FromDate"));
		 * date.clear(); date.sendKeys(str); Thread.sleep(3000);
		 * driver.findElement(By.id("ToDate")).click(); Actions actions2 = new
		 * Actions(driver); actions2.sendKeys(Keys.SPACE); Thread.sleep(3000);
		 * actions2.sendKeys(Keys.ENTER); actions2.build().perform();
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@value='Search']")).click();
		 * Thread.sleep(6000); WebElement leads =
		 * driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		 * System.out.println("Last 1 Month Total Leads" + leads.getText());
		 * driver.navigate().refresh();
		 */

//ARN Filter
		/*
		 * driver.findElement(By.id("ArnNO")).sendKeys("788"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@value='Search']")).click();
		 * Thread.sleep(5000); String email = "Email: testb2b9jun22@gmail.com"; String
		 * arn = "ARN No.:ARN-788"; String bodyName =
		 * driver.findElement(By.tagName("body")).getText();
		 * Assert.assertTrue(bodyName.contains(arn));
		 * Assert.assertTrue(bodyName.contains(email)); driver.navigate().refresh();
		 */
//NISM Register Filter
		/*
		 * WebElement assign =
		 * driver.findElement(By.xpath("//select[@name='ActivityType']")); Select select
		 * = new Select(assign); select.selectByVisibleText("Register");
		 * Thread.sleep(6000); WebElement leads =
		 * driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		 * System.out.println("NISM Register Total count" + leads.getText()); //Not
		 * Register Thread.sleep(4000); assign =
		 * driver.findElement(By.xpath("//select[@name='ActivityType']")); select = new
		 * Select(assign); select.selectByVisibleText("Not Register");
		 * Thread.sleep(10000); leads =
		 * driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		 * System.out.println("NISM Not Register Total count" + leads.getText());
		 */
//Stages

		/*
		 * WebElement assign =
		 * driver.findElement(By.xpath("//select[@name='StageType']")); Select select =
		 * new Select(assign); select.selectByVisibleText("NISM EXAM");
		 * Thread.sleep(10000); WebElement leads =
		 * driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		 * System.out.println("NISM EXAM Total count" + leads.getText()); // ARN HOLDER
		 * Thread.sleep(4000); assign =
		 * driver.findElement(By.xpath("//select[@name='StageType']")); select = new
		 * Select(assign); select.selectByVisibleText("ARN HOLDER");
		 * Thread.sleep(10000); leads =
		 * driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		 * System.out.println("ARN HOLDER Total count" + leads.getText()); // CODE
		 * GENERATED Thread.sleep(4000); assign =
		 * driver.findElement(By.xpath("//select[@name='StageType']")); select = new
		 * Select(assign); select.selectByVisibleText("CODE GENERATED");
		 * Thread.sleep(10000); leads =
		 * driver.findElement(By.xpath("//h2[@class='my-list']//span[1]"));
		 * System.out.println("CODE GENERATED Total count" + leads.getText());
		 * driver.navigate().refresh();
		 */
//Status

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
