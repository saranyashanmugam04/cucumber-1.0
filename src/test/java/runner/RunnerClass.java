package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) //execute cucumber file
@CucumberOptions(features="src\\test\\resources\\FeatureFolder\\feature5.feature", 
					glue="stepdefinition",
					//tags={"@login,@addproduct,@logout"},
					//tags={"~@registration","~@logout"}, // except registrtaion , logout
					plugin={"html:target/htmlreport",
							"junit:target/xmlreport.xml",
							"json:target/jsonreport.json"})

public class RunnerClass {

}
