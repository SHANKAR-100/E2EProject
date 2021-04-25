package org.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotelPage {
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement Selectcountry;

	public WebElement getSelectcountry() {
		return Selectcountry;
	}

}
