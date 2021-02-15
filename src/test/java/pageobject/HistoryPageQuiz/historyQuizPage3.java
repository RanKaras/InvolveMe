package pageobject.HistoryPageQuiz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class historyQuizPage3 extends historyQuizPage1 {
	@FindBy(css = "[data-id='8onmke5']")
	private WebElement vietnamScandalBtn;
	@FindBy(css = "[data-id='axr9glh']")
	private WebElement lewinskyScandalBtn;
	@FindBy(css = "[data-id='gc2atvg']")
	private WebElement teapotDomeScandalBtn;
	@FindBy(css = "[data-id='9ti9ycv']")
	private WebElement watergateScandal;
	@FindBy(css = ".c-button.btn")
	private WebElement nextBtn;

	public historyQuizPage3(WebDriver driver) {
		super(driver);
	}

	public void selectVietnamScandal() {
		sleep(1000);
		click(vietnamScandalBtn);
	}

	public void selectLewinskyScandal() {
		sleep(1000);
		click(lewinskyScandalBtn);
	}

	public void selectTeapotScandal() {
		sleep(1000);
		click(teapotDomeScandalBtn);
	}

	public void selectWatergate() {
		sleep(1000);
		click(watergateScandal);
	}
}
