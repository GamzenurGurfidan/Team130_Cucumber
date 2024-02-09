package stepdefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercisePages;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationExerciseStepdefinitation {

    AutomationExercisePages automationExercisePages = new AutomationExercisePages();
    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        automationExercisePages.signUpLinki.click();
    }

    @And("user Create an account bolumune email adresi girer")
    public void userCreateAnAccountBolumuneEmailAdresiGirer() {
        automationExercisePages.nameKutusu.sendKeys("husnu");
        automationExercisePages.signUpEmailKutusu.sendKeys("husnn@gmail.com");

    }
    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {
        automationExercisePages.signUpButonu.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(automationExercisePages.mrRadioButon)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("159634").sendKeys(Keys.TAB)
                .sendKeys("10").sendKeys(Keys.TAB)
                .sendKeys("April").sendKeys(Keys.TAB)
                .sendKeys("1992").sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("Husnu").sendKeys(Keys.TAB)
                .sendKeys("Husnugil").sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("adres bilgisi").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("state").sendKeys(Keys.TAB)
                .sendKeys("city").sendKeys(Keys.TAB)
                .sendKeys("45632").sendKeys(Keys.TAB).sendKeys("523698741").perform();

        ReusableMethods.bekle(2);
    }
    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {
        automationExercisePages.createButonu.click();
    }
    @Then("hesap olustugunu test edin")
    public void hesap_olustugunu_test_edin() {


        Assert.assertTrue(automationExercisePages.acccountCreated.isDisplayed());

    }

}

