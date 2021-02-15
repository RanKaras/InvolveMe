package pageobject.HistoryPageQuiz;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageobject.BasePage.BasePage;



public class historyQuizPage1 extends BasePage{
	@FindBy(css = ".c-button.btn")
	private WebElement findoutBtn;
	@FindBy(css = "[src='/img/frontend/icon-modal-close.svg']")
	private WebElement exitBtn;
	@FindBy(css = "[title='mobile']")
	private WebElement mobileViewBtn;
	@FindBy(css = "[title='desktop']")
	private WebElement computerViewBtn;
	@FindBy(css=".c-button.btn")
	private WebElement nextBtn;
	@FindBy(css = "div.e-headline .e-html-container")
	private WebElement feebackText;
	@FindBy(css = "p.feedback-text.correct")
	private WebElement correctAnswerMsg; // message appears after right answer
	@FindBy(css = "p.feedback-text")
	private WebElement wrongAnswerMsg; // message appears after wrong answer

	@FindBy(css = ".c-answer.answer-behaviour")
	private List<WebElement> answers;
	public historyQuizPage1(WebDriver driver) {
		super(driver);
		
	}
	public void findout() {
		click(findoutBtn);
	}

	public void mobileView() {
		sleep(1000);
		click(mobileViewBtn);
	}

	public void computerView() {
		sleep(1000);
		click(computerViewBtn);
	}

	public void exit() {
		click(exitBtn);
	}
	public void nextPage() {
		sleep(1000);
		click(nextBtn);
	}

	public void selectAnswer(String text) {
		List<WebElement> answer = answers;
		for (WebElement quizAnswer : answer) {
			if (getText(quizAnswer).contains(text)) {
				click(quizAnswer);
				break;
			}
		}
	}
	public boolean ifCorrectAnswer() {
		return isElementDisplayed(correctAnswerMsg);
	}
	public boolean ifWrongAnswer() {
		return isElementDisplayed(wrongAnswerMsg);
	}
}


