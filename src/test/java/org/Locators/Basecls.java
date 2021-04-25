package org.Locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basecls {
	public static WebDriver driver;

	public void launchbrowser(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}

	public void launchurl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void Screenshot() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("Screenshots//scr.png");
		FileHandler.copy(screenshotAs, f);
	}
	
	public void dragAndDrop(WebElement src, WebElement trgt) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, trgt).build().perform();
	}
	
	public void btnclick(WebElement element) {
		element.click();
	}
	
	public void Selectbtn(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
}






