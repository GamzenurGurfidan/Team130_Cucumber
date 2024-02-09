package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePages {
    public AutomationExercisePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@*='fa fa-lock']")
    public WebElement signUpLinki;

    @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    public WebElement signUpEmailKutusu;

    @FindBy(xpath = "//*[text()='Signup']")
    public WebElement signUpButonu;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement nameKutusu;

    @FindBy(id = "id_gender1")
    public WebElement mrRadioButon;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createButonu;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement acccountCreated;

}
