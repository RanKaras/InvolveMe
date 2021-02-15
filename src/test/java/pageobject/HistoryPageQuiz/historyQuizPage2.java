package pageobject.HistoryPageQuiz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class historyQuizPage2 extends historyQuizPage1{
	@FindBy(css="[data-id='crrpv1w']")
	private WebElement crusadesBtn;
	@FindBy(css="[data-id='vocv32c']")
	private WebElement punicwarBtn;
	@FindBy(css="[data-id='k57d0kp']")
	private WebElement greatMigrationBtn;
	@FindBy(css="[data-id='qhlxahw']")
	private WebElement frenchRevolutionBtn;
	@FindBy(css=".c-button.btn")
	private WebElement nextBtn;
	
	public historyQuizPage2(WebDriver driver) {
		super(driver);
	}
	public void selectCrusades() {
		sleep(1000);
		click(crusadesBtn);
	}
	public void selectPunicwars() {
		sleep(1000);
		click(punicwarBtn);
	}
	public void selectGreatMigration() {
		sleep(1000);
		click(greatMigrationBtn);
	}
	public void nextPage() {
		sleep(1000);
		click(nextBtn);
	}
}
