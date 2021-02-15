package pageobject.BasePage;

import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public WebDriver driver;
	private Actions actions;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	// send keys
	public void fillText(WebElement el, String text) {
		highlightElement(el, "blue");
		el.clear();
		el.sendKeys(text);
		sleep(500);
	}

	// click on element
	public void click(WebElement el) {
		// highlight
		highlightElement(el, "blue");
		sleep(1000);
		el.click();
	}

	// get text from element
	public String getText(WebElement el) {
		highlightElement(el, "orange");
		return el.getText();
	}

	// accepts alerts
	public void alertOK() {
		driver.switchTo().alert().accept();
	}

	// mouse
	public void mouseHover(WebElement el) {
		actions.moveToElement(el).build().perform();
	}

	// mouse
	public void rightClick(WebElement el) {
		actions.moveToElement(el).build().perform();
	}

	/*
	 * Call this method with your element and a color like (red,green,orange etc...)
	 */
	protected void highlightElement(WebElement element, String color) {
		// keep the old style to change it back
		String originalStyle = element.getAttribute("style");
		String newStyle = "border: 1px solid " + color + ";background-color:yellow;" + originalStyle;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Change the style
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
				+ newStyle + "');},0);", element);
		// Change the style back after few miliseconds
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
				+ originalStyle + "');},400);", element);

	}

	// sleep for a given amount of time
	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// move mouse to element
	public void moveToElement(WebElement el) {
		Actions actions = new Actions(driver);
		actions.moveToElement(el).perform();
	}

	// drag and drop element
	public void dragAndDrop(WebElement el, WebElement drop) {
		actions.dragAndDrop(el, drop).perform();
	}

	// return true if given element is displayed on the page
	public boolean isElementDisplayed(WebElement el) {
		try {
			return el.isDisplayed();
		} catch (StaleElementReferenceException ex) {
			return false;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
}


