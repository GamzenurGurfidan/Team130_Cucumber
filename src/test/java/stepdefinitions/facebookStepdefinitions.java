package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.FacebookPage;
import utilities.Driver;

public class facebookStepdefinitions {

    FacebookPage facebookPage = new FacebookPage();

    @Then("facebook cookies kabul eder")
    public void facebook_cookies_kabul_eder() {
        // cıkmadigi için bu adim pass gecilmiştir
    }
    @Then("facebook'da yeni hesap olustur butonuna basar")
    public void facebook_da_yeni_hesap_olustur_butonuna_basar() {
        facebookPage.yeniHesapOlustur.click();
    }
    @When("Faker class'indan bilgilerle facebook kayit formunu doldurur")
    public void faker_class_indan_bilgilerle_facebook_kayit_formunu_doldurur() {
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        String fakeEmail = faker.internet().emailAddress();

        actions.sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(fakeEmail).sendKeys(Keys.TAB)
                .sendKeys(fakeEmail).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password()).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("10").sendKeys(Keys.TAB)
                .sendKeys("mar").sendKeys(Keys.TAB)
                .sendKeys("1990").sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_LEFT).perform();


    }
    @Then("facebook kayit ol tusuna basar")
    public void facebook_kayit_ol_tusuna_basar() {
        facebookPage.kaydolButonu.click();
    }
}
