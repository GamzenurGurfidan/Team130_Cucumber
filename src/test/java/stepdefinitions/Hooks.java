package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

   /*
        Cucumber da @Before ve @After notasyonlarini kullanmak cok verimli degildir
        Cunku hangi stepdefinitions classin altina koyarsak koyalim
        @Before notasyonuna sahip method her Scenariodan once calisir
        ayni sekilde @After notasyonu da her Scenariodan sonra calisir

        Bu sebeplerle baslangic ayarlarini yapmak veya driveri kapatmak icin
        setup methodu veya teardown kullanmak yerine
        bunlari bir step olarak hazirlayip
        istedigimizde kullanabiliriz

        Ama yine de baska bir amacla
        frameworkumuzde @Before ya da @After kullanilacaksa
        rahat bulunabilmesi ve yonetilebilmesi icin
        Hooks classina konulmasi genel kabul gormustur


    */

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.quitDriver();
    }
}
