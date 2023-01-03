package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue="steps",dryRun=true,monochrome=true,plugin= {"pretty","html:test-out"})
public class Run1 extends AbstractTestNGCucumberTests
{

}
