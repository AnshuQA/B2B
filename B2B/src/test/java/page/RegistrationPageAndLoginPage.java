package page;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class RegistrationPageAndLoginPage extends BaseTest {
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void newEnpelmentLogin(String email, String password) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[1]/input"))
				.sendKeys(email);
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[2]/input"))
				.sendKeys(password);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

	}

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void addLreadDirectReg(String name, String email, String mobile) throws InterruptedException {
//Lets Connect
		driver.findElement(By.xpath("//span[contains(text(),\"Let's Connect\")]")).click();
		driver.findElement(By.id("txtname1")).sendKeys(name);
		driver.findElement(By.id("txtemail1")).sendKeys(email);
		driver.findElement(By.id("txtmobile1")).sendKeys(mobile);

		driver.findElement(By.xpath("//span[@id='btntxt1']")).click();
		String captchaVal = JOptionPane.showInputDialog("Please enter the Mobile OTP");
		// Thread.sleep(5000);
		driver.findElement(By.id("txtotp1")).sendKeys(captchaVal);
		// Thread.sleep(3000);
		driver.findElement(By.id("btnotpvalidate1")).click();

	}

	public void rachitLogin() {

		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[1]/input"))
				.sendKeys("rachit@fincart.com");
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[2]/input"))
				.sendKeys("fincart@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	}

	public void workpointSignOut() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
	}

	public void yusraLogin() {

		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[1]/input"))
				.sendKeys("yusra.wahab@fincart.com");
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[2]/input"))
				.sendKeys("fincart@1234");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	}

	public void himanshiLogin() {

		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[1]/input"))
				.sendKeys("himanshi.pal@fincart.com");
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[2]/input"))
				.sendKeys("Fincart@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	}

	public void logout() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Sign out']")).click();
	}

}
