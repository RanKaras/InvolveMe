package pageobject.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageobject.BasePage.BasePage;

public class Login extends BasePage{
	@FindBy(css = "[name='email']")
	private WebElement userField;
	@FindBy(css = "[name='password']")
	private WebElement passwordField;
	@FindBy(css = ".btn.btn-lg")
	private WebElement loginBtn;
	@FindBy(css = "div:nth-child(6) a")
	private WebElement forgetPasswordBtn;
	@FindBy(css=".alert.alert-danger")
	private WebElement errorMsgText;
	
	public Login(WebDriver driver) {
		super(driver);
	}
	public void login(String user, String password) {
		fillText(userField, user);
		fillText(passwordField, password);
		click(loginBtn);
	}
	public void forgotPassword() {
		click(forgetPasswordBtn);
	}
	public String getLoginErrorMsg() {
	return	getText(errorMsgText);
	}
	
}
