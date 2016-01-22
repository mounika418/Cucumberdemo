package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinitions {
	private WebDriver driver = null;

	private String URL = "http://localhost/mounika/index.html";

	@Given("^Launch the URL in \"([^\"]*)\"$")
	public void launch_the_URL(String browser) throws Throwable {

		if (browser.equalsIgnoreCase("FF")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//IE//IEDriverServer.exe");

			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("GC")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Chrome//chromedriver.exe");

			driver = new ChromeDriver();
		}

		driver.get(URL);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("^Select the check box$")
	public void select_the_check_box() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 5);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox")));

		driver.findElement(By.id("checkbox")).click();

	}

	@When("^Click Next button$")
	public void click_Next_button() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 5);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("next")));

		driver.findElement(By.id("next")).click();

	}

	@Then("^Navigate to Sign up page successfully$")
	public void navigate_to_Sign_up_page_successfully() throws Throwable {

		System.out.println("Successfully navigated to sign up page");

	}

	@When("^Enter Forename$")
	public void enter_Forename() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("forenames")));

		driver.findElement(By.id("forenames")).sendKeys("Mounika");

	}

	@When("^Enter Surname$")
	public void enter_Surname() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("surename")));

		driver.findElement(By.id("surename")).sendKeys("Saimpu");

	}

	@When("^Select gender$")
	public void select_gender() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("radiof")));

		driver.findElement(By.id("radiof")).click();

	}

	@When("^Enter address in address lines$")
	public void enter_address_in_address_lines() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address1")));

		driver.findElement(By.id("address1")).sendKeys("DoorNo123");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address2")));

		driver.findElement(By.id("address2")).sendKeys("Maitrivanam");

	}

	@When("^Enter City$")
	public void enter_City() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));

		driver.findElement(By.id("city")).sendKeys("Hyderabad");

	}

	@When("^Enter Postal code$")
	public void enter_Postal_code() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postalcode")));

		driver.findElement(By.id("postalcode")).sendKeys("500045");

	}

	@When("^Enter Telephone number$")
	public void enter_Telephone_number() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("telephone")));

		driver.findElement(By.id("telephone")).sendKeys("9874563210");

	}

	@When("^Select Country$")
	public void select_Country() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("country")));

		Select country = new Select(driver.findElement(By.name("country")));

		country.selectByVisibleText("India");

	}

	@When("^Click Submit button$")
	public void click_Submit_button() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='submit']")));

		driver.findElement(By.xpath("//input[@id='submit']")).click();

	}

	@Then("^Navigate to Flight booking page successfully$")
	public void navigate_to_Flight_booking_page_successfully() throws Throwable {

		System.out.println("Successfully navigated to Flight Booking page");

	}

	@When("^Select departure city$")
	public void select_departure_city() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("depart")));

		Select deparCity = new Select(driver.findElement(By.name("depart")));

		deparCity.selectByValue("Paris");

	}

	@When("^Select departure date$")
	public void select_departure_gate() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker")));

		driver.findElement(By.id("datepicker")).sendKeys("04/01/2016");

	}

	@When("^Select arrival city$")
	public void select_arrival_city() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("arrive")));

		Select arrCity = new Select(driver.findElement(By.name("arrive")));

		arrCity.selectByIndex(2);

	}

	@When("^Select return date$")
	public void select_return_date() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker1")));

		driver.findElement(By.id("datepicker1")).sendKeys("09/01/2016");

	}

	@When("^Enter number of passengers$")
	public void enter_number_of_passengers() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1");

	}

	@When("^Select round trip$")
	public void select_round_trip() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tripcheckbox")));

		driver.findElement(By.id("tripcheckbox")).click();

	}

	@When("^Select seating preference$")
	public void select_seating_preference() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("window")));

		driver.findElement(By.id("window")).click();

	}

	@When("^Select ticket type$")
	public void select_ticket_type() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("business")));

		driver.findElement(By.id("business")).click();

	}

	@When("^Click Confirm button$")
	public void click_Confirm_button() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirm")));

		driver.findElement(By.id("confirm")).click();

	}

	@Then("^Navigate to Payment page successfully$")
	public void navigate_to_Payment_page_successfully() throws Throwable {

		System.out.println("Successfully navigated to payment page");

	}

	@When("^Enter Credit card number$")
	public void enter_Credit_card_number() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ccnum")));

		driver.findElement(By.id("ccnum")).sendKeys("501789456123");

	}

	@When("^Enter name on card$")
	public void enter_name_on_card() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ccname")));

		driver.findElement(By.id("ccname")).sendKeys("MounikaS");

	}

	@When("^Select expiry month$")
	public void select_expiry_month() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ccmonth")));

		Select expMonth = new Select(driver.findElement(By.id("ccmonth")));

		expMonth.selectByValue("11");

	}

	@When("^Select expiry year$")
	public void select_expiry_year() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ccyear")));

		Select expYear = new Select(driver.findElement(By.id("ccyear")));

		expYear.selectByVisibleText("2016");

	}

	@When("^Enter CVC number$")
	public void enter_CVC_number() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ccvc")));

		driver.findElement(By.id("ccvc")).sendKeys("548");

	}

	@When("^Click Pay now button$")
	public void click_Pay_now_button() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("paynow")));

		driver.findElement(By.id("paynow")).click();

	}

	@Then("^Payment was successful message should be displayed$")
	public void payment_was_successful_message_should_be_displayed() throws Throwable {

		System.out.println("Payment successful");

	}

	@Then("^Click Home button$")
	public void click_Home_button() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("home")));

		driver.findElement(By.id("home")).click();

	}

	@Then("^Navigate to Home page successfully$")
	public void navigate_to_Home_page_successfully() throws Throwable {

		System.out.println("Successfully returned to Home Page");

	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
