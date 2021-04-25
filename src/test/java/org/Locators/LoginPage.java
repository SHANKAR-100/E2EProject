package org.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Basecls {

	//Constructor should be created to give the driver life
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;

	@FindBy(name = "password")
	private WebElement txtPassWord;

	@FindBy(xpath = "//input[@id='login']")
	private WebElement btnlogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

}
