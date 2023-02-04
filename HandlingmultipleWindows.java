package PracticeSeleniumJava;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingmultipleWindows {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()","(//a[contains(@href,'ssoredirect')])[2]");
		WebElement primevideo = driver.findElement(By.xpath("(//a[contains(@href,'ssoredirect')])[2]"));
		primevideo.click();
		String mainwindow = driver.getWindowHandle();
		Set<String> childwindows = driver.getWindowHandles();
		for(String window:childwindows) {
			if(window.equals(mainwindow)) {
				continue;
			}
			driver.switchTo().window(window);
		}
		
	}

}
