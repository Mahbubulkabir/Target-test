package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class TestSearch extends CommonAPI{

  Logger LOG = LogManager.getLogger(TestSearch.class.getName());

  @Test
  public void searchGamesToys() throws InterruptedException {

    HomePage homePage = new HomePage(getDriver());

    String expectedTitle = "Target : Expect More. Pay Less.";
    String actualTitle = getCurrentTitle();
    Assert.assertEquals(actualTitle, expectedTitle);
    LOG.info("land to target webpage successfully");
    Thread.sleep(3000);
    homePage.typeItemToSearch("games for kids");
    homePage.clickOnSearchButton();
    String expectedTitle2 = "Games For Kids : Target";
    Thread.sleep(3000);
    String actualTitle2 = getCurrentTitle();
    Assert.assertEquals(actualTitle2, expectedTitle2);
    LOG.info("games search title validation success");
  }

  @Test
  public void searchBicyclesForToddler() throws InterruptedException {

    HomePage homePage = new HomePage(getDriver());

    String expectedHomePageTitle = "Target : Expect More. Pay Less.";
    String actualHomePageTitle = getCurrentTitle();
    Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle);
    LOG.info("land to target webpage successfully");
    Thread.sleep(3000);
    homePage.typeItemToSearch("bicycles for toddlers");
    homePage.clickOnSearchButton();
    Thread.sleep(3000);
    String expectedSearchPageTitle = "Bicycles For Toddlers : Target";
    String actualSearchPageTitle = getCurrentTitle();
    Assert.assertEquals(actualSearchPageTitle, expectedSearchPageTitle);
    LOG.info("bicycle search title validation success");
  }

  @Test
  public void loginButton() throws InterruptedException {

    HomePage homePage = new HomePage(getDriver());

    String expectedHomePage2 = "Target : Expect More. Pay Less.";
    String actualHomePage2 = getCurrentTitle();
    Assert.assertEquals(actualHomePage2, expectedHomePage2);
    LOG.info("land to target page success");
    Thread.sleep(3000);
    homePage.clickOnLoginButton();
    homePage.clickOnCreateButton();
    Thread.sleep(3000);
    String expectedTitle3 = "Login: Target";
    String actualTitle3 = getCurrentTitle();
    Assert.assertEquals(actualTitle3,expectedTitle3);
    LOG.info("welcome to login page");
  }

  @Test
  public void floatingButton() throws InterruptedException {
    HomePage homePage = new HomePage(getDriver());

    String expectedHomePage3 = "Target : Expect More. Pay Less.";
    String actualHomePage3 = getCurrentTitle();
    Assert.assertEquals(actualHomePage3, expectedHomePage3);
    LOG.info("land to target page success");
    Thread.sleep(3000);
    homePage.dropdownButton();
    Thread.sleep(3000);
    homePage.clickOnVatentine();
    Thread.sleep(3000);
    homePage.kidsValentineButton();
     Thread.sleep(3000);
    String expectedTitle4 = "Kids' Valentine's Day Books : Target";
    String actualTitle4 = getCurrentTitle();
    Assert.assertEquals(actualTitle4,expectedTitle4);
    LOG.info("kids valentines day book validation");
  }
  @Test
  public void searchPaperNapkins() throws InterruptedException {
    HomePage homePage = new HomePage(getDriver());

    String expectedHomePage4 = "Target : Expect More. Pay Less.";
    String actualHomePage4 = getCurrentTitle();
    Assert.assertEquals(actualHomePage4, expectedHomePage4);
    LOG.info("land to target page success");
    Thread.sleep(3000);
    homePage.searchItem("paper napkins");
    Thread.sleep(3000);
    homePage.clickOnSearchButton();
    Thread.sleep(3000);
    homePage.clickOnItemProduct();
    Thread.sleep(3000);
    String expectedTitle6 = "Paper Napkins : Target";
    String actualTitle6 = getCurrentTitle();
    Assert.assertEquals(actualTitle6, expectedTitle6);
    LOG.info("Product search validation success");
  }
  @Test
  public void addItemInCarts() throws InterruptedException {

    HomePage homePage = new HomePage(getDriver());

    String expectedHomePage5 = "Target : Expect More. Pay Less.";
    String actualHomePage5 = getCurrentTitle();
    Assert.assertEquals(actualHomePage5, expectedHomePage5);
    LOG.info("land to target page success");
    Thread.sleep(3000);
    homePage.searchItem("paper napkins");
    Thread.sleep(3000);
    homePage.clickOnSearchButton();
    Thread.sleep(3000);
    homePage.clickOnItemProduct();
    Thread.sleep(3000);
    homePage.addInCarts();
    Thread.sleep(3000);
    String expectedTitle7 = "Paper Napkins : Target";
    String actualTitle7 = getCurrentTitle();
    Assert.assertEquals(actualTitle7, expectedTitle7);
    LOG.info("carts adding validation success");
  }

  @Test
  public void signInButton() throws InterruptedException {

    HomePage homePage = new HomePage(getDriver());

    String expectedHomePage8 = "Target : Expect More. Pay Less.";
    String actualHomePage8 = getCurrentTitle();
    Assert.assertEquals(actualHomePage8, expectedHomePage8);
    LOG.info("land to target page success");
    Thread.sleep(3000);
    homePage.clickOnLoginButton();
    Thread.sleep(3000);
    homePage.clickSignInButton();
    Thread.sleep(3000);
    String expectedTitle8 = "Login: Target";
    String actualTitle8 = getCurrentTitle();
    Assert.assertEquals(actualTitle8,expectedTitle8);
    LOG.info("welcome to login page");
  }

  @Test
  public void findStoreLocation() throws InterruptedException {
    HomePage homePage = new HomePage(getDriver());

    String expectedHomePage9 = "Target : Expect More. Pay Less.";
    String actualHomePage9 = getCurrentTitle();
    Assert.assertEquals(actualHomePage9, expectedHomePage9);
    LOG.info("land to target page success");
    Thread.sleep(3000);
    homePage.clickOnFindStore();
    Thread.sleep(3000);
    homePage.clickOnFindStoreInfo();
    Thread.sleep(3000);
    String expectedTitle9 = "Target Minneapolis Dinkytown Store, Minneapolis, MN";
    String actualTitle9 = getCurrentTitle();
    Assert.assertEquals(actualTitle9, expectedTitle9);
    LOG.info("find store validation success");
  }
  }



