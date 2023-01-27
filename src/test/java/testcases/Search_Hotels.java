package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import pages.Hotel_App_Login_Page;
import pages.Search_Hotel_Page; 
	
public class Search_Hotels {
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
		
		//Create object of the search page
		Search_Hotel_Page objSearch = new Search_Hotel_Page(driver);
				
				//Enter search parameters and login
				objSearch.enterSearchParameters("Sydney", "Hotel Sunshine", "Double", "2", "24/12/2022", "27/12/2022", "2", "1");
				objSearch.clickSearchBtn();
	
     }
}

