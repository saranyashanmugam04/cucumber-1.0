package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import pages.HomePageClass;

public class LoginStepDefinition {
	WebDriver driver;
	@Given("user naviagtes to newtours application on chrome browser")
	public void user_naviagtes_to_newtours_application_on_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver","src\\test\\resources\\drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}

	@Given("user enters username and password")
	public void user_enters_username_and_password() {
		PageFactory.initElements(driver, HomePageClass.class);
		HomePageClass.un.sendKeys("mercury");
		HomePageClass.psd.sendKeys("mercury");
	   
	}

	@Given("user clicks on signin button")
	public void user_clicks_on_signin_button() {
	    HomePageClass.signin.click();
	}

	@Given("user verify login success")
	public void user_verify_login_success() {
		String title=driver.getTitle();
	    Assert.assertTrue(title.contains("Find a Flight"));
	    driver.close();
	}


}
