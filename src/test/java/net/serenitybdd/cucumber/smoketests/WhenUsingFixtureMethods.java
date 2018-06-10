package net.serenitybdd.cucumber.smoketests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin="cucumber.runtime.formatter.SerenityReporter",features="src/test/resources/smoketests/using_fixture_methods.feature")
public class WhenUsingFixtureMethods {
}
