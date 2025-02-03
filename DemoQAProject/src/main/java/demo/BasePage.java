package demo;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected SoftAssert softAssert;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.softAssert = new SoftAssert();
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public void softAssertResults() {
		softAssert.assertAll();
	}

//	public WebElement visiblityOf(WebElement element) {
//		return wait.until(ExpectedConditions.visibilityOf(element));
//	}
	public WebElement visibiltyOf(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
		
	}
}
