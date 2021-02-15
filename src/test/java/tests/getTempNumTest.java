package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageobject.Projects.ChooseProjectType;
import pageobject.Templet.templatsPage;

import pageobject.WorkSpace.projectPage;

public class getTempNumTest extends baseTest {

	@Test(description = "start a new project")
	public void tc01_createNewProject() {
		projectPage pg = new projectPage(driver);
		pg.createNewProject();
	}

	@Test(description = "select the type of project")
	public void tc02_chooseType() {
		ChooseProjectType cpt = new ChooseProjectType(driver);
		cpt.selectProjectType("Quiz");
	}
	
	@Test(description = "get the number of templats from quiz category")
	public void tc03_getQuizTempNum() {
		templatsPage tp = new templatsPage(driver);
		tp.getCategoryDisplayedNumber("quiz");
		int expected = 12;
		int actual = tp.getCategoryDisplayedNumber("quiz");
		assertEquals(actual, expected);
	}
	@Test(description = "get the number of templats from survey ")
	public void tc04_getSurveyTempNum() {
		templatsPage tp = new templatsPage(driver);
		tp.getCategoryDisplayedNumber("survey");
		int expected = 16;
		int actual = tp.getCategoryDisplayedNumber("survey");
		assertEquals(actual, expected);
	}
	@Test(description = "get the number of templats from calculator ")
	public void tc05_getCalculatorTempNum() {
		templatsPage tp = new templatsPage(driver);
		tp.getCategoryDisplayedNumber("calculator");
		int expected = 12;
		int actual = tp.getCategoryDisplayedNumber("calculator");
		assertEquals(actual, expected);
	}
	@Test(description = "get the number of templats from form")
	public void tc06_getFormTempNum() {
		templatsPage tp = new templatsPage(driver);
		tp.getCategoryDisplayedNumber("form");
		int expected= 33;
		int actual = tp.getCategoryDisplayedNumber("form");
		assertEquals(actual, expected);
	}
	@Test(description = "get the number of templats from payment form")
	public void tc07_getPaymentTempNum() {
		templatsPage tp = new templatsPage(driver);
		tp.getCategoryDisplayedNumber("payment form");
		int expected = 18;
		int actual = tp.getCategoryDisplayedNumber("payment form");
		assertEquals(actual, expected);
	}
	@Test(description = "get the number of templats lead page")
	public void tc08_getLeadPageTempNum() {
		templatsPage tp = new templatsPage(driver);
		tp.getCategoryDisplayedNumber("lead page");
		int expected = 18;
		int actual = tp.getCategoryDisplayedNumber("lead page");
		assertEquals(actual, expected);
	}
	@Test(description = "get the number of templats from promotion")
	public void tc09_getPromotionTempNum() {
		templatsPage tp = new templatsPage(driver);
		tp.getCategoryDisplayedNumber("promotion");
		int expected = 15;
		int actual = tp.getCategoryDisplayedNumber("promotion");
		assertEquals(actual, expected);
	}
	@Test(description = "get the number of templats from personality test")
	public void tc10_getPersonalityTempNum() {
		templatsPage tp = new templatsPage(driver);
		tp.getCategoryDisplayedNumber("personality test");
		int expected = 8;
		int actual = tp.getCategoryDisplayedNumber("personality test");
		assertEquals(actual, expected);
	}
	@Test(description = "get the number of templats from link list")
	public void tc11_getLinklistTempNum() {
		templatsPage tp = new templatsPage(driver);
		tp.getCategoryDisplayedNumber("linklist");
		int expected = 10;
		int actual = tp.getCategoryDisplayedNumber("linklist");
		assertEquals(actual, expected);
	}
}	
