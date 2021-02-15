package pageobject.Templet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageobject.BasePage.BasePage;

public class templatsPage extends BasePage {

	@FindBy(css = "#template-gallery tbody tr")
	private List<WebElement> templatesList;
	@FindBy(css = ".nav-item")
	private List<WebElement> categoriesList;
	@FindBy(css = "a#filter-all span")
	private WebElement allNumber;
	@FindBy(css = "#filter-quiz span")
	private WebElement quizNumber;
	@FindBy(css = "#filter-survey span")
	private WebElement surveyNumber;
	@FindBy(css = "#filter-calculator span")
	private WebElement calculatorNumber;
	@FindBy(css = "#filter-form span")
	private WebElement formNumber;
	@FindBy(css = "#filter-payment span")
	private WebElement paymenNumber;
	@FindBy(css = "#filter-leadpage span")
	private WebElement leadpageNumber;
	@FindBy(css = "#filter-promotion span")
	private WebElement promotionNumber;
	@FindBy(css = "#filter-personality_test span")
	private WebElement personalityTestNumber;
	@FindBy(css = "#filter-linklist span")
	private WebElement linkListNum;

	public templatsPage(WebDriver driver) {
		super(driver);
	}
	//select a template and chose the preview option
	public void previewTemplate(String templateName) {
		sleep(3000);
		List<WebElement> templates = templatesList;
		for (WebElement template : templates) {
			if (getText(template).contains(templateName)) {
				WebElement btn = template.findElement(By.cssSelector(".btn-preview"));
				moveToElement(btn);
				click(btn);
				break;
			}
		}
	}
	//choose categories from the side menu
	public void chooseCategories(String name) {
	sleep(1000);
	List<WebElement>categories = categoriesList;
	for (WebElement category : categories) {
		if (getText(category).contains(name)) {
			WebElement btn = category.findElement(By.cssSelector("[href='#']"));
			moveToElement(category);
			click(category);
			break;
		}
	}
	}
	public int getTampletsNumber() {
		return templatesList.size();
	}
	public int getCategoryDisplayedNumber(String catName) {
		sleep(1000);
		WebElement el = driver.findElement(By.cssSelector(".c-thumbnail-image-wrapper"));
		switch (catName) {
		case "all":
			return Integer.parseInt(getText(allNumber));
		case "quiz":
			return Integer.parseInt(getText(quizNumber));
		case "survey":
			return Integer.parseInt(getText(surveyNumber));
		case "calculator":
			return Integer.parseInt(getText(calculatorNumber));
		case "form":
			return Integer.parseInt(getText(formNumber));
		case "payment form":
			return Integer.parseInt(getText(paymenNumber));
		case "lead page":
			return Integer.parseInt(getText(leadpageNumber));
		case "promotion":
			return Integer.parseInt(getText(promotionNumber));
		case "personality test":
			return Integer.parseInt(getText(personalityTestNumber));
		case "linklist":
			return Integer.parseInt(getText(linkListNum));
		default:
			return 0;
		}
	}
}
