package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.WebUniversityPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebUniversityStepdefinitions {

    WebUniversityPage webUniversityPage = new WebUniversityPage();
    @Then("Login Portal a  kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {
        // login portal göründügü icin asagi inilmedi

        // JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        // jse.executeScript("arguments[0].scrollIntoView();",webUniversityPage.loginPortalElementi);

        // ReusableMethods.bekle(3);
    }
    @Then("Login Portal a tiklar")
    public void login_portal_a_tiklar() {
        webUniversityPage.loginPortalElementi.click();
    }
    @Then("acilan ikinci window'a gecer")
    public void acilan_ikinci_window_a_gecer() {
        String ikinciTabTitle = "WebDriver | Login Portal";

        ReusableMethods.titleIleWindowDegistir(ikinciTabTitle,Driver.getDriver());
    }
    @Then("username ve password kutularina fake degerler yazdirir")
    public void username_ve_password_kutularina_fake_degerler_yazdirir() {
        Faker faker = new Faker();
        webUniversityPage.usernameKutusu.sendKeys(faker.name().username());
        webUniversityPage.passwordKutusu.sendKeys(faker.internet().password());
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        webUniversityPage.loginButonu.click();
    }
    @Then("Popup ta cikan yazinin {string} oldugunu test eder")
    public void popup_ta_cikan_yazinin_oldugunu_test_eder(String expectedPopUpYazi) {
        String actualPopUpYazisi = Driver.getDriver().switchTo().alert().getText();

        Assert.assertEquals(expectedPopUpYazi,actualPopUpYazisi);
    }
    @Then("Ok diyerek Popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();

    }
    @When("Ilk sayfaya geri doner")
    public void ılk_sayfaya_geri_doner() {
        String ilkSayfaTitle = "WebDriverUniversity.com";

        ReusableMethods.titleIleWindowDegistir(ilkSayfaTitle,Driver.getDriver());
    }
    @Then("Ilk sayfaya donuldugunu test eder")
    public void ılk_sayfaya_donuldugunu_test_eder() {
        String expectedURl = ConfigReader.getProperty("webUniURL");
        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedURl,actualURL);
    }
}
