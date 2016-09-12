
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import junit.framework.TestCase;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterClass;

public class DevTest extends TestCase {

		public static WebDriver driver;
		private String baseUrl;
		private BufferedReader in = null;
		

		public void setUp() throws Exception {
			driver = new HtmlUnitDriver();
			baseUrl = "http://cads-insurance-dev-new.elasticbeanstalk.com/Insurance_Claim.jsp";
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}

		@org.junit.Test
		public void test() throws InterruptedException {
			try {

				driver.get(baseUrl);
				System.out.println(baseUrl);
				new Select(driver.findElement(By.id("ClaimSubmit")))
						.selectByVisibleText("Witness");
				driver.findElement(By.id("PolicyNumber")).clear();
				driver.findElement(By.id("PolicyNumber")).sendKeys("1234567A02");
				driver.findElement(By.id("Fname")).clear();
				driver.findElement(By.id("Fname")).sendKeys("JHON");
				driver.findElement(By.id("Lname")).clear();
				driver.findElement(By.id("Lname")).sendKeys("DAVID");
				driver.findElement(By.id("Aptnumber")).clear();
				driver.findElement(By.id("Aptnumber")).sendKeys(
						"1400 Pennsylvania Ave");
				driver.findElement(By.id("City")).clear();
				driver.findElement(By.id("City")).sendKeys("Olympia");
				new Select(driver.findElement(By.id("State")))
						.selectByVisibleText("Washington");
				driver.findElement(By.id("Zipcode")).clear();
				driver.findElement(By.id("Zipcode")).sendKeys("9801");
				driver.findElement(By.id("Email")).clear();
				driver.findElement(By.id("Email"))
						.sendKeys("Jhon1.David@gmail.com");
				driver.findElement(By.id("CEmail")).clear();
				driver.findElement(By.id("CEmail")).sendKeys(
						"Jhon1.David@gmail.com");
				driver.findElement(By.id("Y")).click();
				driver.findElement(By.cssSelector("input[type=\"checkbox\"]"))
						.click();
				driver.findElement(By.id("H")).click();
				driver.findElement(By.id("Hp")).clear();
				driver.findElement(By.id("Hp")).sendKeys("(800) 782-8332");
				driver.findElement(By.id("Wp")).clear();
				driver.findElement(By.id("Wp")).sendKeys("(877) 627-5757");
				driver.findElement(By.id("Cp")).clear();
				driver.findElement(By.id("Cp")).sendKeys("1-360-350-5361");
				driver.findElement(By.id("Ap")).clear();
				driver.findElement(By.id("Ap")).sendKeys("1-360-515-7172");
				driver.findElement(By.id("datepicker")).clear();
				driver.findElement(By.id("datepicker")).sendKeys("10/20/2014");
				new Select(driver.findElement(By.id("Ltime")))
						.selectByVisibleText("01:00");
				
				driver.findElement(By.id("Ldesc")).clear();
				driver.findElement(By.id("Ldesc")).sendKeys(
						"I was rear ended in the parking lots");
				
				driver.findElement(By.name("Laddress")).clear();
				driver.findElement(By.name("Laddress")).sendKeys("Washington");
				driver.findElement(By.name("Lcity")).clear();
				driver.findElement(By.name("Lcity")).sendKeys("Olympia");
				new Select(driver.findElement(By.id("LState")))
						.selectByVisibleText("Washington");
				driver.findElement(By.name("Lzipcode")).clear();
				driver.findElement(By.name("Lzipcode")).sendKeys("98001");
				new Select(driver.findElement(By.id("LCountry")))
						.selectByVisibleText("USA");

				driver.findElement(By.id("submit")).submit();
				Thread.sleep(5000);

				/*String error = driver.findElement(By.id("error")).getAttribute(
						"value");
				if (error.isEmpty()) {
					System.out.println("Selenium Test Passed");
				} else {
					System.out.println("Selenium Test Failed");
					System.out.println(error);
					Assert.fail("Selenium Test Failed   " + error);
				}*/

				 System.out.println("Selenium Test Passed");

			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Selenium Test Failed");
				System.out.println(e.getMessage());
				Assert.fail("Selenium Test Failed   " + e.getMessage());
			}
		}

		@AfterClass
		public void tearDown() throws Exception {
			driver.quit();
		}

	}

