package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/rapor.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun =  false
        // true oldugunda sadece eksik adim var mi diye kontrol eder
)
public class Runner {
    // runner classi boş bir classdir
    // ama kullandigi notasyonlar sayesine
    // projesinin build edilmesini ve
    // istenen feature dasyalarinin toplu olarak calistirilmasini sagilar
}
