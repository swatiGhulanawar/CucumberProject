package cucmberOptions;



import org.junit.runner.RunWith;


@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features="src/test/java/featureFile" ,
		glue="stepDefinations"
       )

public class testrunner {
	

}
