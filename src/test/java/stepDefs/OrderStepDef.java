package stepDefs;

import Pages.HomePage;
import Pages.SearchItemPage;
import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderStepDef extends TestBase{
	HomePage homePage;
	SearchItemPage searchItemPage;
	@Given("User is on Home page")
	public void user_is_on_home_page() {
		initialize();
	}
	@When("User search an item {string}")
	public void user_search_an_item(String strItem) throws InterruptedException {
	    homePage = new HomePage();
	    homePage.searchItem(strItem);
	}

	@Given("Item must be displayed")
	public void item_must_be_displayed() throws InterruptedException {
		searchItemPage = new SearchItemPage();
		searchItemPage.isItemListed();
	    
	}
	@When("User Add Item to Cart")
	public void user_add_item_to_cart() throws InterruptedException {
		searchItemPage = new SearchItemPage();
		searchItemPage.selectItem();
		}
	@Then("Item must be listed in cart")
	public void item_must_be_listed_in_cart() throws InterruptedException {
		searchItemPage = new SearchItemPage();
		searchItemPage.addToCart();
	}

}
