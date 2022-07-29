package com.demo.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.interactions.SendKeysAction;

import com.demo.pages.demoPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demoStep extends StepDefinitionInit {

	@Given("^The Home page is visible$")
	public void the_Home_page_is_visible() throws Throwable {

		Assert.assertTrue(demopage.isHomePageVisible());

	}

	@Then("^Verify the url is as expected$")
	public void verify_the_url_is_as_expected() throws Throwable {
		Assert.assertTrue(demopage.isUrlCorrect());

	}


	@When("^Select any category from the header$")
	public void select_any_category_from_the_header() throws Throwable {
		demopage.selectCategory();

	}

	@When("^Select any brand from brand filter$")
	public void select_any_brand_from_brand_filter() throws Throwable {
		demopage.selectBrand();
	}

	@Then("^Verify the options are displayed according the the filter$")
	public void verify_the_options_are_displayed_according_the_the_filter() throws Throwable {

		Assert.assertTrue(demopage.areOptionsAccordingToFilterSet());

	}



	//------------Below steps are for test leaf scenario-------------------------//


	@When("^I go to test leaf button url$")
	public void i_go_to_test_leaf_button_url() throws Throwable {
		demopage.gotoButtonURL(); 

	}

	@When("^I click on goto home page$")
	public void i_click_on_goto_home_page() throws Throwable {
		demopage.clickHomePageButton(); 
	}

	@Then("^I validate if I am on the right page$")
	public void i_validate_if_i_am_on_the_right_page() throws Throwable {
		Assert.assertTrue(demopage.validateurl()); 
	}

	@Then("^i validate I am redirected to home page$")
	public void i_validate_i_am_redirected_to_home_page() throws Throwable {
		Assert.assertTrue(demopage.validateRedierction()); 
	}








	//------------Below steps are for GitHub login page scenario-------------------------//

	@Given("^I go to GitHub page url$")
	public void i_go_to_github_page_url() throws Throwable {
		demopage.gotoHomePageURL();
	}

	@When("^I click on SignIn$")
	public void i_click_on_signin() throws Throwable {
		demopage.clickOnSignIn();
	}

	@When("^I pass data into email field$")
	public void i_pass_data_into_email_field() throws Throwable {
		demopage.emailField();
	}

	@Then("^I verify the homepage visible$")
	public void i_verify_the_homepage_visible() throws Throwable {
		Assert.assertTrue(demopage.HomepageVisible());
	}

	@Then("^I verify SignIn element is visible$")
	public void i_verify_signin_element_is_visible() throws Throwable {
		Assert.assertTrue(demopage.signinVisible());
	}

	@Then("^I Verify the actual and expected urls are same$")
	public void i_verify_the_actual_and_expected_urls_are_same() throws Throwable {
		Assert.assertTrue(demopage.validateGitHubUrl());
	}

	@Then("^I pass data in password field$")
	public void i_pass_data_in_password_field() throws Throwable {
		demopage.passwordField();
	}

	@Then("^I click on SignIn button$")
	public void i_click_on_signin_button() throws Throwable {
		demopage.clickonSigninButton();
	}
	
	//------------Below steps are for Amazon product Add to cart scenario-------------------------//
	
	@Given("^Go to Amazon page url$")
    public void go_to_amazon_page_url() throws Throwable {
        demopage.goToAmazonHomePage();
    }

    @When("^Enter data in search box$")
    public void enter_data_in_search_box() throws Throwable {
        demopage.enterData();
    }

    @When("^Select the iphone$")
    public void select_the_iphone() throws Throwable {
        demopage.selectIphone();
    }

    @When("^Click on No Thanks button$")
    public void click_on_no_thanks_button() throws Throwable {
        demopage.noThanksButton();
    }

    @Then("^Verify the url is same as expected$")
    public void verify_the_url_is_same_as_expected() throws Throwable {
       Assert.assertTrue(demopage.validateAmazonUrl());
    }

    @Then("^Verify the options are displayed according to the filter$")
    public void verify_the_options_are_displayed_according_to_the_filter() throws Throwable {
        Assert.assertTrue(demopage.optionsDisplayed());
    }

    @Then("^Verify add to cart button is visible$")
    public void verify_add_to_cart_button_is_visible() throws Throwable {
    	Assert.assertTrue(demopage.addToCartDisplayed());
    }

    @Then("^Verify the product is in add to cart$")
    public void verify_the_product_is_in_add_to_cart() throws Throwable {
    	Assert.assertTrue(demopage.productInCart());
    }

    @And("^Click on search button$")
    public void click_on_search_button() throws Throwable {
        demopage.clickOnSearch();
    }

    @And("^Scroll down till Apple iPhone 13 Pro, 128GB, Graphite$")
    public void scroll_down_till_apple_iphone_13_pro_128gb_graphite() throws Throwable {
    	demopage.scrollDown();
    }

    @And("^Click on add to cart button$")
    public void click_on_add_to_cart_button() throws Throwable {
        demopage.clickOnAddToCart();
    }

    @And("^Close browser$")
    public void close_browser() throws Throwable {
        demopage.closeBrowser();
    }


//------------Below steps are for Verify login functionality on Biskane login page scenario-------------------------//

@Given("^User go to Biskane page url$")
public void user_go_to_biskane_page_url() throws Throwable {
    demopage.biskanePageURL();
}

@When("^User enter data into email field$")
public void user_enter_data_into_email_field() throws Throwable {
    demopage.loginEmail();
}

@When("^User click on SignIn$")
public void user_click_on_signin() throws Throwable {
    demopage.clickHomepageSignin();
}

@Then("^Verify Dashboard page$")
public void verify_dashboard_page() throws Throwable {
	 Assert.assertTrue(demopage.validateDashboard());
}

@And("^User enter data into password field$")
public void user_enter_data_into_password_field() throws Throwable {
    demopage.loginPassword();
}

@And("^Click on logs out button$")
public void click_on_logs_out_button() throws Throwable {
    demopage.logoutButton();
}
@When("^User click on Home$")
public void user_click_on_home() throws Throwable {
    demopage.clickHome();
}

@When("^Counts number of elements in the categories$")
public void counts_number_of_elements_in_the_categories() throws Throwable {
    demopage.numberOfElements();
}

@Then("^Verify shop page$")
public void verify_shop_page() throws Throwable {
	Assert.assertTrue(demopage.verifyShopPage());
}

@And("^click on Shop now$")
public void click_on_shop_now() throws Throwable {
    demopage.clickShopNow();
}
@When("^Click on switch user$")
public void click_on_switch_user() throws Throwable {
    demopage.clickOnSwitchUser();
}

@When("^Click on Yes button$")
public void click_on_yes_button() throws Throwable {
    demopage.clickOnYesButton();
}

@Then("^Verify Artist page$")
public void verify_artist_page() throws Throwable {
	Assert.assertTrue(demopage.validateArtistPage());
}

@And("^Select on Artist from switch user$")
public void select_on_artist_from_switch_user() throws Throwable {
    demopage.selectArtist();
}

}















