package steps;

import Base.BaseUtil;
import com.aventstack.extentreports.GherkinKeyword;
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



    @Given("^I navigate to the Nextiva$")
    public void iNavigateToTheHomePage() throws Throwable {

        //scenarioDef.createNode(new GherkinKeyword("Given"),"I navigate to the Nextiva");
        System.out.println("Navigate Nextiva Page");
        base.Driver.navigate().to("https://www.nextiva.com/");
    }




    @And("^I navigate to the Voip Products$")
    public void iClickOnTheVoipProducts() throws Throwable {
        //scenarioDef.createNode(new GherkinKeyword("And"),"I navigate to the Voip Products");
        HomePage page = new HomePage(base.Driver);
        page.ClickProduct();
    }

    @And("^I click on Office Products$")
    public void iClickOnTheOfficeProducts() throws Throwable {
        //scenarioDef.createNode(new GherkinKeyword("And"),"I click on Office Products");
        HomePage page = new HomePage(base.Driver);
        base.Driver.get("https://www.nextiva.com/products/voip-phone-system.html");
        page.ClickOfficeProduct();
    }


}
