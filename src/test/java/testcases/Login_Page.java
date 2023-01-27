package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import pages.Hotel_App_Login_Page;
public class Login_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		Hotel_App_Login_Page halp=new Hotel_App_Login_Page(driver);
		halp.enterUserName("Jayakishore");
		halp.enterPassword("Test@12345");
		halp.clickLoginButton();
	}
}
