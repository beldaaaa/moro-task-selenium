package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


   @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"features"},
            glue = {"steps"},
            plugin = {"pretty","json:target/json-report/cucumber.json"},
            dryRun = false,
            tags = "@P1"
    )
    public class TestRunner {}

