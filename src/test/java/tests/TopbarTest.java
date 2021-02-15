package tests;

import org.testng.annotations.Test;

import pageobject.Bar.topBar;

public class TopbarTest extends baseTest{
	
	@Test(description = "select analystics option from the top bar")
	public void tc01_selectAnalyrics() {
		topBar tb = new topBar(driver);
		tb.selectTopbar("Analyrics");
	}
	@Test(description = "select projects option from the top bar")
	public void tc02_selectProjects() {
		topBar tb = new topBar(driver);
		tb.selectTopbar("Projects");
	}
	@Test(description = "select templates option from the top bar")
	public void tc03_selectTemplates() {
		topBar tb = new topBar(driver);
		tb.selectTopbar("Templates");
	}
	@Test(description = "select intergration option from the top bar")
	public void tc04_selectIntergration() {
		topBar tb = new topBar(driver);
		tb.selectTopbar("Integrations");
	}
	@Test(description = "select afiiliate option from the top bar")
	public void tc04_selectAfiiliate() {
		topBar tb = new topBar(driver);
		tb.selectTopbar("Afiiliate");
	}
}
