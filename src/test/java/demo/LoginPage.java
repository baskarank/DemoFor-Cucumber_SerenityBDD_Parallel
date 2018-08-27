package demo;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
//import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

	@FindBy(name = "userName")
	private WebElement txt_username;

	@FindBy(name = "password")
	private WebElement txt_password;

	@FindBy(name = "login")
	private WebElement btn_submit;

	public boolean launch() {
		try {
			getDriver().get("http://newtours.demoaut.com/mercurysignon.php");

			return true;
		}

		catch (Exception e) {

			return false;

		}

	}

	public boolean verifyPageTitle() {
		try {
			String pageTitle = getDriver().getTitle();

			if (pageTitle.equalsIgnoreCase("Find a Flight: Mercury Tours:")) {
				return true;
			} else {
				return false;
			}

		}

		catch (Exception e) {

			return false;

		}

	}

	public boolean enterLoginDetails(String arg1, String arg2) {

		try {
			txt_username.sendKeys(arg1);
			txt_password.sendKeys(arg2);
			btn_submit.click();

			return true;
		}

		catch (Exception e) {

			return false;

		}

	}

	

	

}
