package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.Login.Login;

public class LoginTest {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.involve.me/projects");
	}
	@Test(dataProvider = "getData", description = "use incorect login information")
	public void tc01_failedLogin(String user, String password) {
		Login loginpage= new Login(driver);
		//using the variables we get from @dataProvider method
		loginpage.login(user, password);
		String expected = "These credentials do not match our records.";
		String actual = loginpage.getLoginErrorMsg();
		assertEquals(actual, expected);
	}
	@DataProvider
	public Object[][]getData(){
		Object[][]myData= {
				{"automation59@gmail.com","123"},
				{"automation5539@gmail.com","43Asdfghjkl42"},
				{"automation5539@gmail.com","Asdfghjkl42"},
				{"gal@hot.com","123456878"},	
		};
		return myData;
	}
}
