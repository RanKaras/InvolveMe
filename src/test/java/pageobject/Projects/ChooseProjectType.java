package pageobject.Projects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageobject.BasePage.BasePage;

public class ChooseProjectType extends BasePage {
	@FindBy(css = ".blank div.icon")
	private WebElement startFromScratchBtn;
	@FindBy(css = "#app-layout div:nth-child(3) .title")
	private List<WebElement> projectsType;

	public ChooseProjectType(WebDriver driver) {
		super(driver);

	}

	public void selectProjectType(String projectName) {
		for (WebElement project : projectsType) {
			if (getText(project).equalsIgnoreCase(projectName)) {
				click(project);
				break;
			}
		}
	}

	public void startFromScratch() {
		click(startFromScratchBtn);
	}

}
