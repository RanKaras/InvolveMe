package pageobject.WorkSpace;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageobject.BasePage.BasePage;

public class projectPage extends BasePage {
	@FindBy(css = "#app .px-4 a")
	private WebElement startBtn;
	@FindBy(css = ".font-medium button")
	private WebElement createNewWorkspaceBtn;
	@FindBy(css = "[data-icon='chevron-down']")
	private WebElement workspaceEditBtn;
	@FindBy(css = ".mr-3 .hover\\:bg-gray-600")
	private WebElement renameWorkspaceBtn;
	@FindBy(css = ".mr-3 .text-red-600")
	private WebElement deleteWorkspaceBtn;
	@FindBy(css = ".vue-portal-target input")
	private WebElement renameField;
	@FindBy(css = "#confirm-create-button")
	private WebElement confirmationBtn; // Rename , create, and delete workspace buttons
	@FindBy(css = "[placeholder='Workspace name']")
	private WebElement newWorkspaceNameField;
	@FindBy(css = ".h-12")
	private WebElement deleteWorkspaceField;
	@FindBy(css = ".hidden.px-3")
	private WebElement createProjectBtn; // Appears when there is an avilable project
	@FindBy(css = "[data-icon='search']")
	private WebElement searchBtn;
	@FindBy(css = "[type='text']")
	private WebElement searchField;
	@FindBy(css = ".mt-6 a")
	private List<WebElement> workspacesList;

	public projectPage(WebDriver driver) {
		super(driver);
	}

	public void createWorkSpace(String name) {
		click(createNewWorkspaceBtn);
		fillText(newWorkspaceNameField, name);
		click(confirmationBtn);
		sleep(1000);
	}

	// if there is no project already open
	public void createNewProject() {
		click(startBtn);
	}

	// if there is already project
	public void createProject() {
		click(createProjectBtn);
	}
	// rename the workspace
	public void renameWorkSpace(String oldName, String newName) {
		List<WebElement> workspaces = workspacesList;
		for (WebElement workspace : workspaces) {
			if (getText(workspace).contains(oldName)) {
				click(workspace);
				click(workspaceEditBtn);
				click(renameWorkspaceBtn);
				fillText(renameField, newName);
				click(confirmationBtn);
				sleep(1000);
				break;
			}
		}
	}
	//delete workspace
	public void deleteWorkspace(String name) {
		List<WebElement> workspaces = workspacesList;
		for (WebElement workspace : workspaces) {
			if (getText(workspace).contains(name)) {
				click(workspace);
				click(workspaceEditBtn);
				click(deleteWorkspaceBtn);
				fillText(deleteWorkspaceField, name);
				click(confirmationBtn);
				sleep(1000);
				break;
			}
		}
	}
	// 
	public void search(String name) {
		sleep(1000);
		click(searchBtn);
		fillText(searchField, name);
	}
	// select workspace from the side menu
	public void selectWorkSpace(String name) {
		List<WebElement> workspaces = workspacesList;
		for (WebElement workspace : workspaces) {
			if (getText(workspace).contains(name)) {
				click(workspace);
			}
		}
	}
}
