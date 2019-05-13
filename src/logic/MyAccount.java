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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import webelements.WebElements;

public class MyAccount {

	Properties prop = new Properties();
	InputStream input = null;

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	Markup m;
	WebElements wle;
	public WebDriver driver;
	public String baseURL = "";
	public static boolean isJackJones;
	public static Boolean bool1 = new Boolean(true);
	public static Boolean bool2 = new Boolean(false);

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
		Thread.sleep(3000);
		wle.MAccount();
	}
}