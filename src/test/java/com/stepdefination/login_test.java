package com.stepdefination;



	import java.io.IOException;

	import com.pages.login_page;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class login_test 
	{
		login_page d= new login_page();
		@Given("^the user launched the chromebrowser$")
		public void the_user_launched_the_chromebrowser()
		{
		   d.url();
		}

		@When("^the user open the JPetStore website$")
		public void the_user_open_the_JPetStore_website() 
		{

	        d.loginpage();
		}

		@Then("^user clicks on login button$")
		public void user_clicks_on_login_button()
		{
		    d.logindetails();
		}

		@Then("^the user enters the username and password clicks on login button$")
		public void the_user_enters_the_username_and_password_clicks_on_login_button() throws IOException, InterruptedException 
		{
			d.submit();
		}
		  


	}


