package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefClass {
	WebDriver driver;
	@Given("user launches chrome browser")
	public void user_launches_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
	    System.out.println("launches chrome browser");
	    driver=new ChromeDriver();
	    driver.get("http://newtours.demoaut.com");
	}

	@When("user navigates to registration page")
	public void user_navigates_to_registration_page() {
		driver.findElement(By.linkText("REGISTER")).click();
	   System.out.println("navigates to registration page");
	}

	@When("user enters with username")
	public void user_enters_with_username() {
	   System.out.println("entered username as saranya");
	   driver.findElement(By.id("email")).sendKeys("saranya");
	}

	@When("user enters with password")
	public void user_enters_with_password() {
		driver.findElement(By.name("password")).sendKeys("password@1");
	  System.out.println("entered password as password@1");
	}

	@When("user enters with confirm password")
	public void user_enters_with_confirm_password() {
		driver.findElement(By.name("confirmPassword")).sendKeys("password@1");
	  System.out.println("entered confirm password as password@1");
	}

	@When("user clicks on Submit button")
	public void user_clicks_on_Submit_button() {
		driver.findElement(By.name("register")).click();
	    System.out.println("clicked on submit");
	}

	@Then("verfiy registration success")
	public void verfiy_registration_success() {
		WebElement signoff=driver.findElement(By.partialLinkText("SIGN-OFF"));
		Assert.assertTrue(signoff.isEnabled());
		
	   System.out.println("registration is success");
	   driver.close();
	}
	@When("user enters with username as {string}")
	public void user_enters_with_username_as(String un) {
		driver.findElement(By.id("email")).sendKeys(un);
		System.out.println("username is "+un);
	   
	}

	@When("user enters with password as {string}")
	public void user_enters_with_password_as(String psd) {
		driver.findElement(By.name("password")).sendKeys(psd);
	    System.out.println("password is "+psd);
	}

	@When("user enters with confirm password as {string}")
	public void user_enters_with_confirm_password_as(String cpsd) {
		driver.findElement(By.name("confirmPassword")).sendKeys(cpsd);
	    System.out.println("confirm password is "+cpsd);
	}

	@Given("user performs registrtaion")
	public void user_performs_registrtaion() {
	  System.out.println("user performing registration");
	}

	@Given("user perform login")
	public void user_perform_login() {
	  System.out.println("user performing login");
	}

	@Given("user searching for the available product")
	public void user_searching_for_the_available_product() {
	   System.out.println("user searching for product");
	}

	@Given("user selecting the product")
	public void user_selecting_the_product() {
	   System.out.println("user selecting product");
	}

	@Given("user adding product to cart")
	public void user_adding_product_to_cart() {
	    System.out.println("user adding product");
	}

	@Given("user proceeds to payment mode")
	public void user_proceeds_to_payment_mode() {
	    System.out.println("user proceeds to payment");
	}

	@Given("user performs logout")
	public void user_performs_logout() {
	    System.out.println("user performing logout");
	}



}
