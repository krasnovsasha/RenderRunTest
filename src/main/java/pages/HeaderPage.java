package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DriverSettings;

public class HeaderPage extends BasePage {

	public void clickToMenuLink(String linkText){
		String xpath = String.format("//a[contains(text(),'%s')]",linkText);
		WebElement element = DriverSettings.getDriver().findElement(By.xpath(xpath));
		waitUntillElementToBeClickable(element);
		element.click();
	}

}
