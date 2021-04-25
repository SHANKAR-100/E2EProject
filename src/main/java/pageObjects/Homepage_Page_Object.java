package pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage_Page_Object {

	public WebDriver driver;

	public Homepage_Page_Object(WebDriver driver) // this is called constructor. 
	{

		this.driver = driver;
	}

	By cancelbtn = By.xpath("//button[@class='_2KpZ6l _2doB4z']");
	By header = By.xpath("//div[@class='_1kidPb']");
	By electronics = By.xpath("//div[@class='_1kidPb'] //child :: span[1]");
	By Samsung = By.xpath("//div[@class='_1QrT3s'] //div//a[text()='Samsung']");
	By Samsungmob = By.xpath("//div[@data-tracking-id='Latest Samsung mobiles ']//div//a[@class='_2rpwqI']");
	By AddtoCart = By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");
	By itemincreament = By.xpath("//div[@class='_3dY_ZR'] //button[2]");
	
	
	

	public WebElement getcancelbtn() {
		return driver.findElement(cancelbtn);
	}
	
	public void getheader() {
		List<WebElement> headers = driver.findElements(header);

		for (WebElement header : headers) {
			System.out.println(header.getText());
		}
	}
	
	public WebElement getelectronics() {
		return driver.findElement(electronics);
	}
	
	public WebElement getSamsung() {
		return driver.findElement(Samsung);
	}
	
	public WebElement getSamsungmob() {
		return driver.findElement(Samsungmob);
	}
	
	public void getAddtoCart() {
		
		Set<String> win = driver.getWindowHandles();
		Iterator<String> windows = win.iterator();

		String parent = windows.next();
		String child = windows.next();

		driver.switchTo().window(child);
		
		System.out.println(driver.getTitle());
				
		driver.findElement(AddtoCart).click();
	}
	
	public WebElement getitemincreament() {
		return driver.findElement(itemincreament);
	}

}
