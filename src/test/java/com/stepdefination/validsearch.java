package com.stepdefination;

import com.pages.valid_search;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class validsearch {
	
	valid_search jpv= new valid_search();
	@Given("^:open the jpet website$")
	public void open_the_jpet_website() {
		jpv.url();
	    
	}

	@When("^:enter the item name$")
	public void enter_the_item_name()  {
		
	   jpv.JpetSearch(); 
	}

	@Then("^:Click on search bar$")
	public void click_on_search_bar()  {
		jpv.click();
		
	   
	}

	@Then("^:close the website$")
	public void close_the_website()  {
		jpv.close();
		
	    
	}




}

	