package demo;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.core.pages.WebElementFacade;

public class FinderPage extends PageObject {

	@FindBy(name = "userName")
	private WebElementFacade txt_username;

	@FindBy(name = "password")
	private WebElementFacade txt_password;

	@FindBy(name = "login")
	private WebElementFacade btn_submit;

	@FindBy(xpath = "//input[@value='oneway']")
	private WebElementFacade oneway;

	@FindBy(xpath = "//input[@value='roundtrip']")
	private WebElementFacade roundtrip;

	@FindBy(xpath = "//select[@name='passCount']")
	private WebElementFacade passCount;

	@FindBy(xpath = "//select[@name='fromPort']")
	private WebElementFacade fromPort;

	@FindBy(xpath = "//select[@name='fromMonth']")
	private WebElementFacade fromMonth;

	@FindBy(xpath = "//select[@name='fromDay']")
	private WebElementFacade fromDay;

	@FindBy(xpath = "//select[@name='toPort']")
	private WebElementFacade toPort;

	@FindBy(xpath = "//select[@name='toMonth']")
	private WebElementFacade toMonth;

	@FindBy(xpath = "//select[@name='toDay']")
	private WebElementFacade toDay;

	@FindBy(xpath = "//select[@name='airline']")
	private WebElementFacade airline;

	@FindBy(xpath = "//input[@value='First']")
	private WebElementFacade classTypeFirst;

	@FindBy(name = "findFlights")
	private WebElementFacade findFlights;

	@FindBy(name = "reserveFlights")
	private WebElementFacade reserveFlights;

	public boolean verifyPageTitle() {
		try {
			String pageTitle = getDriver().getTitle();

			if (pageTitle.equalsIgnoreCase("Find a Flight: Mercury Tours:")) {
				return false;
			} else {
				return false;
			}

		}

		catch (Exception e) {

			return false;

		}

	}

	public boolean selectTripType(String arg1) {
		try {

			if (arg1.equals("one way")) {
				oneway.click();
			}

			else {
				roundtrip.click();
			}

			return true;
		}

		catch (Exception e) {

			return false;

		}

	}

	public boolean setCount(String arg1) {
		try {
			passCount.selectByValue(arg1);
			// We skipped select class of sel
			return true;
		}

		catch (Exception e) {

			return false;

		}
	}

	public boolean selectDateFrom(String arg1, String arg2) {
		try {
			fromMonth.selectByVisibleText(arg1);
			fromDay.selectByVisibleText(arg2);
			return true;
		}

		catch (Exception e) {

			return false;

		}
	}

	public boolean selectDateTo(String arg1, String arg2) {
		try {
			toMonth.selectByVisibleText(arg1);
			toDay.selectByVisibleText(arg2);
			return true;
		}

		catch (Exception e) {

			return false;

		}
	}

	public boolean selectArrival(String arg1) {
		try {
			toPort.selectByVisibleText(arg1);
			return true;
		}

		catch (Exception e) {

			return false;

		}
	}

	public boolean selectPreference(String arg1, String arg2) {
		try {
			airline.selectByVisibleText(arg2);
			classTypeFirst.click();
			return true;
		}

		catch (Exception e) {
			return false;

		}
	}

	public boolean clickButton() {
		try {
			findFlights.click();
			return true;
		}

		catch (Exception e) {

			return false;

		}
	}

	public boolean selectDeparture(String arg1) {
		try {
			fromPort.selectByVisibleText(arg1);
			return true;
		}

		catch (Exception e) {

			return false;

		}
	}

	public boolean verifyReserveFlight() {
		try {
			reserveFlights.shouldBeEnabled();
			return true;
		}

		catch (Exception e) {

			return false;

		}
	}
}
