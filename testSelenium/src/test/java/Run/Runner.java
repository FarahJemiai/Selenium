package Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(tags="",
features="src/test/features/sprint1/Orange.feature",
glue="useCases",
publish=true,
plugin= {"pretty", "html:target/cucumber_Report.html", "json:target/cucumberReport"}, 
monochrome=true,
snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
)


public class Runner {

}
