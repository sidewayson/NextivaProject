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
import pages.CareersPage;
import java.util.ArrayList;
import java.util.List;


public class CareerStep extends BaseUtil{

    private  BaseUtil base;

    public CareerStep(BaseUtil base) {
        this.base = base;
    }


    @And("^I click on careers$")
    public void iClickCareers() throws Throwable {
        //scenarioDef.createNode(new GherkinKeyword("And"),"I navigate to the Nextiva");
        CareersPage page = new CareersPage(base.Driver);
        base.Driver.get("https://www.nextiva.com/company/careers.html");
        page.ClickJob();
    }

    @Then("^I fill out Application for Nextiva job for SR. QA$")
    public void iFilloutApplication() throws Throwable {
        //scenarioDef.createNode(new GherkinKeyword("Then"),"I fill out Application for Nextiva job for SR. QA");
        CareersPage page = new CareersPage(base.Driver);
        base.Driver.get("https://boards.greenhouse.io/nextiva/jobs/4148378002");
        page.ClickAndFillOut();
    }





}
