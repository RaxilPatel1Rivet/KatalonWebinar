import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ""
		,glue = ""
		,plugin = {
				"pretty"
				,"html:BDDReports/HTML/Report.html"
				,"json:BDDReports/JSON/Report.json"
		}
		)
public class CucumberRunner {

}