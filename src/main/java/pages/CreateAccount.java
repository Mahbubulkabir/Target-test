package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateAccount.class.getName());

    public CreateAccount(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //object

    @FindBy(xpath = "//span[text()=\"Sign in\"]")
    WebElement clickOnSignInBtn;

    @FindBy(xpath = "//span[text()=\"Create Account\"]")
    WebElement clickOnCreateAcBtn;

    @FindBy(xpath = "//input[@name=\"usernamecreateaccount\"]")
    WebElement emailField;

    @FindBy(xpath = "//input[@name=\"firstnamecreateaccount\"]")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@name=\"lastnamecreateaccount\"]")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@name=\"passwordcreateaccount\"]")
    WebElement createPasswordField;
    @FindBy(xpath = "//button[@id=\"createAccount\"]")
    WebElement clickOnFinalCreateBtn;

    //reusable method
    public void getClickOnSignInBtn(){
        clickOn(clickOnSignInBtn);
    }
    public void ClickOnCreateAcBtn(){
        clickOn(clickOnCreateAcBtn);
    }
    public void typeEmailAddress(String text) {
        type(emailField, text);
    }

    public void typeFirstName(String text) {
        type(firstNameField, text);
    }

    public void typeLastName(String text) {
        type(lastNameField, text);
    }

    public void typeCreatePasswordField(String text) {
        type(createPasswordField, text);
    }
    public void setClickOnFinalCreateBtn(){
        clickOn(clickOnFinalCreateBtn);
    }
    }