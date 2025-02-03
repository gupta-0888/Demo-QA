package demo.pages.elementpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo.pages.HomePage;

public class CheckBoxPage extends HomePage {

	protected WebDriver driver;

	public CheckBoxPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='Check Box']")
	WebElement byHeaderCheckBox;
	
	public void verifyCheckBox() {
		scrollToElement(byHeaderCheckBox);
		visibiltyOf(byHeaderCheckBox);
		softAssert.assertEquals(byHeaderCheckBox, "Check Box", "Check Box text is mis matched");
		System.out.println("Check Box text is verified");
	}
}
