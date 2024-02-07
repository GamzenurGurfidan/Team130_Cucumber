package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.SaucePage;

public class SauceDemoStepdefinitions {
    SaucePage saucePage = new SaucePage();
    String strIlkUrunIsmi;

    @Then("saucedemo username kutusuna {string} yazar")
    public void saucedemo_username_kutusuna_yazar(String username) {
        saucePage.usernameKutusu.sendKeys(username);

    }
    @Then("saucedemo password kutusuna {string} yazar")
    public void saucedemo_password_kutusuna_yazar(String password) {
        saucePage.passwordKutusu.sendKeys(password);

    }
    @Then("saucedemo login tusuna basar")
    public void saucedemo_login_tusuna_basar() {
        saucePage.loginButonu.click();

    }
    @Then("ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {
        strIlkUrunIsmi = saucePage.ilkUrunIsmi.getText();

        saucePage.ilkUrunIsmi.click();

    }
    @When("saucedemo add to Cart butonuna basar")
    public void saucedemo_add_to_cart_butonuna_basar() {
        saucePage.addToCart.click();

    }
    @Then("saucedemo alisveris sepetine tiklar")
    public void saucedemo_alisveris_sepetine_tiklar() {
        saucePage.sepetButonu.click();

    }
    @Then("sectigi urunun basarili olarak sepete eklendigini test eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_test_eder() {

        String sepettekiUrunIsmi = saucePage.sepettekiUrunElementi.getText();

        Assert.assertEquals(strIlkUrunIsmi,sepettekiUrunIsmi);

    }
}
