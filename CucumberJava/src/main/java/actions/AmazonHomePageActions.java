package actions;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import locators.AmazonHomePageLocators;
import utils.SeleniumDriver;

public class AmazonHomePageActions {

	AmazonHomePageLocators amazonHomePageLocators=null;
	
	public AmazonHomePageActions() {
		this.amazonHomePageLocators=new AmazonHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), amazonHomePageLocators);
	}
	
	public void openHelpTabs() {
		PageFactory.initElements(SeleniumDriver.getDriver(), amazonHomePageLocators);
		for(int i=0;i<amazonHomePageLocators.helpDiv.findElements(By.tagName("a")).size();i++)
		{
			String opentabs=Keys.chord(Keys.CONTROL,Keys.ENTER);
			amazonHomePageLocators.helpDiv.findElements(By.tagName("a")).get(i).sendKeys(opentabs);
		}
	}
	
	public void openMiddleTab() {
		ArrayList<String> tabs = new ArrayList<String> (SeleniumDriver.getDriver().getWindowHandles());
		SeleniumDriver.getDriver().switchTo().window(tabs.get(tabs.size()/2));
	}
}
