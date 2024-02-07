package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SaucePage {
    public SaucePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    public WebElement usernameKutusu;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordKutusu;

    @FindBy(id = "login-button")
    public WebElement loginButonu;

    @FindBy(id = "item_4_title_link")
    public WebElement ilkUrunIsmi;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCart;

    @FindBy(id = "shopping_cart_container")
    public WebElement sepetButonu;

    @FindBy(id = "item_4_title_link")
    public WebElement sepettekiUrunElementi;


}
