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
  public void searchGamesToys() {

    HomePage homePage = new HomePage(getDriver());

    String expectedTitle = "Walmart.com | Save Money. Live Better";
    String actualTitle = getCurrentTitle();
    Assert.assertEquals(actualTitle, expectedTitle);
    LOG.info("land to walmart webpage successfully");

    homePage.typeItemToSearch("games in toys");
    homePage.clickOnSearchButton();

    String expectedTitle2 = "games in toys - Walmart.com";
    String actualTitle2 = getCurrentTitle();
    Assert.assertEquals(actualTitle2, expectedTitle2);
    LOG.info("games search title validation success");
  }

  @Test
  public void searchBicyclesForToddler() {

    HomePage homePage = new HomePage(getDriver());

    String expectedHomePageTitle = "Walmart.com | Save Money. Live Better";
    String actualHomePageTitle = getCurrentTitle();
    Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle);
    LOG.info("land to walmart webpage successfully");

    homePage.typeItemToSearch("bicycle for kids");
    homePage.clickOnSearchButton();

    String expectedSearchPageTitle = "bicycle for kids - Walmart.com";
    String actualSearchPageTitle = getCurrentTitle();
    Assert.assertEquals(actualSearchPageTitle, expectedSearchPageTitle);
    LOG.info("bicycle search title validation success");
  }
  @Test
  public void searchJava(){
    HomePage homePage = new HomePage(getDriver());

    String expectedHomePageTitle = "Walmart.com | Save Money. Live Better";
    String actualHomePageTitle = getCurrentTitle();
    Assert.assertEquals(expectedHomePageTitle, actualHomePageTitle);
    LOG.info("land to walmart webpage successfully");

    homePage.selectOptionFromMenuDropdown("java");
    homePage.searchItem("java");

    String expectedSearchPageTitle = "Amazon.com : java";
    String actualSearchPageTitle = getCurrentTitle();
    Assert.assertEquals(expectedSearchPageTitle, actualSearchPageTitle);
    LOG.info("java search title validation success");
  }
}


