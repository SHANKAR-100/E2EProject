package testCases;

import org.Locators.Basecls;
import org.Locators.LoginPage;
import org.Locators.SearchHotelPage;

public class TestLoginPage extends Basecls {

	public static void main(String[] args) throws InterruptedException {

		Basecls bs = new Basecls();
		bs.launchbrowser("chrome");
		bs.launchurl("https://adactinhotelapp.com/");

		LoginPage lp = new LoginPage();
		lp.getTxtUserName().sendKeys("karthi007");
		lp.getTxtPassWord().sendKeys("Karthi@1989");
		lp.getBtnlogin().click();
		
		SearchHotelPage sp = new SearchHotelPage();
		sp.getSelectcountry();

	}
}



