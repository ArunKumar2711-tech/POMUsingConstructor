package Running;



//import org.junit.runner.RunWith;

//import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(tags="",features= {"src/test/resources/Features/fb_login.feature"}, 
glue= {"stepDefinitions"},
plugin= {"pretty",
		
         "html:target/htmlreport.html",
         "html:target/MyReports.json"})

public class CucumberTestRunner extends AbstractTestNGCucumberTests  {

}
