package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HeaderPage extends BasePage {
	@FindBy(xpath = "//div[@class='headerMenu']/ul/li/a")
	public List<WebElement> headerMenuLinks;

	public void clickToMenuLink(String linkText){
		headerMenuLinks = new ArrayList<>();
		for (WebElement el: headerMenuLinks) {
			if (el.getText().equals(linkText)) {
				click(el);
			}
		}
	}
}
