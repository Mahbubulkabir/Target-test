package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

     Logger LOG = LogManager.getLogger(HomePage.class.getName());
    public HomePage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    // object(web element)
    @FindBy(xpath = "//input[@type=\"search\"]")
    WebElement searchField;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement searchButton;

    @FindBy(xpath = "//a[@id=\"utilityNav-findStores\"]")
    WebElement clickOnFindButton;

    @FindBy(xpath = "//a[@aria-label=\"Store info for Minneapolis Dinkytown\"]")
    WebElement clickOnStoreInfo;

    @FindBy(xpath = "//span[text()=\"Create Account\"]")
    WebElement CreateAcButton;

    @FindBy(xpath = "")
    WebElement floatingMenu;

    @FindBy(xpath = "//span[text()=\"Sign in\"]")
    WebElement loginButton;

    @FindBy(xpath = "//li[@id=\"listaccountNav-signIn\"]/a/span")
    WebElement selectSignIn;

    @FindBy(xpath = "//a[text()=\"Categories\"]")
    WebElement menuDropdown;

    @FindBy(xpath = "//a[@data-id=\"5xt1e\"]/div/span")
    WebElement selectMenu;

     @FindBy(xpath = "//span[text()=\"Kids' Valentine's Day Books\"]")
     WebElement selectKids;

     @FindBy(xpath = "//a[@data-lnk=\"slp_nav_55t3i\"]/div//picture/img")
     WebElement clickOnProduct;

     @FindBy(xpath = "//button[@id=\"addToCartButtonOrTextIdFor50614385\"]")
     WebElement itemInCarts;

    // reusable method

    public void typeItemToSearch(String item){
        type(searchField, item);
        LOG.info("item name type success");
    }
    public void clickOnSearchButton(){
        clickOn(searchButton);
        LOG.info("click search success");
    }
    public void clickOnFindStore(){
        clickOn(clickOnFindButton);
    }
    public void clickOnFindStoreInfo(){
        clickOn(clickOnStoreInfo);
    }
    public void searchItem(String item){
        typeAndEnter(searchField, item);
        LOG.info("item name type and enter success");
    }
    public void selectOptionFromMenuDropdown(String Option){
        selectOptionFromDropdown(menuDropdown, Option);
        LOG.info(Option+" option selected from the dropdown");
    }
    public void hoverOverFloatingMenu(WebDriver driver){
        hoverOver(driver, floatingMenu);
        LOG.info("hover over menu success");
    }
    public void clickOnLoginButton() {
        clickOn(loginButton);
        LOG.info("click on login button success");
    }
    public void clickSignInButton(){
        clickOn(selectSignIn);
    }
    public void clickOnCreateButton(){

        clickOn(CreateAcButton);
    }
    public void dropdownButton(){
        clickOn(menuDropdown);
    }
    public void clickOnVatentine(){
        clickOn(selectMenu);
    }
    public void kidsValentineButton(){
        clickOn(selectKids);
    }
    public void clickOnItemProduct(){
        clickOn(clickOnProduct);
    }
    public void addInCarts(){
        clickOn(itemInCarts);
    }
    }




