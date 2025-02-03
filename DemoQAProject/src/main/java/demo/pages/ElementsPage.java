package demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo.BasePage;
import demo.pages.elementpages.CheckBoxPage;
import demo.pages.elementpages.TextBoxPage;

public class ElementsPage extends BasePage {
	protected WebDriver driver;

	public ElementsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Text Box']")
	WebElement byBtnTextBox;

	@FindBy(xpath = "//span[text()='Check Box']")
	WebElement byBtnCheckBox;

	@FindBy(xpath = "//span[text()='Radio Button']")
	WebElement byBtnRadioButton;

	@FindBy(xpath = "//span[text()='Web Tables']")
	WebElement byBtnWebTables;

	@FindBy(xpath = "//span[text()='Buttons']")
	WebElement byBtnButtons;

	@FindBy(xpath = "//span[text()='Links']")
	WebElement byBtnLinks;

	@FindBy(xpath = "//span[text()='Broken Links - Images']")
	WebElement byBtnBrokenLinksImg;

	@FindBy(xpath = "//span[text()='Upload and Download']")
	WebElement byBtnUploadAndDownload;

	@FindBy(xpath = "//span[text()='Dynamic Properties']")
	WebElement byBtnDynamicProperties;

	public void verifyElementUnderButtons() {
		scrollToElement(byBtnTextBox);
		visibiltyOf(byBtnTextBox);
		softAssert.assertEquals(byBtnTextBox, "Text Box", "Text Box text is mis mtached");
		System.out.println("Text Box text is verified");

		scrollToElement(byBtnCheckBox);
		visibiltyOf(byBtnCheckBox);
		softAssert.assertEquals(byBtnCheckBox, "Check Box", "Check Box text is mis mtached");
		System.out.println("Check Box text is verified");

		scrollToElement(byBtnRadioButton);
		visibiltyOf(byBtnRadioButton);
		softAssert.assertEquals(byBtnRadioButton, "Radio Button", "Radio Button text is mis mtached");
		System.out.println("Radio Button text is verified");

		scrollToElement(byBtnWebTables);
		visibiltyOf(byBtnWebTables);
		softAssert.assertEquals(byBtnWebTables, "Web Tables", "Web Tables text is mis mtached");
		System.out.println("Web Tables text is verified");

		scrollToElement(byBtnButtons);
		visibiltyOf(byBtnButtons);
		softAssert.assertEquals(byBtnButtons, "Buttons", "Buttons text is mis mtached");
		System.out.println("Buttons text is verified");

		scrollToElement(byBtnLinks);
		visibiltyOf(byBtnLinks);
		softAssert.assertEquals(byBtnLinks, "Links", "Links text is mis mtached");
		System.out.println("Links text is verified");

		scrollToElement(byBtnBrokenLinksImg);
		visibiltyOf(byBtnBrokenLinksImg);
		softAssert.assertEquals(byBtnBrokenLinksImg, "Broken Links - Images",
				"Broken Links - Images text is mis mtached");
		System.out.println("Broken Links - Images text is verified");

		scrollToElement(byBtnUploadAndDownload);
		visibiltyOf(byBtnUploadAndDownload);
		softAssert.assertEquals(byBtnUploadAndDownload, "Upload and Download",
				"Upload and Download text is mis mtached");
		System.out.println("Upload and Download text is verified");

		scrollToElement(byBtnDynamicProperties);
		visibiltyOf(byBtnDynamicProperties);
		softAssert.assertEquals(byBtnDynamicProperties, "Dynamic Properties", "Dynamic Properties text is mis mtached");
		System.out.println("Dynamic Properties text is verified");

	}

	public TextBoxPage clickTextBox() {
		scrollToElement(byBtnTextBox);
		visibiltyOf(byBtnTextBox);
		byBtnTextBox.click();
		System.out.println("Text Box is click");
		return new TextBoxPage(driver);
	}

	public CheckBoxPage clickCheckBox() {
		scrollToElement(byBtnCheckBox);
		visibiltyOf(byBtnCheckBox);
		byBtnCheckBox.click();
		System.out.println("Check Box is click");
		return new CheckBoxPage(driver);
	}

}
