package tests;

import org.testng.annotations.Test;

import pageobject.WorkSpace.projectPage;

public class ProjectPageTest extends baseTest{
	@Test(description = "create a new workspace")
	public void tc01_createWorkSpace() {
		projectPage pg = new projectPage(driver);
		pg.createWorkSpace("ran");
	}
	@Test(description = "change the name of the work space")
	public void tc02_renameWorkSpace() {
		projectPage pg = new projectPage(driver);
		pg.renameWorkSpace("ran", "tal");
	}
	@Test(description = "choose a project from the side memu")
	public void tc03_selectWorkSpace() {
		projectPage pg = new projectPage(driver);
		pg.selectWorkSpace("tal");
	}
	@Test(description = "delete a work space from the side menu")
	public void tc04_deleteWorkspace() {
		projectPage pg = new projectPage(driver);
		pg.selectWorkSpace("tal");
		pg.deleteWorkspace("tal");
	}
	@Test(description = "choose a project from the side menu and start a new project")
	public void tc05_createNewProject() {
		projectPage pg = new projectPage(driver);
		pg.selectWorkSpace("My Workspace");
		pg.createNewProject();
	}
}
