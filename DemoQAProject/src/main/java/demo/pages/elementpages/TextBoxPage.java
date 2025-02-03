package demo.pages.elementpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo.pages.HomePage;

public class TextBoxPage extends HomePage {

	protected WebDriver driver;

	public TextBoxPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='Text Box']")
	WebElement byHeaderTextBox;

	@FindBy(id = "userName-label")
	WebElement byUserNameLabel;

	@FindBy(id = "userName")
	WebElement byTextUserName;

	@FindBy(id = "userEmail-label")
	WebElement byUserEmailLabel;

	@FindBy(id = "userEmail")
	WebElement byTextUserEmail;

	@FindBy(id = "currentAddress-label")
	WebElement byCurrentAddressLabel;

	@FindBy(id = "currentAddress")
	WebElement byTextCurrentAddress;

	@FindBy(id = "permanentAddress-label")
	WebElement byPermanentAddressLabel;

	@FindBy(id = "permanentAddress")
	WebElement byTextPermanentAddress;

	@FindBy(id = "submit")
	WebElement byBtnSubmit;
	
	@FindBy(xpath = "//div[@class='mt-4 row']")
	WebElement textBoxOutPut;

	public void verifyAllTextBox() {
		scrollToElement(byHeaderTextBox);
		visibiltyOf(byHeaderTextBox);
		softAssert.assertEquals(byHeaderTextBox, "Text Box", "Text Box text is mis matched");
		System.out.println("Text Box text is verified");

		scrollToElement(byUserNameLabel);
		visibiltyOf(byUserNameLabel);
		softAssert.assertEquals(byUserNameLabel, "Full Name", "Full Name text is mis matched");
		System.out.println("Full Name text is verified");

		scrollToElement(byTextUserName);
		visibiltyOf(byTextUserName);
		softAssert.assertEquals(byTextUserName.getAttribute("placeholder"), "Full Name",
				"Full Name Input Box  mismatching");
		System.out.println("Full Name Input box is verify");

		scrollToElement(byUserEmailLabel);
		visibiltyOf(byUserEmailLabel);
		softAssert.assertEquals(byUserEmailLabel, "Email", "Email text is mis matched");
		System.out.println("Email text is verified");

		scrollToElement(byTextUserEmail);
		visibiltyOf(byTextUserEmail);
		softAssert.assertEquals(byTextUserEmail.getAttribute("placeholder"), "name@example.com",
				"Email Input Box  mismatching");
		System.out.println("Email Input Box is verify");

		scrollToElement(byCurrentAddressLabel);
		visibiltyOf(byCurrentAddressLabel);
		softAssert.assertEquals(byCurrentAddressLabel, "Current Address", "Current Address text is mis matched");
		System.out.println("Current Address text is verified");

		scrollToElement(byTextCurrentAddress);
		visibiltyOf(byTextCurrentAddress);
		softAssert.assertEquals(byTextCurrentAddress.getAttribute("placeholder"), "Current Address",
				"Current Address Input Box  mismatching");
		System.out.println("Current Address Input Box is verify");

		scrollToElement(byPermanentAddressLabel);
		visibiltyOf(byPermanentAddressLabel);
		softAssert.assertEquals(byPermanentAddressLabel, "Permanent Address", "Permanent Address text is mis matched");
		System.out.println("Permanent Address text is verified");

	}
	public void fillTextBoxForm() {
		scrollToElement(byTextUserName);
		visibiltyOf(byTextUserName);
		byTextUserName.sendKeys("Aman Gupta");
		System.out.println("User Name is fill");
		
		scrollToElement(byTextUserEmail);
		visibiltyOf(byTextUserEmail);
		byTextUserEmail.sendKeys("amankrgupta3033@gmail.com");
		System.out.println("Email is fill");
		
		scrollToElement(byTextCurrentAddress);
		visibiltyOf(byTextCurrentAddress);
		byTextCurrentAddress.sendKeys(" A - 201, Paradise Plaza, Marunji Road, Hinjewadi, Pune");
		System.out.println("Current Address is fill");
		
		scrollToElement(byTextPermanentAddress);
		visibiltyOf(byTextPermanentAddress);
		byTextPermanentAddress.sendKeys(" ShivKumari Palace, Gopalpur, Siwan, Bihar(841286)");
		System.out.println("Permanent Address is fill");
		
	}
	
	public void clickSubmitButton() {
		scrollToElement(byBtnSubmit);
		visibiltyOf(byBtnSubmit);
		byBtnSubmit.click();
		System.out.println("Submit Button is click");
	}
	
	public void printTextBoxOutPut() {
		scrollToElement(textBoxOutPut);
		visibiltyOf(textBoxOutPut);
		System.out.println(textBoxOutPut.getText());
	}

}
