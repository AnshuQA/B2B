package rough;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistraionPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://fincartassociate.com/B2BLanding.html?t=570b7ee2-a212-4b2b-a05f-8f609cfb19d4");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//Lets Connect
		driver.findElement(By.xpath("//span[contains(text(),\"Let's Connect\")]")).click();
		driver.findElement(By.id("txtname1")).sendKeys("Anshuman Test");
		driver.findElement(By.id("txtemail1")).sendKeys("testautomation24jun22@gmail.com");
		driver.findElement(By.id("txtmobile1")).sendKeys("6666666660");

		driver.findElement(By.xpath("//span[@id='btntxt1']")).click();
		String captchaVal = JOptionPane.showInputDialog("Please enter the Mobile OTP");
		// Thread.sleep(5000);
		driver.findElement(By.id("txtotp1")).sendKeys(captchaVal);
		// Thread.sleep(3000);
		driver.findElement(By.id("btnotpvalidate1")).click();

		/*
		 * driver.findElement( By.xpath(
		 * "/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[1]/input"
		 * )) .sendKeys("testb2b20may22@gmail.com"); driver.findElement( By.xpath(
		 * "/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[2]/input"
		 * )) .sendKeys("$8K5uu");
		 * driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		 * 
		 * //Empanelment Details // Do you have ARN -No
		 * 
		 * //Basic Details Thread.sleep(3000); WebElement dropdown =
		 * driver.findElement(By.id("TaxStatus")); Select select = new Select(dropdown);
		 * select.selectByValue("1"); Thread.sleep(3000);
		 * driver.findElement(By.id("OfficeLocation")).sendKeys(Keys.PAGE_DOWN);
		 * driver.findElement(By.id("DOB")).sendKeys("07/10/1996");
		 * driver.findElement(By.id("PanNumber")).sendKeys("TNEPT4647K");
		 * driver.findElement(By.id("education")).sendKeys("B Tech");
		 * driver.findElement(By.id("contactPersonName")).sendKeys("Test Contact Person"
		 * ); driver.findElement(By.id("ContactPersonMobile")).sendKeys("9718205589");
		 * driver.findElement(By.id("Occupation")).sendKeys("Private Sector");
		 * driver.findElement(By.id("OfficeLocation")).sendKeys("Noida");
		 * Thread.sleep(3000); WebElement OfficeSetup =
		 * driver.findElement(By.id("OfficeSetUp")); Select setup = new
		 * Select(OfficeSetup); setup.selectByValue("1"); Thread.sleep(3000); WebElement
		 * InsuranceCompanyEmpanelment =
		 * driver.findElement(By.id("InsuranceCompanyEmpanelment")); Select empanelment
		 * = new Select(InsuranceCompanyEmpanelment); empanelment.selectByValue("0");
		 */
	}

}
