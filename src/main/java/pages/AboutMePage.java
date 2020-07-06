package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutMePage extends BasePage {
	@FindBy(xpath = "//div[@class='aboutMeText']")
	public WebElement aboutMeText;
	public void checkText(String text){
		assertText(aboutMeText,text);
	}
}
