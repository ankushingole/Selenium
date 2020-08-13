package genericmethods;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	public static WebDriver driver = null;

	// 1) WaitForElememnt

	public static void waitForElement(WebElement element, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	// 2) WaitForElements

	public static void waitForElements(WebElement element, int seconds, String XPathExpression) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		List<WebElement> Input = driver.findElements(By.xpath(XPathExpression));
		wait.until(ExpectedConditions.visibilityOfAllElements(Input));

	}

	// 3) GetTextOnElements

	public static void getText(String name) {
		WebElement element = driver.findElement(By.className(name));
		String st = element.getText();
		System.out.println(st);

	}

	// 4) Take ScreenShot

	public static void takeSS(WebDriver driver, String filename) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./ScreenShot/" + filename + ".png"));
	}

	// 5) SelectDropdownValueBySelecVisibleText

	public static void selectDropDownValue(WebElement element, String value) {
		Select selectitem = new Select(element);
		selectitem.selectByValue(value);

	}

	// 6) ClickButton

	public static void clickButton(WebElement element) {

	}

	// 7) EnterText

	public static void enterText(WebElement element, String name) {

		driver.findElement(By.name(name)).sendKeys(name);
	}

}