package tests;

import org.testng.annotations.Test;

import pageobject.Projects.ChooseProjectType;
import pageobject.Templet.templatsPage;
import pageobject.WorkSpace.projectPage;

public class ChooseTemplateTest extends baseTest{
	@Test(description = "create a new project")
	public void tc01_createNewProject() {
		projectPage pg = new projectPage(driver);
		pg.createNewProject();
	}
	@Test(description = "choose type of project from the list")
	public void tc02_chooseType() {
	ChooseProjectType cpt = new ChooseProjectType(driver);
	cpt.selectProjectType("Quiz");
	}
	@Test(description = "change the category to 'all'")
	public void tc03_changeCategoryToAll() {
	templatsPage tp = new templatsPage(driver);
	tp.chooseCategories("All");
	}
	@Test(description = "go back to quiz category")
	public void tc04_changeCategoryToQuiz() {
		templatsPage tp = new templatsPage(driver);
		tp.chooseCategories("Quiz");
	}
}
