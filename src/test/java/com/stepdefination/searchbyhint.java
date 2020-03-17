package com.stepdefination;

import com.pages.hint_search;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchbyhint {
	hint_search jph= new hint_search();

	

	@Given("^:Open the Jpet website$")
	public void open_the_Jpet_website()  {
		jph.url();
	}
	@When("^:Enter the Item name with hint$")
	public void enter_the_Item_name_with_hint()  {
		jph.JpetSearch();
	}
	    
	@Then("^:click on Search bar$")
	public void click_on_Search_bar()  {
		jph.click();
	}
	@Then("^:Close the Website$")
	public void close_the_Website()  {
		jph.close();
	}
}





