package demo;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	LoginPage mp = new LoginPage();
	FinderPage fp = new FinderPage();

	@Given("^I launched the mercury tours$")
	public void i_launched_the_mercury_tours() throws Exception {

		Assert.assertTrue(mp.launch());
	}

	@When("^I enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_the_and(String arg1, String arg2) throws Exception {
		Assert.assertTrue(mp.enterLoginDetails(arg1, arg2));

	}

	@Then("^I should be navigate into Flight details page$")
	public void i_should_be_navigate_into_Flight_details_page() throws Exception {

		Assert.assertTrue(mp.verifyPageTitle());

	}
	
	@Given("^I selected the trip type as \"([^\"]*)\"$")
	public void i_selected_the_trip_type_as_one_way(String arg1) throws Exception {
	    Assert.assertTrue(fp.selectTripType(arg1));
	}

	@Given("^I give the passenger count as \"([^\"]*)\"$")
	public void i_give_the_passenger_count_as(String arg1) throws Exception {
		Assert.assertTrue(fp.setCount(arg1));
	}

	@Given("^I select the departure as \"([^\"]*)\"$")
	public void i_select_the_departure_as(String arg1) throws Exception {
		Assert.assertTrue(fp.selectDeparture(arg1));
	}

	@Given("^the from date selected as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_from_date_selected_as(String arg1, String arg2) throws Exception {
		Assert.assertTrue(fp.selectDateFrom(arg1, arg2));
	}

	@Given("^the to date selected as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_to_date_selected_as(String arg1, String arg2) throws Exception {
		Assert.assertTrue(fp.selectDateTo(arg1, arg2));
	}

	@Given("^I select the Arrival as \"([^\"]*)\"$")
	public void i_select_the_Arrival_as(String arg1) throws Exception {
		Assert.assertTrue(fp.selectArrival(arg1));
	}

	@Given("^the prefered class as \"([^\"]*)\" and the airline as \"([^\"]*)\"$")
	public void the_prefered_class_as_and_the_airline_as(String arg1, String arg2) throws Exception {
		Assert.assertTrue(fp.selectPreference(arg1, arg2));
	}

	@When("^I click the continue button$")
	public void i_click_the_continue_button() throws Exception {
		Assert.assertTrue(fp.clickButton());
	}

	@Then("^I should see the select Flight page$")
	public void i_should_see_the_select_Flight_page() throws Exception {
		Assert.assertTrue(fp.verifyReserveFlight());
	}

}
