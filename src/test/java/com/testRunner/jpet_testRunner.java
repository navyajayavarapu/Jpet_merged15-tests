package com.testRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		
		features="src/main/resources/feature/validsearch.feature",
		tags= {"@tc01_register","@tc02_Login","@tc03_Searchmain","@tc04_search","@tc05_invalidsearch"," @tc06_searchbyhint"," @tc07_searchbyhomepage"," @tc08_searchbyproductid","@tc09_jpetstorelogin","@tc10_addtocart\r\n" + 
				"","@tc11_addtocart","@tc12_removefromcart","@tc13_signout","@tc14_printtable"},
		glue= {"steps"},
		monochrome=true
		)

public class jpet_testRunner {

}
