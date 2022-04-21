package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonHomePageLocators {

	@FindBy(how=How.XPATH,using="//div[@class='navFooterLinkCol navAccessibility'][4]")
	public WebElement helpDiv;
}
