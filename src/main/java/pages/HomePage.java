package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {


    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // object(web element)
    @FindBy(xpath = "")
    WebElement element;

    // reusable method

}
