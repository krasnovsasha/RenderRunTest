package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage extends BasePage {
	@FindBy(xpath = "//div[@class='footerInformation']")
	public WebElement footerInformation;
	public void checkTextInFooter(String text){
		assertText(footerInformation,text);
	}
}
