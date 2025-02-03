package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demo.pages.ElementsPage;
import demo.pages.HomePage;
import demo.pages.elementpages.CheckBoxPage;
import demo.pages.elementpages.TextBoxPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
	private static WebDriver driver;
	private HomePage homePage;
	private ElementsPage elementsPage;
	private TextBoxPage textBoxPage;
	private CheckBoxPage checkBoxPage;

	@BeforeTest
	public static WebDriver initializerDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		return driver;
	}

	@AfterTest
	public static void closingDriver() {
		if (driver != null) {
			driver.quit();
		}
	}

	@Test
	public void firstTC() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.logoCheck();
		homePage.btnCheck();
		elementsPage = homePage.clickElementPage();
		elementsPage.verifyElementUnderButtons();
		textBoxPage = elementsPage.clickTextBox();
		textBoxPage.verifyAllTextBox();
		textBoxPage.fillTextBoxForm();
		textBoxPage.clickSubmitButton();
		textBoxPage.printTextBoxOutPut();
		checkBoxPage = elementsPage.clickCheckBox();
		checkBoxPage.verifyCheckBox();
	}

}
