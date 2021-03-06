package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/test.feature",
				 glue= {"StepDefination"},
				tags="@Test",
				dryRun=false, //dry run will compile the code and checks feature and stepDef file are ready to execute. it dosen't involve steps  
				monochrome=false, //used to display console is color format. default value is false
				strict=true)  

public class testRunner {

}

/*dry run-True= is used to compile the feature and stepDefination file. default value is false
features-Set the path of feature file
glue -set the path of step definition file
tags-instruct what tag should be executed
monchrome -true- display the console output default false
formart-set all formator to use
Strict: true: will fail execution if there ae undefined steps*/