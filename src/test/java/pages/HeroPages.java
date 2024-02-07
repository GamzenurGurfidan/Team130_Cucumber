package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HeroPages {
    public HeroPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Add Element']")
    public WebElement addButonu;

    @FindBy (xpath = "//*[text()='Delete']")
    public WebElement deleteButonu;

    @FindBy (xpath = "//*[text()='Add/Remove Elements']")
    public WebElement addRemoveYaziElementi;
}
