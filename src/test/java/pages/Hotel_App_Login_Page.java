package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Hotel_App_Login_Page {
	WebDriver driver;
	
	public Hotel_App_Login_Page(WebDriver driver) 
	{
	    this.driver = driver;	
	}
	// Locator for USer Name 
	By usr_name= By.id("username");
	//Locator for Password
	By usr_passw = By.id("password");
	//Locator for Login Button 
	By login_button = By.id("login");
	//Method to enter user name 
	
	public void enterUserName(String username)
	{
		driver.findElement(usr_name).sendKeys(username);
	}


//Method to enter Password

	public void enterPassword(String password)
	{
		driver.findElement(usr_passw).sendKeys(password);
	}
	
//Method to click Login button 

		public void clickLoginButton()
		{
			driver.findElement(login_button).click();
		}
	
}