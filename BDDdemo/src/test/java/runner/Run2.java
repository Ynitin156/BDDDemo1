package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Feature\\n2.feature",glue="steps",dryRun=false,monochrome=false)
public class Run2 extends AbstractTestNGCucumberTests
{

}
