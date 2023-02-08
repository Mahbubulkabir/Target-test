package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatAccount extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreatAccount.class.getName());
    public CreatAccount(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

      //object
      @FindBy(xpath = "")
      WebElement emailField;

      @FindBy(xpath = "")
      WebElement firstNameField;

    @FindBy(xpath = "")
    WebElement firstNameField;

    @FindBy(xpath = "")
    WebElement firstNameField;



      //reusable method
      public void typeEmailAddress(String text){
          type(firstNameField, text);
        }
    public void typeEmailAddress(String text){
        type(emailField, text);
    }
    public void typeEmailAddress(String text){
        type(emailField, text);
    }
    }

