package pageobject.Bar;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageobject.BasePage.BasePage;

public class topBar extends BasePage {
	@FindBy(css = "#nav-dropdown")
	private WebElement accountBtn;
	@FindBy(css = "[href='https://app.involve.me/logout']")
	private WebElement logoutBtn;
	@FindBy(css = "[href='https://app.involve.me/projects']")
	private WebElement projectsBtn;
	@FindBy(css = "[href=\"https://app.involve.me\"")
	private WebElement templatesBtn;
	@FindBy(css = "[href='https://app.involve.me/analytics']")
	private WebElement analyticsBtn;
	@FindBy(css = "[href='https://app.involve.me/integrations']")
	private WebElement integrationsBtn;
	@FindBy(css = "[href='https://app.involve.me/affiliate']")
	private WebElement affiliateBtn;
	@FindBy(css = "#app .flex-grow.md\\:flex.md\\:items-center.md\\:w-auto a")
	private List<WebElement> topbarList;

	public topBar(WebDriver driver) {
		super(driver);
	}

	public void topbarProjects() {
		click(projectsBtn);
	}

	public void topbarTemplates() {
		click(templatesBtn);
	}

	public void topbarAnalytics() {
		click(analyticsBtn);
	}

	public void topbarIntegrations() {
		click(integrationsBtn);
	}

	public void topbarAffiliateProgram() {
		click(affiliateBtn);
	}

	public void logout() {
		click(accountBtn);
		sleep(1000);
		click(logoutBtn);

	}

	public void selectTopbar(String name) {
		sleep(1000);
		List<WebElement> topbar = topbarList;
		for (WebElement topbarList : topbar) {
			if (getText(topbarList).contains(name)) {
				click(topbarList);
				break;
			}
		}

	}

}


