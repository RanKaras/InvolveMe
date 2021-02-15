package tests;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import pageobject.Login.Login;

public class baseTest {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.involve.me/projects");
		Login li = new Login(driver);
		li.login("automation59@gmail.com", "Asdfghjkl42");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	// @AfterMethod
	// public void failedTest(ITestResult result) {
	// check if the test failed
	// if (result.getStatus() == ITestResult.FAILURE ){
	// TakesScreenshot ts = (TakesScreenshot)driver;
	// File srcFile = ts.getScreenshotAs(OutputType.FILE);
	// try {
	// FileUtils.copyFile(srcFile, new
	// File("./ScreenShots/"+result.getName()+".jpg"));
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// result.getname() method will give you current test case name.
	// ./ScreenShots/ tell you that, in your current directory, create folder
	// ScreenShots. dot represents current directory
	// }
	// }
}

