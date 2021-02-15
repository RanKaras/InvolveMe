package pageobject.HistoryPageQuiz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class historyQuizPage5 extends historyQuizPage1{
	@FindBy(css="[data-id='sgwxdd0']")
	private WebElement meinKampfBtn;
	@FindBy(css="[data-id='jw4nqn8']")
	private WebElement wealthOfNationsBtn;
	@FindBy(css="[data-id='b111nuu']")
	private WebElement communistManifestoBtn;
	@FindBy(css="[data-id='q4oy3el']")
	private WebElement originOfSpeciesBtn;
	
	public historyQuizPage5(WebDriver driver) {
		super(driver);
	}
	public void selectMeinkampf() {
		sleep(1000);
		click(meinKampfBtn);
	}
	public void selectWealthOfNation() {
		sleep(1000);
		click(wealthOfNationsBtn);
	}
	public void selectCommunistMainfesto() {
		sleep(1000);
		click(communistManifestoBtn);
	}
	public void selectOriginOfSpecies() {
		sleep(1000);
		click(originOfSpeciesBtn);
	}
}
