package com.stepdefination;

import com.pages.homepage_search;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homepagesearch {
	homepage_search jph=new homepage_search();
	@Given("^:Open the JPET website$")
	public void open_the_JPET_website()  {
		jph.url();
	}

	@When("^:click on image$")
	public void click_on_image()  {
	  jph.JpetSearch();
	}

	@Then("^:click on Search$")
	public void click_on_Search() {
	   jph.click();
	}

	@Then("^:Close The Website$")
	public void close_The_Website()  {
		jph.close();
	    
	}




}
