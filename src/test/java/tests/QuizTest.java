package tests;

import org.testng.annotations.Test;

import pageobject.Bar.topBar;
import pageobject.HistoryPageQuiz.historyQuizPage1;
import pageobject.HistoryPageQuiz.historyQuizPage2;
import pageobject.HistoryPageQuiz.historyQuizPage3;
import pageobject.HistoryPageQuiz.historyQuizPage4;
import pageobject.HistoryPageQuiz.historyQuizPage5;
import pageobject.Projects.ChooseProjectType;
import pageobject.Templet.templatsPage;
import pageobject.WorkSpace.projectPage;

public class QuizTest extends baseTest{
	@Test(description = "start a new project")
	public void tc01_createNewProject() {
		projectPage pg = new projectPage(driver);
		pg.createNewProject();
	}
	@Test(description = "select the type of the project")
	public void tc02_chooseType() {
		ChooseProjectType cpt = new ChooseProjectType(driver);
		cpt.selectProjectType("Quiz");
	}
	@Test(description = "select alll category from side menu")
	public void tc03_chooseAllCategory() {
		templatsPage tp = new templatsPage(driver);
		tp.chooseCategories("All");
	}
	@Test(description = "select survey category from side menu")
	public void tc04_chooseSurveyCategory() {
		templatsPage tp = new templatsPage(driver);
		tp.chooseCategories("Survey");
	}
	@Test(description = "select calculator category from side menu")
	public void tc05_chooseCalcCategory() {
		templatsPage tp = new templatsPage(driver);
		tp.chooseCategories("Calculator");	
	}
	@Test(description = "select form category from side menu")
	public void tc06_chooseFormCategory() {
		templatsPage tp = new templatsPage(driver);
		tp.chooseCategories("Form");
	}
	@Test(description = "select payment form category from side menu")
	public void tc07_choosePaymentCategory() {
		templatsPage tp = new templatsPage(driver);
		tp.chooseCategories("Payment Form");
	}
	@Test(description = "select lead page category from side menu")
	public void tc08_chooseLeadpageCategory() {
		templatsPage tp = new templatsPage(driver);
		tp.chooseCategories("Lead Page");
	}
	@Test(description = "select quiz category from side menu")
	public void tc09_chooseQuizCategory() {
		templatsPage tp = new templatsPage(driver);
		tp.chooseCategories("Quiz");
	}
	@Test(description = "select a template from quiz category")
	public void tc10_selectTemplate() {
		templatsPage tp = new templatsPage(driver);
		tp.previewTemplate("Test Your History Know-How");
	}
	@Test(description = "set the display of the quiz to a mobile display")
	public void tc11_setMobileView() {
		historyQuizPage1 hqp = new historyQuizPage1(driver);
		hqp.mobileView();
	}
	@Test(description = "set the display of the quiz to a  computer display")
	public void tc12_setComputerView() {
		historyQuizPage1 hqp = new historyQuizPage1(driver);
		hqp.computerView();
	}
	@Test(description = "start the history quiz")
	public void tc13_startQuiz() {
		historyQuizPage1 hqp = new historyQuizPage1(driver);
		hqp.findout();
	}
	@Test(description = "answer the first question of history quiz")
	public void tc14_quizFirstQ() {
		historyQuizPage2 hqp = new historyQuizPage2(driver);
		hqp.selectCrusades();
		hqp.nextPage();
	}
	@Test(description = "answer to the second question")
	public void tc15_quizSecondQ() {
		historyQuizPage3 hqp = new historyQuizPage3(driver);
		hqp.selectWatergate();
		hqp.nextPage();
	}
	@Test(description = "answer to the third question")
	public void tc16_quizThirdQ() {
		historyQuizPage4 hqp = new historyQuizPage4(driver);
		hqp.selectCreationOfInternet();
		hqp.nextPage();
	}
	@Test(description = "answer to the fourth question")
	public void tc17_quizFourthQ() {
		historyQuizPage5 hqp = new historyQuizPage5(driver);
		hqp.selectCommunistMainfesto();
		hqp.nextPage();
	}
	@Test(description = "exit the quiz")
	public void tc18_exitQuiz() {
		historyQuizPage1 hqp = new historyQuizPage1(driver);
		hqp.exit();
	}
	@Test(description = "log out from Involve.me")
	public void tc19_logout() {
		topBar tp = new topBar(driver);
		tp.logout();
	}
	
}
