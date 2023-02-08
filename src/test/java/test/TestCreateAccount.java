package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAccount;

public class TestCreateAccount extends CommonAPI {

   Logger LOG = LogManager.getLogger(TestCreateAccount.class.getName());

   @Test
    public void createAccount() throws InterruptedException {
       CreateAccount createAccount = new CreateAccount(getDriver());


       String expectedHomePage = "Target : Expect More. Pay Less.";
       String actualHomePage = getCurrentTitle();
       Assert.assertEquals(actualHomePage, expectedHomePage);
       LOG.info("land to target page success");
       Thread.sleep(3000);

       createAccount.getClickOnSignInBtn();
       Thread.sleep(3000);
       createAccount.ClickOnCreateAcBtn();
       Thread.sleep(3000);
       createAccount.typeEmailAddress("ksdkfjjg@gmail.com");
       Thread.sleep(3000);
       createAccount.typeFirstName("robiul");
       Thread.sleep(3000);
       createAccount.typeLastName("rruu");
       Thread.sleep(3000);
       createAccount.typeCreatePasswordField("kjdjajfklas1234");
       Thread.sleep(3000);
       createAccount.setClickOnFinalCreateBtn();
       Thread.sleep(3000);
       String expectedTitle = "Login: Target";
       String actualTitle = getCurrentTitle();
       Assert.assertEquals(actualTitle, expectedTitle);
       LOG.info("Account create validation success");
   }

}
