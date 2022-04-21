package StepDefinations;

import actions.AmazonHomePageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.SeleniumDriver;

public class OpenTabsSteps {
	AmazonHomePageActions amazonHomePageActions=new AmazonHomePageActions();
	
	@Given("I am on the HomePage of Amazon")
	public void i_am_on_the_home_page_of_amazon() {
	SeleniumDriver.setUpDriver();
	SeleniumDriver.openPage("https://www.amazon.in");
	 System.out.println("i_am_on_the_home_page_of_amazon");
	}

	@When("I open all tabs under Let us Help You banner")
	public void i_open_all_tabs_under_let_us_help_you_banner() {
		amazonHomePageActions.openHelpTabs();
	}

	@When("navigate to middle tab")
	public void navigate_to_middle_tab() {
		amazonHomePageActions.openMiddleTab();
	}

	@Then("title of the tab should be {string}")
	public void title_of_the_tab_should_be(String string) {
	    
	}

}
