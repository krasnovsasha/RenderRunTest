package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage extends BasePage {
	@FindBy(xpath = "//div[@class='footerInformation']")
	protected WebElement footerInformation;
	public void checkTextInFooter(String text){
		assertText(footerInformation,text);
	}
}
