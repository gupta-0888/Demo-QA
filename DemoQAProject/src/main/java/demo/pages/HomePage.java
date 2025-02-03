package demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo.BasePage;

public class HomePage extends BasePage {
	protected WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
	WebElement byImgToolsQA;

	@FindBy(xpath = "//img[@src='/images/WB.svg']")
	WebElement byImgSCTraining;

	@FindBy(xpath = "//*[text()='Elements']")
	WebElement byBtnElements;

	@FindBy(xpath = "//*[text()='Forms']")
	WebElement byBtnForms;

	@FindBy(xpath = "//*[text()='Alerts, Frame & Windows']")
	WebElement byBtnAFWindows;

	@FindBy(xpath = "//*[text()='Widgets']")
	WebElement byBtnWidgets;

	@FindBy(xpath = "//*[text()='Interactions']")
	WebElement byBtnInteractions;

	@FindBy(xpath = "//*[text()='Book Store Application']")
	WebElement byBtnBookStore;

	public void logoCheck() {
		visibiltyOf(byImgToolsQA);
		softAssert.assertTrue(byImgToolsQA.isDisplayed(), "Tools QA is not Available");
		System.out.println("Tools QA Image is verified");

		visibiltyOf(byImgSCTraining);
		softAssert.assertTrue(byImgSCTraining.isDisplayed(), "Selenium Certificate Training is not Available");
		System.out.println("Selenium Certificate Training Img is verified");

	}

	public void btnCheck() {
		scrollToElement(byBtnElements);
		visibiltyOf(byBtnElements);
		softAssert.assertEquals(byBtnElements, "Elements", "Elements Text is mis matching");
		System.out.println("Elements text is verified");

		scrollToElement(byBtnForms);
		visibiltyOf(byBtnForms);
		softAssert.assertEquals(byBtnForms, "Forms", "Forms Text is mis matching");
		System.out.println("Forms text is verified");

		scrollToElement(byBtnAFWindows);
		visibiltyOf(byBtnAFWindows);
		softAssert.assertEquals(byBtnAFWindows, "Alerts, Frame & Windows",
				"Alerts, Frame & Windows Text is mis matching");
		System.out.println("Alerts, Frame & Windows text is verified");

		scrollToElement(byBtnWidgets);
		visibiltyOf(byBtnWidgets);
		softAssert.assertEquals(byBtnWidgets, "Widgets", "Widgets Text is mis matching");
		System.out.println("Widgets text is verified");

		scrollToElement(byBtnInteractions);
		visibiltyOf(byBtnInteractions);
		softAssert.assertEquals(byBtnInteractions, "Interactions", "Interactions Text is mis matching");
		System.out.println("Interactions text is verified");

		scrollToElement(byBtnBookStore);
		visibiltyOf(byBtnBookStore);
		softAssert.assertEquals(byBtnBookStore, "Book Store Application",
				"Book Store Application Text is mis matching");
		System.out.println("Book Store Application text is verified");
	}

	public ElementsPage clickElementPage() {
		scrollToElement(byBtnElements);
		visibiltyOf(byBtnElements);
		byBtnElements.click();
		return new ElementsPage(driver);

	}

}
