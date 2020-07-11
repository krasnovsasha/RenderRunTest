package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class ContactsPage extends BasePage {
	@FindBy(xpath = "//input[@id ='username']")
	private WebElement userName;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement userEmail;
	@FindBy(xpath = "//input[@id='phoneNumber']")
	private WebElement userPhone;
	@FindBy(xpath = "//input[@id='question']")
	private WebElement userQuestion;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	@FindBy(xpath = "//div[@class='contactTextForm']")
	private WebElement contactTextForm;

	private void fillField(WebElement element, String value) {
		waitUntillElementToBeClickable(element);
		click(element);
		element.sendKeys(value);
	}

	public void fillField(String fieldName, String value) {
		switch (fieldName) {
			case "имя":
				fillField(userName, value);
				break;
			case "email":
				fillField(userEmail, value);
				break;
			case "телефон":
				fillField(userPhone, value);
				break;
			case "ваш вопрос":
				fillField(userQuestion, value);
				break;
		}
	}

	public void fillFields(Map<String, String> fields) {
		fields.forEach(this::fillField);
	}
	public void submit(){
		waitUntillElementToBeClickable(submit);
		click(submit);
	}
	public void checkText(String text){
		assertText(contactTextForm,text);
	}

}
