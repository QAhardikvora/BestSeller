package logic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import webelements.WebElements;

public class Footers {

	Properties prop = new Properties();
	InputStream input = null;

	WebElements wle;
	public WebDriver driver;

	@BeforeTest
	@Parameters({ "browser1", "URL" })
	public void setup(String browser1, String URL) throws Exception {
		try {
			input = new FileInputStream("./Assets.properties");
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (input != null) {
			try {
				input.close();
			} catch (Exception e) {
				System.out.println("Properties method caught - " + e.getMessage());
			}
		}

		if (browser1.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./jars/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser1.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Jars/chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (browser1.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver", "./jars/IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}

		else {
			// If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String baseUrl;

		if (URL.equalsIgnoreCase("https://www.only.in/")) {
			baseUrl = "https://www.only.in/";
			driver.navigate().to(baseUrl);
			driver.manage().window().maximize();
		}

		else if (URL.equalsIgnoreCase("https://www.veromoda.in/")) {
			baseUrl = "https://www.veromoda.in/";
			driver.navigate().to(baseUrl);
			driver.manage().window().maximize();
		}

		else if (URL.equalsIgnoreCase("https://www.jackjones.in/")) {
			baseUrl = "https://www.jackjones.in/";
			driver.navigate().to(baseUrl);
			driver.manage().window().maximize();
		} else {
			System.out.println("Invalid URL");
		}

	}

	@Test
	public void register() throws Exception {
		wle = new WebElements(driver);
		wle.login();
		Thread.sleep(5000);
		wle.aboutUS();
		Thread.sleep(5000);
		// About US

		String actualAboutus = driver.getCurrentUrl();
		System.out.println(actualAboutus);
		String expectedAboutus = "https://www.only.in/about_us_only";

		if (actualAboutus == expectedAboutus) {
			System.out.println("About Us URL is correct");
		}
		Assert.assertEquals("Not a correct URL", expectedAboutus, actualAboutus);
		Thread.sleep(3000);
		wle.takeScreenshot("About US");

		Thread.sleep(3000);
		// FAQ

		wle.clickFAQ();
		String actualFAQ = driver.getCurrentUrl();
		String expectedFAQ = "https://www.only.in/faq-only";

		if (actualFAQ == expectedFAQ) {
			System.out.println("FAQ URL is correct");
		}
		Assert.assertEquals("Not a correct URL", actualFAQ, expectedFAQ);

		Thread.sleep(3000);
		wle.takeScreenshot("FAQ");

		Thread.sleep(3000);

		//
		wle.clickPrivacy();
		String actualpr = driver.getCurrentUrl();
		String expectedpr = "https://www.only.in/privacy-policy-only";

		if (actualpr == expectedpr) {
			System.out.println("About Us URL is correct");
		}
		Assert.assertEquals("Not a correct URL", actualpr, expectedpr);
		Thread.sleep(3000);
		wle.takeScreenshot("Privacy");

	}

}
