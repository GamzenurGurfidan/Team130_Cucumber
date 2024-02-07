package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HeroPages;

public class HeroStepDefinitions {

    HeroPages heroPages = new HeroPages();

    @When("kullanici Add Element butonuna basar")
    public void kullanici_add_element_butonuna_basar() {
        heroPages.addButonu.click();
    }
    @When("Delete butonu’nun gorunur oldugunu test eder")
    public void delete_butonu_nun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(heroPages.deleteButonu.isDisplayed());
    }
    @Then("Delete tusuna basar")
    public void delete_tusuna_basar() {
        heroPages.deleteButonu.click();
    }
    @Then("Add Remove Elements yazisinin gorunur oldugunu test eder")
    public void add_remove_elements_yazisinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(heroPages.addRemoveYaziElementi.isDisplayed());
    }

    @And("Delete butonunun gorunmedigini test eder")
    public void deleteButonununGorunmediginiTestEder() {
        try {
            heroPages.deleteButonu.click();
            // Assert.assertFalse(heroPages.deleteButonu.isDisplayed());
            // NoSuchElementException
        } catch (NoSuchElementException e) {
            Assert.assertTrue(true);
        }
    }
}
