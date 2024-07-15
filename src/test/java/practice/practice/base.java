package practice.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class base {

	public static WebDriver driver;
	@BeforeClass
	public void setup() throws InterruptedException
	{
		driver = new EdgeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement account_name= driver.findElement(By.xpath("//a[@id='id_l']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", account_name);
		Thread.sleep(2000);
		WebElement btnSignout = driver.findElement(By.xpath("//*[contains(text(),'Sign out')]/.."));
		btnSignout.click();
		Thread.sleep(5000);
		WebElement btnSignIn = driver.findElement(By.xpath("//*[contains(text(),'Sign in')]/.."));
		btnSignIn.click();
		Thread.sleep(3000);
		WebElement btnLogin = driver.findElement(By.xpath("//*[contains(text(),'personal account')]/.."));
		btnLogin.click();
		Thread.sleep(6000);
		WebElement txtEmail = driver.findElement(By.xpath("//input[@name='loginfmt']"));
		txtEmail.sendKeys("lavieetwo@outlook.com",Keys.ENTER);
		Thread.sleep(2000);
		WebElement txtPassword = driver.findElement(By.xpath("//input[@name=\"passwd\"]"));
		txtPassword.sendKeys("Lavanya@2",Keys.ENTER);
		Thread.sleep(2000);
		WebElement btnyes = driver.findElement(By.xpath("//button[@type='submit']"));
		btnyes.click();
		Thread.sleep(4000);
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
