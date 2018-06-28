package core.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Common implements Constant {

	public static WebDriver driver;
	public static String url;
	public static long start;
	public static long finish;

	public static void open(String url) {
		driver = new HtmlUnitDriver();
		((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("Page URL: " + driver.getCurrentUrl());
		System.out.println(
				"UserAgent: " + (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;"));
	}

	public static boolean isPresent(By by) {
		if (driver.findElements(by).size() > 0)
			return true;
		else
			return false;
	}

	public static boolean isVisible(By by) {
		if ((driver.findElements(by).size() > 0) && driver.findElement(by).isDisplayed())
			return true;
		else
			return false;
	}

	public static void printElementExistence() {
		System.out.println("05. Element [Title]: " + (isPresent(el_05) ? "Exists" : "Not exist")); // signup &
		// confirmation
		System.out.println("06. Element [First Name (label)]: " + (isPresent(el_06) ? "Exists" : "Not exist")); // signup
		// &
		// confirmation
		System.out.println("07. Element [First Name (field)]: " + (isPresent(el_07) ? "Exists" : "Not exist")); // signup
		// &
		// confirmation
		System.out.println("08. Element [Last Name (label)]: " + (isPresent(el_08) ? "Exists" : "Not exist")); // signup
		// &
		// confirmation
		System.out.println("09. Element [Last Name (field)]: " + (isPresent(el_09) ? "Exists" : "Not exist")); // signup
		// &
		// confirmation
		System.out.println("10. Element [Email (label)]: " + (isPresent(el_10) ? "Exists" : "Not exist")); // signup &
		// confirmation
		System.out.println("11. Element [Email (filed)]: " + (isPresent(el_11) ? "Exists" : "Not exist")); // signup &
		// confirmation
		System.out.println("12. Element [Phone (label)]: " + (isPresent(el_12) ? "Exists" : "Not exist")); // signup &
		// confirmation
		System.out.println("13. Element [Phone (field)]: " + (isPresent(el_13) ? "Exists" : "Not exist")); // signup &
		// confirmation
		System.out.println("14. Element [Genre (label)]: " + (isPresent(el_14) ? "Exists" : "Not exist")); // signup &
		// confirmation
	}
}
