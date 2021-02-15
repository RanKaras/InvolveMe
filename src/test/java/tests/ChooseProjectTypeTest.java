package tests;

import org.testng.annotations.Test;

import pageobject.Projects.ChooseProjectType;
import pageobject.WorkSpace.projectPage;

public class ChooseProjectTypeTest extends baseTest {
	@Test
	public void tc01_createNewProject() {
		projectPage pg = new projectPage(driver);
		pg.createNewProject();
	}

	@Test
	public void tc02_chooseType() {
		ChooseProjectType cpt = new ChooseProjectType(driver);
		cpt.selectProjectType("Quiz");
	}

}
