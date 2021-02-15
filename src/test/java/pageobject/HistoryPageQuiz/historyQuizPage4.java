package pageobject.HistoryPageQuiz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class historyQuizPage4 extends historyQuizPage1 {
	@FindBy(css = "[data-id='kcmttpu']")
	private WebElement firstComputerBtn;
	@FindBy(css = "[data-id='v9hu5rk']")
	private WebElement creationOfInternetBtn;
	@FindBy(css = "[data-id='vb4vvy9']")
	private WebElement firstNeuralNetworkBtn;
	@FindBy(css = "[data-id='xxkwesn']")
	private WebElement adventOfCryptography;
	@FindBy(css = ".c-button.btn")
	private WebElement nextBtn;

	public historyQuizPage4(WebDriver driver) {
		super(driver);
	}

	public void selectFirstComputer() {
		sleep(1000);
		click(firstComputerBtn);
	}

	public void selectCreationOfInternet() {
		sleep(1000);
		click(creationOfInternetBtn);
	}

	public void selectFirstNeuralNetwork() {
		sleep(1000);
		click(firstNeuralNetworkBtn);
	}

	public void selectAdventCryptography() {
		sleep(1000);
		click(adventOfCryptography);
	}
}
