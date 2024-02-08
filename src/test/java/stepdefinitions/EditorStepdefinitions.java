package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.EditorPages;
import utilities.Driver;
import utilities.ReusableMethods;

public class EditorStepdefinitions {

    EditorPages editorPages = new EditorPages();
    String firstname;

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPages.newButonu.click();

    }
    @Then("tum bilgileri girer")
    public void tum_bilgileri_girer() {
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        firstname = faker.name().firstName();
        ReusableMethods.bekle(1);

        actions.sendKeys(firstname).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().title()).sendKeys(Keys.TAB)
                .sendKeys(faker.address().city()).sendKeys(Keys.TAB)
                .sendKeys("-").sendKeys(Keys.TAB)
                .sendKeys("2024-02-10").sendKeys(Keys.TAB)
                .sendKeys("40000").perform();


    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorPages.createButonu.click();

    }
    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {
        editorPages.searchKutusu.sendKeys(firstname);


    }
    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {
        String taplodakiIlkIsimSoyisim = editorPages.ilkIsimElementi.getText();

        Assert.assertTrue(taplodakiIlkIsimSoyisim.contains(firstname));

    }

    @Then("{string} {string} {string} {string} {string}{string} ve {string} girer")
    public void ve_girer(String firstname, String lastname, String position, String office, String extention, String date, String salary) {
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.bekle(1);
        actions.sendKeys(firstname).sendKeys(Keys.TAB)
                .sendKeys(lastname).sendKeys(Keys.TAB)
                .sendKeys(position).sendKeys(Keys.TAB)
                .sendKeys(office).sendKeys(Keys.TAB)
                .sendKeys(extention).sendKeys(Keys.TAB)
                .sendKeys(date).sendKeys(Keys.TAB)
                .sendKeys(salary).perform();
    }
    @When("kullanici {string} ile arama yapar")
    public void kullanici_ile_arama_yapar(String firstname) {
        editorPages.searchKutusu.sendKeys(firstname);
    }
    @Then("listede ilk ismin {string} icerdigini test eder")
    public void listede_ilk_ismin_icerdigini_test_eder(String firstname) {
        String actualIlkIsim = editorPages.ilkIsimElementi.getText();
        Assert.assertTrue(actualIlkIsim.contains(firstname));
    }
}
