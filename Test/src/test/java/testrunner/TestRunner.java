package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
features= "Feature/Test23.feature",
glue= "stepdefination",
plugin = {	"html:Test_Report/CucumberReport/Test/html",
		"json:Test_Report/CucumberReport/Test/json/result.json",
		"junit:Test_Report/CucumberReport/Test/junit/result.xml"
}
)
public class TestRunner {

}
