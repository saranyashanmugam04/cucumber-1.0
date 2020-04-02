package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {
	WebDriver driver;
	
	//constructor , webelements , methods/functions
	
	public HomePageClass(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(linkText="SIGN-ON") public static WebElement signonlink;
	@FindBy(linkText="REGISTER") public static WebElement registerlink;
	@FindBy(name="userName") public static WebElement un;
	@FindBy(name="password") public static WebElement psd;
	@FindBy(name="login") public static WebElement signin;
	
	
}
