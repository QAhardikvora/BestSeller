package webelements;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebElements {

	public WebDriver d;

	public WebElements(WebDriver driver) {
		d = driver;
		PageFactory.initElements(d, this);
	}

	@FindBy(xpath = "(//A[@href='#social-login-popup'][text()='Sign Up'][text()='Sign Up'])[1]")
	private WebElement sociallogin;

	@FindBy(id = "firstname")
	private WebElement firstname;

	@FindBy(id = "lastname")
	private WebElement lastname;

	@FindBy(id = "email_address_create")
	private WebElement mail;

	@FindBy(id = "dob")
	private WebElement dob;

	@FindBy(id = "password-social")
	private WebElement pass;

	@FindBy(id = "password-confirmation-social")
	private WebElement cpass;

	@FindBy(id = "mobile_number")
	private WebElement mob;

	@FindBy(id = "button-create-social")
	private WebElement submit;

	/* @FindBy(xpath="/html/body/div[1]/header/div[1]/div/ul/li[2]/a") */

	@FindBy(xpath = "//li[@class='authorization-link']")
	private WebElement log;

	@FindBy(id = "social_login_email")
	private WebElement elog;

	@FindBy(id = "social_login_pass")
	private WebElement epass;

	@FindBy(id = "bnt-social-login-authentication")
	private WebElement esub;

	@FindBy(xpath = "(//SPAN[text()='Hi, Pooja Borde'])[1]")
	private WebElement uname;

	@FindBy(xpath = "//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")
	private WebElement madd;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[10]/div[2]/div/div/ol/li/div/a[1]/span")
	private WebElement editAdd;

	@FindBy(xpath = "/html/body/div/header/div[1]/div/ul/li[1]/div/ul/li[1]/a")
	private WebElement myacc;

	@FindBy(id = "telephone")
	private WebElement tel;

	@FindBy(id = "street_1")
	private WebElement street1;

	@FindBy(id = "zip")
	private WebElement zc;

	@FindBy(id = "save-address-submit")
	private WebElement saveadd;

	@FindBy(xpath = "//SPAN[@data-action='toggle-nav']")
	private WebElement tog;

	@FindBy(xpath = "//SPAN[text()='New In']")
	private WebElement newin;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div/div[5]/div/div[1]/div[2]/a/img")
	private WebElement jnew;

	@FindBy(xpath = "//*[@id=\"ui-id-27\"]/span")
	private WebElement acc;

	@FindBy(xpath = "(//SPAN[text()='Jeans'][text()='Jeans'])[1]")
	private WebElement jean;

	@FindBy(xpath = "//div[@id='amasty-shopby-product-list']//div[@class='toolbar-sorter sorter']")
	private WebElement highlow;

	@FindBy(xpath = "//*[@id=\"amasty-shopby-product-list\"]/div[1]/div[1]/div/ul/li[4]")
	private WebElement hl;

	@FindBy(xpath = "//div[@data-role='title'][text()='Category']")
	private WebElement cat;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ul/form/li[1]/a/span[1]")
	private WebElement jeans;

	@FindBy(xpath = "(//IMG[@class='product-image-photo lazy'])[2]")
	private WebElement img;

	@FindBy(xpath = "//*[@id='amasty-shopby-product-list']/div[3]/ol/li[1]/div/a/span/span/img")
	private WebElement prod;

	@FindBy(xpath = "//*[@id=\"option-label-size-144-item-1304\"]")
	private WebElement size;

	@FindBy(xpath = "//*[@id=\"product-addtocart-button\"]/span")
	private WebElement cart;

	@FindBy(xpath = "//*[@id=\"top-cart-btn-checkout\"]")
	private WebElement chk;

	@FindBy(xpath = "//*[@id=\"ui-id-4\"]")
	private WebElement te;

	@FindBy(xpath = "//*[@id=\"amasty-shopby-product-list\"]/div[3]/ol/li[2]/div/a/span/span/img")
	private WebElement jp;

	@FindBy(xpath = "//*[@id=\"option-label-size-144-item-1341\"]")
	private WebElement jps;

	@FindBy(xpath = "//*[@id=\"option-label-size-144-item-1291\"]")
	private WebElement jps1;

	@FindBy(xpath = "//*[@id=\"option-label-size-144-item-1329\"]")
	private WebElement jps11;

	@FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
	private WebElement adc;

	@FindBy(xpath = "//*[@id=\"top-cart-btn-checkout\"]")
	private WebElement ac;

	@FindBy(xpath = "//*[@id=\"iwd_opc_review\"]/div[1]/a")
	private WebElement ed;

	@FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody/tr/td[3]/div/div/a[2]/b")
	private WebElement pl;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div/div[3]/div[1]/button")
	private WebElement pc;

	@FindBy(xpath = "(//SPAN[contains(text(),'Tops ')][contains(text(),'Tops ')])[2]")
	private WebElement te1;

	@FindBy(xpath = "//ul[@class='level0 submenu ui-menu ui-widget ui-widget-content ui-corner-all']//li[@class='level1 nav-2-1 first ui-menu-item']")
	private WebElement te11;

	@FindBy(xpath = "//li[@class='level1 nav-3-1 first ui-menu-item']")
	private WebElement te12;

	@FindBy(xpath = "//*[@id=\"amasty-shopby-product-list\"]/div[3]/ol/li[2]/div/a/span/span/img")
	private WebElement tp;

	@FindBy(xpath = "//*[@id=\"option-label-size-144-item-1303\"]")
	private WebElement sg;

	@FindBy(xpath = "//*[@id=\"product-addtocart-button\"]/span")
	private WebElement sa;

	@FindBy(xpath = "//*[@id=\"top-cart-btn-checkout\"]")
	private WebElement sac;

	@FindBy(xpath = "//*[@id=\"iwd_opc_login\"]/form/fieldset/div[1]/div/input")
	private WebElement eml;

	@FindBy(xpath = "//*[@id=\"iwd_opc_without_password\"]")
	private WebElement cwp;

	@FindBy(xpath = "//div[@class='field _required'][1]//div[@class='control']//input[@name='postcode']")
	private WebElement czp;

	@FindBy(xpath = "//div[@class='field _required']//input[@name='firstname']")
	private WebElement fn;

	@FindBy(xpath = "//div[@class='field _required']//input[@name='lastname']")
	private WebElement ln;

	@FindBy(xpath = "//div[@class='field _required']//input[@name='street[0]']")
	private WebElement sadd;

	@FindBy(xpath = "//div[@class='control _with-tooltip']//input[@name='telephone']")
	private WebElement pn;

	@FindBy(xpath = "//*[@id=\"iwd_payment_enable\"]")
	private WebElement po;

	@FindBy(xpath = "//*[@id=\"search\"]")
	private WebElement search;

	@FindBy(xpath = "//A[@title='ABOUT US'][text()='ABOUT ONLY']")
	private WebElement aboutus;

	@FindBy(xpath = "//A[@title='PRIVACY POLICY'][text()='PRIVACY POLICY']")
	private WebElement privacy;

	@FindBy(xpath = "//A[@title='Frequently Asked Questions'][text()='FAQ']")
	private WebElement faq;

	@FindBy(xpath = "//div[@class='amount price-container']//span[@class='price']")
	private WebElement mcp;

	@FindBy(xpath = "//tr[@class='iwd_opc_review_total iwd_opc_grand_total']//td[@class='iwd_opc_review_total_cell'][2]")
	private WebElement cop;

	String minicartprice;
	String checkoutprice;

	public void clickSoc() {
		sociallogin.click();
	}

	public void login() {
		log.click();
		elog.sendKeys("pooja1.iksula@gmail.com");
		epass.sendKeys("Pooja123#");
		esub.click();
	}

	public void register() {

		Random random = new Random();
		String userf = "Test" + random.nextInt(101);
		firstname.sendKeys("puja");
		lastname.sendKeys("puja");
		String email = userf + "@mailinator.com";
		mail.sendKeys(email);
		mob.sendKeys("1234567891");
		dob.sendKeys("04/11/1984");
		pass.sendKeys("Test123#");
		cpass.sendKeys("Test123#");
		submit.click();

	}

	public void MAccount() {
		// uname.click();
		try {
			Thread.sleep(10000);

			((JavascriptExecutor) d).executeScript("window.scrollTo(0," + uname.getLocation().y + ")");
			System.out.println("test");

			uname.click();

			Thread.sleep(3000);

			myacc.click();
			madd.click();
			editAdd.click();

			Thread.sleep(3000);
			tel.sendKeys("9323243147");
			Thread.sleep(3000);
			street1.sendKeys("Test Street Test Road");
			Thread.sleep(3000);
			zc.sendKeys("401208");
			Thread.sleep(3000);
			saveadd.click();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void selElement() throws Exception {
		Thread.sleep(3000);
		tog.click();
		Thread.sleep(3000);
		newin.click();

		Thread.sleep(5000);
		jean.click();

		((JavascriptExecutor) d).executeScript("window.scrollTo(0, document.body.scrollHeight)");

		/*
		 * WebDriverWait wait = new WebDriverWait(d,1000);
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.
		 * xpath("//div[@id='amasty-shopby-product-list']//div[@class='toolbar-sorter sorter']"
		 * )));
		 * 
		 * Thread.sleep(5000); highlow.click();
		 * 
		 * Thread.sleep(5000); hl.click();
		 */

	}

	public void prodSel() throws InterruptedException {

		Thread.sleep(5000);

		prod.click();

		Thread.sleep(5000);
		size.click();

		Thread.sleep(5000);
		cart.click();

		Thread.sleep(5000);
		chk.click();

	}

	public void check() throws InterruptedException {

		Thread.sleep(3000);
		tog.click();
		Thread.sleep(3000);
		te.click();
		Thread.sleep(3000);
		jp.click();
		Thread.sleep(3000);
		// jps.click();
		selectSize();
		Thread.sleep(3000);
		adc.click();
		Thread.sleep(3000);
		ac.click();
		Thread.sleep(3000);
		ed.click();
		Thread.sleep(3000);
		pl.click();

		Thread.sleep(3000);
		pc.click();
	}

	public void chechV() throws InterruptedException {

		Thread.sleep(3000);
		tog.click();
		Thread.sleep(3000);
		te.click();
		Thread.sleep(3000);
		jp.click();
		Thread.sleep(3000);
		// jps1.click();
		selectSize();
		Thread.sleep(3000);
		adc.click();
		Thread.sleep(3000);
		ac.click();
		Thread.sleep(3000);
		ed.click();
		Thread.sleep(3000);
		pl.click();

		Thread.sleep(3000);
		pc.click();
	}

	public void chechJJ() throws InterruptedException {

		Thread.sleep(3000);
		jnew.click();
		Thread.sleep(3000);
		highlow.click();
		Thread.sleep(3000);
		hl.click();
		Thread.sleep(3000);
		jp.click();
		Thread.sleep(3000);
		// jps11.click();
		selectSize();
		Thread.sleep(3000);
		adc.click();
		// checkoutprice=cop.getText();
		Thread.sleep(3000);
		ac.click();
		Thread.sleep(3000);
		ed.click();
		Thread.sleep(3000);
		pl.click();

		Thread.sleep(3000);
		pc.click();
	}

	public void checkG() throws InterruptedException {

		Random random = new Random();
		String email = "test" + random.nextInt(2) + "@mailinator.com";
		eml.sendKeys(email);
		Thread.sleep(3000);
		cwp.click();
		Thread.sleep(3000);
		czp.sendKeys("401208");
		Thread.sleep(3000);
		fn.click();
		fn.sendKeys("testfn");
		Thread.sleep(3000);
		ln.sendKeys("testln");
		Thread.sleep(3000);
		sadd.sendKeys("test street test road");
		Thread.sleep(3000);
		pn.sendKeys("9323243147");
		Thread.sleep(3000);
		po.click();
		checkoutprice = cop.getText();
		priceCompare();
	}

	public void checkguest() throws Exception {
		Thread.sleep(3000);
		tog.click();
		Thread.sleep(3000);
		te1.click();
		Thread.sleep(3000);
		te11.click();
		Thread.sleep(3000);
		tp.click();
		Thread.sleep(3000);
		// sg.click();
		selectSize();
		Thread.sleep(3000);
		sa.click();
		Thread.sleep(3000);
		minicartprice = mcp.getText();
		System.out.println("MPrice" + minicartprice);
		sac.click();
		Random random = new Random();
		String email = "test" + random.nextInt(2) + "@mailinator.com";
		eml.sendKeys(email);
		Thread.sleep(3000);
		cwp.click();
		Thread.sleep(3000);
		czp.sendKeys("401208");
		Thread.sleep(5000);
		fn.sendKeys("testfn");
		Thread.sleep(3000);
		ln.sendKeys("testln");
		Thread.sleep(3000);
		sadd.sendKeys("test street test road");
		Thread.sleep(3000);
		pn.sendKeys("9323243147");
		Thread.sleep(3000);
		po.click();
		checkoutprice = cop.getText();
		System.out.println("CPrice" + checkoutprice);
		priceCompare();

	}

	public void checkguestOnly() throws Exception {
		Thread.sleep(3000);
		tog.click();
		Thread.sleep(3000);
		te1.click();
		Thread.sleep(3000);
		te12.click();
		Thread.sleep(3000);
		tp.click();
		Thread.sleep(3000);
		// sg.click();
		selectSize();
		Thread.sleep(3000);
		sa.click();
		Thread.sleep(3000);
		minicartprice = mcp.getText();
		System.out.println("MPrice" + minicartprice);
		sac.click();
		Random random = new Random();
		String email = "test" + random.nextInt(2) + "@mailinator.com";
		eml.sendKeys(email);
		Thread.sleep(3000);
		cwp.click();
		Thread.sleep(3000);
		czp.sendKeys("401208");
		Thread.sleep(5000);
		fn.sendKeys("testfn");
		Thread.sleep(3000);
		ln.sendKeys("testln");
		Thread.sleep(3000);
		sadd.sendKeys("test street test road");
		Thread.sleep(3000);
		pn.sendKeys("9323243147");
		Thread.sleep(3000);
		po.click();
		checkoutprice = cop.getText();
		System.out.println("CPrice" + checkoutprice);
		priceCompare();

	}

	public void selectSize() {

		List<WebElement> allSize = d.findElements(By.className("swatch-option"));
		int size = allSize.size();
		System.out.println("Total product count = " + size);
		int i = 0;
		if (allSize.iterator().hasNext()) {
			allSize.get(i).click();
		} else {
			System.out.println("Out OF Stock");
		}

	}

	public void priceCompare() {
		if (minicartprice.equalsIgnoreCase(checkoutprice)) {
			System.out.println("Minicart prize and checkout price is same ");
		} else {
			System.out.println("Minicart prize and checkout price not  same ");
		}
	}

	public void clicktoggle() throws InterruptedException {

		tog.click();
		Thread.sleep(3000);
		newin.click();

		Thread.sleep(5000);
		jean.click();

		Thread.sleep(3000);
		highlow.click();
		Thread.sleep(3000);
		hl.click();

		Thread.sleep(3000);

		((JavascriptExecutor) d).executeScript("window.scrollTo(0, document.body.scrollHeight)");

		List<WebElement> allPrice = d.findElements(By.className("normal-price"));
		int size = allPrice.size();
		System.out.println("Total product count = " + size);

		int i = 0;
		try {
			while (i <= size) {

				// for (WebElement option : allPrice) {

				String fv = allPrice.get(i).getText().substring(1);
				if (fv.length() == 5) {
					fv = fv.replaceAll(",", "");
				}
				// String test=option.getText().substring(1);
				System.out.println(fv);
				int first = Integer.parseInt(fv);
				System.out.println("int fv" + first);

				String sv = allPrice.get(i + 1).getText().substring(1);
				System.out.println(sv);
				if (sv.length() == 5) {
					sv = sv.replaceAll(",", "");

				}

				int second = Integer.parseInt(sv);

				System.out.println("int sv" + second);

				if (first <= second) {

					/*
					 * System.out.println("In loop"+first); System.out.println("In loop"+second);
					 */
					System.out.println("Success");
				} else {
					System.out.println("Feature failed");
				}
				if (i != size) {
					i++;
				} else {
					break;
				}

				// }
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void vFilter() throws InterruptedException {
		tog.click();
		Thread.sleep(3000);
		newin.click();
		Thread.sleep(5000);

		acc.click();

		Thread.sleep(3000);
		highlow.click();
		Thread.sleep(3000);
		hl.click();

		Thread.sleep(3000);

		((JavascriptExecutor) d).executeScript("window.scrollTo(0, document.body.scrollHeight)");

		List<WebElement> allPrice = d.findElements(By.className("normal-price"));
		int size = allPrice.size();
		System.out.println("Total product count = " + size);

		int i = 0;
		try {
			while (i <= size) {

				// for (WebElement option : allPrice) {

				String fv = allPrice.get(i).getText().substring(1);
				if (fv.length() == 5) {
					fv = fv.replaceAll(",", "");
				}
				// String test=option.getText().substring(1);
				System.out.println(fv);
				int first = Integer.parseInt(fv);
				System.out.println("int fv" + first);

				String sv = allPrice.get(i + 1).getText().substring(1);
				System.out.println(sv);
				if (sv.length() == 5) {
					sv = sv.replaceAll(",", "");

				}

				int second = Integer.parseInt(sv);

				System.out.println("int sv" + second);

				if (first <= second) {

					/*
					 * System.out.println("In loop"+first); System.out.println("In loop"+second);
					 */
					System.out.println("Success");
				} else {
					System.out.println("Feature failed");
				}
				if (i != size) {
					i++;
				} else {
					break;
				}

				// }
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void vJJ() throws InterruptedException {

		Thread.sleep(3000);
		jnew.click();

		Thread.sleep(3000);
		highlow.click();
		Thread.sleep(3000);
		hl.click();

		Thread.sleep(3000);

		((JavascriptExecutor) d).executeScript("window.scrollTo(0, document.body.scrollHeight)");

		List<WebElement> allPrice = d.findElements(By.className("normal-price"));
		int size = allPrice.size();
		System.out.println("Total product count = " + size);

		int i = 0;
		try {
			while (i <= size) {

				// for (WebElement option : allPrice) {

				String fv = allPrice.get(i).getText().substring(1);
				if (fv.length() == 5) {
					fv = fv.replaceAll(",", "");
				}
				// String test=option.getText().substring(1);
				System.out.println(fv);
				int first = Integer.parseInt(fv);
				System.out.println("int fv" + first);

				String sv = allPrice.get(i + 1).getText().substring(1);
				System.out.println(sv);
				if (sv.length() == 5) {
					sv = sv.replaceAll(",", "");

				}

				int second = Integer.parseInt(sv);

				System.out.println("int sv" + second);

				if (first <= second) {
					/*
					 * System.out.println("In loop"+first); System.out.println("In loop"+second);
					 */
					System.out.println("Success");
				} else {
					System.out.println("Feature failed");
				}
				if (i != size) {
					i++;
				} else {
					break;
				}

				// }
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void aboutUS() {
		aboutus.click();

	}

	public void clickPrivacy() {
		privacy.click();
	}

	public void clickFAQ() {
		faq.click();
	}

	public void takeScreenshot(String s) {
		File src1 = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);

		try {

			FileUtils.copyFile(src1, new File("./" + s + timestamp() + ".png"));

		}

		catch (Exception e) {
			System.out.println(e);
		}

	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

	public void search() {
		search.sendKeys("Tops");
		search.sendKeys(Keys.ENTER);

	}

}
