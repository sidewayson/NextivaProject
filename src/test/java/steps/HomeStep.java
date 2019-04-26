package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;


public class HomeStep extends BaseUtil{

    private  BaseUtil base;

    public HomeStep(BaseUtil base) {
        this.base = base;
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheCorrectPricing() throws Throwable {


        Assert.assertEquals("Its displayed", base.Driver.findElement(By.id("details")).isDisplayed(), true);
    }

    @Given("^I navigate to the Nextiva$")
    public void iNavigateToTheHomePage() throws Throwable {


        System.out.println("Navigate Nextiva Page");
        base.Driver.navigate().to("https://www.nextiva.com/");
    }


    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        HomePage page = new HomePage(base.Driver);
        page.ClickLogin();
    }

    @And("^I navigate to the Voip Products$")
    public void iClickOnTheVoipProducts() throws Throwable {
        HomePage page = new HomePage(base.Driver);
        page.ClickProduct();
    }

    @And("^I click on Office Products$")
    public void iClickOnTheOfficeProducts() throws Throwable {
        HomePage page = new HomePage(base.Driver);
        base.Driver.get("https://www.nextiva.com/products/voip-phone-system.html");
        page.ClickOfficeProduct();
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForHome(DataTable table) throws Throwable {
        //Create an ArrayList
        List<User> users =  new ArrayList<User>();
        //Store all the users
        users = table.asList(User.class);

        HomePage page = new HomePage(base.Driver);

       // for (User user: users){
        //    page.Login(user.username, user.password);
        //}
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) throws Throwable {
        System.out.println("UserName is : " + userName);
        System.out.println("Password is : " + password);
    }

    @Then("^I should see the userform page wrongly$")
    public void iShouldSeeTheUserformPageWrongly() throws Throwable {
        Assert.assertEquals("Its not displayed", base.Driver.findElement(By.id("sdfgdsfsd")).isDisplayed(), false);
    }


    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username= userName;
            password = passWord;
        }
    }

}
